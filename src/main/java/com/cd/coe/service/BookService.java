package com.cd.coe.service;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cd.coe.model.Book;



public interface BookService {
	
	//void saveBook(Book Book);
	
	
	
	Book findBook(int bookID);
	
	boolean addBook(int bookID,String bookName, String categoryName, String authorName, String publisherName, String isbn, double price, int pages, Date purchaseDate,int edition, double rent, int quantity);
	
	boolean issueBook(int bookID, int edition,int userID, Date issueDate, Date dueDate, double baseRent, int status);
	
	boolean returnBook(int bookID, int userID);

	List<Book> listBooks();
	
	
	
	 
}
