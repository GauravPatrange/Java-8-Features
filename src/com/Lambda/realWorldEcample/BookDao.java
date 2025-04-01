package com.Lambda.realWorldEcample;

import java.util.ArrayList;
import java.util.List;

public class BookDao {

	public List<Book> getBook(){
		List<Book> books = new ArrayList<>();
		books.add(new Book(101,"Core Java", 300));
		books.add(new Book(102,"Hibernate ", 430));
		books.add(new Book(103,"Spring", 323));
		books.add(new Book(104,"Web Services", 600));
		
		return books;
	}
}
