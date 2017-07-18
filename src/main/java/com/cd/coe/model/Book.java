package com.cd.coe.model;


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

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bookID;
	
	@Size(min=3, max=50)
	@Column(name = "bookname", nullable = true)
	private String bookname;
	
	@NotNull
	@Column(name = "categoryID", unique=true, nullable = true)
	private int categoryID;
	
	@NotNull
	@Column(name = "publisherID", unique=true, nullable = true)
	private int publisherID;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "author_book", joinColumns = { @JoinColumn(name = "bookID") }, inverseJoinColumns = { @JoinColumn(name = "authorID") })

	public int getBookID() {
		return bookID;
	}

	public Book(int bookID, String bookname, int categoryID, int publisherID) {
		super();
		this.bookID = bookID;
		this.bookname = bookname;
		this.categoryID = categoryID;
		this.publisherID = publisherID;
	}

	public void setBookID(int bookID) {
		this.bookID = bookID;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public int getCategoryID() {
		return categoryID;
	}

	public void setCategoryID(int categoryID) {
		this.categoryID = categoryID;
	}

	public int getPublisherID() {
		return publisherID;
	}

	public void setPublisherID(int publisherID) {
		this.publisherID = publisherID;
	}

	

}
