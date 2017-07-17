package com.cd.coe.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cd.coe.model.Book;



public interface BookService {
	
	//void saveBook(Book Book);
	
	public List<Book> listbooks();
	
	Book findBook(int bookID);
	
	boolean addBook(int bookID,String bookName, String categoryName, String authorName);
	boolean issueBook(int bookID, int userID);
	
	boolean returnBook(int bookID, Integer userId);
	
	
	
	 
}
