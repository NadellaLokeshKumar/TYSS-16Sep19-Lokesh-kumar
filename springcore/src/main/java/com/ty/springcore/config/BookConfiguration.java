package com.ty.springcore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ty.springcore.di.Author;
import com.ty.springcore.di.Book;

@Configuration
public class BookConfiguration {

	@Bean(name="book")
	public Book getBook() {
		Book book = new Book();
		book.setName("SQL");
		book.setPrice(25000);
		return book;
	}
	
	@Bean(name="author")
	public Author getAuthor() {
		
		Author author = new Author();
		author.setName("Naveen");
		author.setPenName("Montex");
		return author;
	}
}
