package com.api.book.springboot_restbook.dao;

import org.springframework.data.repository.CrudRepository;

import com.api.book.springboot_restbook.entities.Book;

public interface BookRepo extends CrudRepository<Book, Integer>{
	
	public BookRepo findbyId(int id);

}
