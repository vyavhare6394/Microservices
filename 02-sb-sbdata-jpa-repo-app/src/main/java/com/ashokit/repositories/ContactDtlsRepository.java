package com.ashokit.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashokit.entities.ContactDtlsEnity;

public interface ContactDtlsRepository extends JpaRepository<ContactDtlsEnity, Serializable> {

}
