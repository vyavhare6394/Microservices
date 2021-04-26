package com.ashokit.service;

import java.util.List;

import com.ashokit.bindings.Book;

public interface BookService {

	public boolean saveBook(Book book);

	public List<Book> getAllBooks();

}
