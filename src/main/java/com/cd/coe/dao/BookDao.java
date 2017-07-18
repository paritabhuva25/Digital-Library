package com.cd.coe.dao;

import java.util.Date;
import java.util.List;

import com.cd.coe.model.Book;

public interface BookDao {
	
	
	    public List<Book> listBooks();

		public Book findBook(int bookID);

		public boolean addBook(int bookID, String bookName, String categoryName, String authorName, String publisherName, String isbn, double price, int pages, Date purchaseDate, int edition, double rent, int quantity);

		public void issuebook(int bookID, int edition, int userID, Date issueDate, Date dueDate, double baseRent,
				int status);

		
}
