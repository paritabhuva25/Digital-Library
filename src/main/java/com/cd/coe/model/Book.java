package com.cd.coe.model;


import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.persistence.JoinColumn;

@Entity
@Table(name="book")
public class Book {

	
	private int bookID;
	
	
	private String bookname;
	
	
	private int categoryID;
	
	
	private int publisherID;
	
	
	private Set<Author> authors;
	
	
		
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getBookID() {
		return bookID;
	}

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "author_book", joinColumns = { @JoinColumn(name = "bookID") }, inverseJoinColumns = { @JoinColumn(name = "authorID") })
	public Set<Author> getAuthors() {
		return authors;
	}

	public void setAuthors(Set<Author> authors) {
		this.authors = authors;
	}

	public void setBookID(int bookID) {
		this.bookID = bookID;
	}
	
	@Size(min=3, max=50)
	@Column(name = "bookname", nullable = true)
	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	
	@NotNull
	@Column(name = "categoryID", unique=true, nullable = true)
	public int getCategoryID() {
		return categoryID;
	}

	public void setCategoryID(int categoryID) {
		this.categoryID = categoryID;
	}
	@NotNull
	@Column(name = "publisherID", unique=true, nullable = true)
	public int getPublisherID() {
		return publisherID;
	}

	public void setPublisherID(int publisherID) {
		this.publisherID = publisherID;
	}

	public Book(int bookID, String bookname, int categoryID, int publisherID, Set<Author> authors) {
		super();
		this.bookID = bookID;
		this.bookname = bookname;
		this.categoryID = categoryID;
		this.publisherID = publisherID;
		this.authors = authors;
		
	}


	public Book() {
		// TODO Auto-generated constructor stub
	}
	

}
