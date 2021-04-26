package com.ashokit.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashokit.entity.OrderDetailsEntity;

public interface OrderDetailsRepo extends JpaRepository<OrderDetailsEntity, Serializable> {

}
