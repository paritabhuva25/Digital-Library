package com.cd.coe.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
@Table(name="publisher")
public class Publisher {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int publisherID;
	
	@Size(min=3, max=50)
	@Column(name = "publisherName", nullable = true)
	private String publisherName;

	public Publisher(String publisherName) {
		// TODO Auto-generated constructor stub
		this.publisherName = publisherName;
	}

	public Publisher() {
		// TODO Auto-generated constructor stub
	}

	public int getPublisherID() {
		return publisherID;
	}

	public void setPublisherID(int publisherID) {
		this.publisherID = publisherID;
	}

	public String getPublisherName() {
		return publisherName;
	}

	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}
	
	

	

	

}
