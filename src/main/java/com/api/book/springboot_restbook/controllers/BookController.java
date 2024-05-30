package com.api.book.springboot_restbook.controllers;

import java.util.List;

import org.hibernate.dialect.MySQL8Dialect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.book.springboot_restbook.entities.Book;
import com.api.book.springboot_restbook.services.BookServices;

@RestController
public class BookController {

    
	@Autowired
	private BookServices bookservices;

	/*
	 * @RequestMapping(value = "/book",method = RequestMethod.GET)
	 * 
	 * @ResponseBody
	 */
	
	@GetMapping("/book")
 
    public List<Book> getbooks(){
    	
		/*
		 * Book book = new Book(); book.setId(1); book.setBooktitle("Jaava book");
		 * book.setAuthor("Anil");
		 * 
		 * return book;
		 */
		
	//		get all books
		return this.bookservices.getallbook();
    }
    
	@PostMapping("/book")
	public Book addbook(@RequestBody Book book) {
		
		this.bookservices.addBook(book);
		
		return book;
	}
	
	@DeleteMapping("/book/{bookid}")
	public void deletebook(@PathVariable("bookid") int bookid) {
		
		this.bookservices.deleteBook(bookid);
		
	}

	public void update(@PathVariable("bookid") int bookid) {
		
		this.bookservices.deleteBook(bookid);
		
	}
	
    
}
