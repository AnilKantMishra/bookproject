package com.api.book.springboot_restbook.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.hibernate.metamodel.model.domain.internal.AbstractSqmPathSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.api.book.springboot_restbook.dao.BookRepo;
import com.api.book.springboot_restbook.entities.Book;

@Component
public class BookServices {

	@Autowired
	private BookRepo bookRepo;

	// no need now previously using for fake purpose now using db
	/*
	 * private static List<Book> list = new ArrayList<>();
	 * 
	 * 
	 * static{ list.add(new Book(2,"Java 2","JavaSangam")); list.add(new
	 * Book(3,"Java 3 ","JavaSangam")); list.add(new
	 * Book(4,"Java 4 ","JavaSangam")); list.add(new Book(5,"Java 5","JavaSangam"));
	 * }
	 */

	// get all books

	public List<Book> getallbook() {

		List<Book> books = (List<Book>) bookRepo.findAll();
		return books;

	}

	// get single book by id

	public Book getbookbyid(int id) {

		/*
		 * Book book = null;
		 * 
		 * book = list.stream().filter(e->e.getId()==id).findFirst().get(); return book;
		 */

		return (Book) bookRepo.findbyId(id);

	}

//	adding the book
	public Book addBook(Book book) {
		/* list.add(book); */
		
		  Book result = bookRepo.save(book); return result;
		 

	}

	public void deleteBook(int bookId) {
		// TODO Auto-generated method stub

		/* list.delete(bookId); */

		/*
		 * list.stream().filter(book->{ if(book.getId()==bookId) { return true; }else {
		 * return false; }
		 * 
		 * 
		 * }).collect(Collectors.toList());
		 */

		bookRepo.deleteById(bookId);

	}

	public void updateBook(Book book, int bookId) {
		// TODO Auto-generated method stub

		/* list.delete(bookId); */

		/*
		 * list.stream().filter(book->{ if(book.getId()==bookId) { return true; }else {
		 * return false; }
		 * 
		 * 
		 * }).collect(Collectors.toList());
		 * 
		 * 
		 */
		book.setId(bookId);
		bookRepo.save(book);

	}

}
