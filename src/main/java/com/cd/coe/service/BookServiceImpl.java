package com.cd.coe.service;

import java.util.Date;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cd.coe.dao.BookDao;
import com.cd.coe.model.Author;
import com.cd.coe.model.Book;

@Service("bookService")
public class BookServiceImpl implements BookService{
	
	@Autowired
	private BookDao dao;
	
	public List<Book> listBooks() {
	  return dao.listBooks();
	}

	
	public Book findBook(int bookID) {
		// TODO Auto-generated method stub
		return dao.findBook(bookID);
	}

	public boolean addBook(String bookName, String categoryName, Set<Author> authors1, String publisherName,
			String isbn, double price, int pages, Date purchaseDate, int edition, double rent, int quantity) {
		// TODO Auto-generated method stub
		
		dao.addBook(bookName, categoryName,authors1,  publisherName,
				isbn, price,pages,purchaseDate,edition,  rent,  quantity);
		return true;
	}

	public boolean issueBook(int bookID, int edition, int userID, Date issueDate, Date dueDate, double baseRent,
			int status) {
		// TODO Auto-generated method stub
		dao.issuebook(bookID,edition,userID, issueDate,dueDate, baseRent,status);
		return false;
	}

	public boolean returnBook(int bookID, int userID) {
		// TODO Auto-generated method stub
		return false;
	}
	

}
