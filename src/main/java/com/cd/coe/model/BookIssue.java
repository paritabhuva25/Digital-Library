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
@Table(name="issue")
public class BookIssue {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int issueID;
	
	@Size(min=3, max=50)
	@Column(name = "userID", nullable = true)
	private int userID;

	@Size(min=3, max=50)
	@Column(name = "editionID", nullable = true)
	private int editionID;

	@Size(min=3, max=50)
	@Column(name = "issueDate", nullable = true)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date issueDate;

	@Size(min=3, max=50)
	@Column(name = "dueDate", nullable = true)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date dueDate;

	@Size(min=3, max=50)
	@Column(name = "returnDate", nullable = true)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date returnDate;
	
	@Size(min=3, max=50)
	@Column(name = "fineAmount", nullable = true)
	private int fineAmount;
	
	@Size(min=3, max=50)
	@Column(name = "baseRent", nullable = true)
	private int baseRent;

	@Size(min=3, max=50)
	@Column(name = "status", nullable = true)
	private int status;

	@Size(min=3, max=50)
	@Column(name = "amountPaid", nullable = true)
	private int amountPaid;

	public int getIssueID() {
		return issueID;
	}

	public void setIssueID(int issueID) {
		this.issueID = issueID;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public int getEditionID() {
		return editionID;
	}

	public void setEditionID(int editionID) {
		this.editionID = editionID;
	}

	public Date getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public Date getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}

	public int getFineAmount() {
		return fineAmount;
	}

	public void setFineAmount(int fineAmount) {
		this.fineAmount = fineAmount;
	}

	public int getBaseRent() {
		return baseRent;
	}

	public void setBaseRent(int baseRent) {
		this.baseRent = baseRent;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getAmountPaid() {
		return amountPaid;
	}

	public void setAmountPaid(int amountPaid) {
		this.amountPaid = amountPaid;
	}

		

	

	

}
