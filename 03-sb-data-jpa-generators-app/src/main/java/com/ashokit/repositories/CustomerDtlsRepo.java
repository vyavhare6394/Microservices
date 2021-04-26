package com.ashokit.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashokit.entities.CustomerDtlsEntity;

public interface CustomerDtlsRepo extends JpaRepository<CustomerDtlsEntity, Serializable> {

}
