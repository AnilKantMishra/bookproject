package com.api.book.springboot_restbook.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "books")
public class Book {
	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String booktitle;
	private String author;

	

	public Book(int id, String booktitle, String author) {
		super();
		this.id = id;
		this.booktitle = booktitle;
		this.author = author;
	}


	public Book() {
		
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getBooktitle() {
		return booktitle;
	}


	public void setBooktitle(String booktitle) {
		this.booktitle = booktitle;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}
	
	
	@Override
	public String toString() {
		return "Book [id=" + id + ", booktitle=" + booktitle + ", author=" + author + "]";
	}
}
