package com.ashokit;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ashokit.bindings.Book;
import com.ashokit.service.BookService;

@Controller
@RequestMapping("/book")
public class BookController {

	@Autowired
	private BookService bookService;

	@GetMapping(value = { "/", "/bookForm" })
	public String loadForm(Model model) {
		Book b = new Book();
		model.addAttribute("book", b);
		return "addBook";
	}

	@PostMapping(value = "/addBook")
	public String handleaddBookBtn(@ModelAttribute("book") Book book, Model model) {
		boolean isSaved = bookService.saveBook(book);

		String msg = "";

		if (isSaved) {
			msg = "Book Added Successfully";
		} else {
			msg = "Failed to Add Book";
		}

		model.addAttribute("msg", msg);

		return "addBook";
	}

	@GetMapping("/viewBooks")
	public String viewAllBooks(Model model) {
		List<Book> booksList = bookService.getAllBooks();
		model.addAttribute("books", booksList);
		return "viewBooks";
	}

}
