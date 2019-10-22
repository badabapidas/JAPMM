package com.bada.list.benchmarking;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
//		Date start = new Date();
		// Specifying the initial size of an ArrayList List<Book> books = new
		// ArrayList<Book>(10000000);

//		List<Book> books = new ArrayList<Book>();
		List<Book> books = new LinkedList<Book>();
		for (int i = 0; i < 10000000; i++) {
			books.add(new Book(i, "Jane Eyre", "Charlotte Bronte", 14.99));
		}
		Date start = new Date();

		// fetching value from an arraylist is much more faster then linked list
		System.out.println(books.get(4956556));
		Date end = new Date();
		System.out.println("Elapsed time was " + (end.getTime() - start.getTime()) + " ms.");
	}
}
