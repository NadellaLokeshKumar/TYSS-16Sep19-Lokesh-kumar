package com.ty.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ty.springcore.config.BookConfiguration;
import com.ty.springcore.di.Author;
import com.ty.springcore.di.Book;

public class AnnotationApp2 {
public static void main(String[] args) {
	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BookConfiguration.class);
	Book book = context.getBean(Book.class);
	System.out.println(book.getName());
	System.out.println(book.getPrice());
	System.out.println(book.getAuthor().getName());
	System.out.println(book.getAuthor().getPenName());
	
	System.out.println("**********************");
	
	Author author = context.getBean(Author.class);
	System.out.println(author.getName());
	System.out.println(author.getPenName());
	context.close();
}
}
