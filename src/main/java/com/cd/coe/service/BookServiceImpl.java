package com.cd.coe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cd.coe.dao.BookDao;
import com.cd.coe.model.Book;

@Service("bookService")
public class BookServiceImpl implements BookService{
	
	@Autowired
	private BookDao dao;
	
	@Override
	 public List<Book> listBooks() {
	  return dao.findAll();
	}
	

}
