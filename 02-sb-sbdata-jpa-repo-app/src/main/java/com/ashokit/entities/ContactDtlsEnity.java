package com.ashokit.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "CONTACT_DTLS")
@Data
public class ContactDtlsEnity {

	@Id
	@Column(name = "C_ID")
	private String contactId;

	@Column(name = "C_NAME")
	private String contactName;

	@Column(name = "C_NUM")
	private Long contactNumber;

}
