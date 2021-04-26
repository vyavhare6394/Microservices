package com.ashokit.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashokit.entity.BookEntity;

public interface BookRepository extends JpaRepository<BookEntity, Serializable> {

}
