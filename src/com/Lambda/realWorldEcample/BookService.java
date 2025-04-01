package com.Lambda.realWorldEcample;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookService {

	// Normal Apporach
	public List<Book> getBooksInSort() {
		List<Book> books = new BookDao().getBook();
		Collections.sort(books, new MyComparator());
		return books;
	}
	
	//Anonymous Functions
	public List<Book> getBookInSortVersion02() {
		List<Book> books = new BookDao().getBook();
		Collections.sort(books, new Comparator<Book>() {

			@Override
			public int compare(Book o1, Book o2) {
				// TODO Auto-generated method stub
				return o2.getName().compareTo(o1.getName());
			}
		});
		return  books;
	}
	
	//Lambda Method
	public List<Book> getBookInSortVersion03() {
		List<Book> books = new BookDao().getBook();
		Collections.sort(books, (o1, o2) ->  o1.getName().compareTo(o2.getName()));
		return  books;
	}
	public static void main(String[] args) {
		System.out.println(new BookService().getBookInSortVersion03());
	}
	
}

class MyComparator implements Comparator<Book>{

	@Override
	public int compare(Book o1, Book o2) {
		// TODO Auto-generated method stub
		return o2.getName().compareTo(o1.getName());
	}
	
}
