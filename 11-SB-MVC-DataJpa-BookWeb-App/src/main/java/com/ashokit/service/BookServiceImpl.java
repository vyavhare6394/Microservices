package com.ashokit.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashokit.bindings.Book;
import com.ashokit.entity.BookEntity;
import com.ashokit.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookRepository bookRepo;

	@Override
	public boolean saveBook(Book book) {

		// we got data in binding class obj to save

		// to save we should call repo.save(T entity) which expects entity obj with data

		// Copy data from binding obj to entity object
		BookEntity entity = new BookEntity();

		BeanUtils.copyProperties(book, entity);

		BookEntity savedEntity = bookRepo.save(entity);

		return savedEntity.getBookId() != null;
	}

	@Override
	public List<Book> getAllBooks() {
		List<Book> books = new ArrayList<Book>();

		List<BookEntity> entityList = bookRepo.findAll();
		
		entityList.forEach(entity ->{
			Book b = new Book();
			//BeanUtils.copyProperties(entity, b);
			b.setBookId(entity.getBookId());
			b.setBookName(entity.getBookName());
			b.setBookPrice(entity.getBookPrice());
			b.setAuthorName(entity.getAuthorName());
			books.add(b);
		});
		
		return books;
	}

}
