package com.cd.coe.model;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;


@Entity
@Table(name="edition")
public class Edition {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int editionID;
	
	@Size(min=3, max=50)
	@Column(name = "bookID", nullable = true)
	private int bookID;
	
	@Size(min=3, max=50)
	@Column(name = "ISBN", nullable = true)
	private String ISBN;

	@Size(min=3, max=50)
	@Column(name = "bookPrice", nullable = true)
	private double bookPrice;
	
	@Size(min=3, max=50)
	@Column(name = "bookPage", nullable = true)
	private int bookPage;
	
	@Size(min=3, max=50)
	@Column(name = "purchaseDate", nullable = true)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date purchaseDate;
	
	@Size(min=3, max=50)
	@Column(name = "edition", nullable = true)
	private int edition;

	@Size(min=3, max=50)
	@Column(name = "rent", nullable = true)
	private double rent;

	@Size(min=3, max=50)
	@Column(name = "totalQuantity", nullable = true)
	private int totalQuantity;

	@Size(min=3, max=50)
	@Column(name = "avaiQuantity", nullable = true)
	private int avaiQuantity;

	public int getEditionID() {
		return editionID;
	}

	public void setEditionID(int editionID) {
		this.editionID = editionID;
	}

	public int getBookID() {
		return bookID;
	}

	public void setBookID(int bookID) {
		this.bookID = bookID;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		this.ISBN = iSBN;
	}

	public double getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}

	public int getBookPage() {
		return bookPage;
	}

	public void setBookPage(int bookPage) {
		this.bookPage = bookPage;
	}

	public Date getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public int getEdition() {
		return edition;
	}

	public void setEdition(int edition) {
		this.edition = edition;
	}

	public double getRent() {
		return rent;
	}

	public void setRent(double rent) {
		this.rent = rent;
	}

	public int getTotalQuantity() {
		return totalQuantity;
	}

	public void setTotalQuantity(int totalQuantity) {
		this.totalQuantity = totalQuantity;
	}

	public int getAvaiQuantity() {
		return avaiQuantity;
	}

	public void setAvaiQuantity(int avaiQuantity) {
		this.avaiQuantity = avaiQuantity;
	}

	public Edition(int bookID, String iSBN, double bookPrice, int bookPage, Date purchaseDate,
			int edition, double rent, int totalQuantity, int avaiQuantity) {
		super();
		this.bookID = bookID;
		this.ISBN = iSBN;
		this.bookPrice = bookPrice;
		this.bookPage = bookPage;
		this.purchaseDate = purchaseDate;
		this.edition = edition;
		this.rent = rent;
		this.totalQuantity = totalQuantity;
		this.avaiQuantity = avaiQuantity;
	}

	public Edition() {
		// TODO Auto-generated constructor stub
	}

	
	

	

	

}
 