package com.cd.coe.service;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import com.cd.coe.model.Author;
import com.cd.coe.model.Book;



public interface BookService {
	
	//void saveBook(Book Book);
	
	
	
	Book findBook(int bookID);
	
	boolean addBook(String bookName, String categoryName, Set<Author> authors1, String publisherName,
			String isbn, double price, int pages, Date purchaseDate, int edition, double rent, int quantity);
	
	boolean issueBook(int bookID, int edition,int userID, Date issueDate, Date dueDate, double baseRent, int status);
	
	boolean returnBook(int bookID, int userID);

	List<Book> listBooks();
	
	
	
	 
}
