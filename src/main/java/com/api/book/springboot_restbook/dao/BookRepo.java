package com.api.book.springboot_restbook.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.api.book.springboot_restbook.entities.Book;

@Repository
public interface BookRepo extends CrudRepository<Book, Integer>{
	
	

}
