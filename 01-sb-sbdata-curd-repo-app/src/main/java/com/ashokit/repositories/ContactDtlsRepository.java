package com.ashokit.repositories;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.ashokit.entities.ContactDtlsEnity;

public interface ContactDtlsRepository extends CrudRepository<ContactDtlsEnity, Serializable> {

	// select * from contact_dtls where c_name=?
	public ContactDtlsEnity findByContactName(String name);

	// select * from contact_dtls where c_num=?
	public ContactDtlsEnity findByContactNumber(Long number);

	// select * from contact_dtls where c_name=? and c_num=?
	public ContactDtlsEnity findByContactNameAndContactNumber(String name, Long number);

	@Query("select contactName from ContactDtlsEnity where contactId=:cid")
	public String getContactNameByContactId(String cid);
	
	@Query("from ContactDtlsEnity where contactName like 'S%'")
	public List<ContactDtlsEnity> getAllContactStartsWithSChar();
	
	@Query("select contactName from ContactDtlsEnity")
	public List<String> getAllContactNames();
	

}
