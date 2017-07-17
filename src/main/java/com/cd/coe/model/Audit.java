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
@Table(name="audit")
public class Audit {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int auditID;
	
	@Size(min=3, max=50)
	@Column(name = "userID", nullable = true)
	private int userID;
	
	@Size(min=3, max=50)
	@Column(name = "transactionName", nullable = true)
	private String transactionName;

	@Size(min=3, max=50)
	@Column(name = "transactionTime", nullable = true)
	private String transactionTime;
	
	@Size(min=3, max=50)
	@Column(name = "status", nullable = true)
	private boolean status;
	
	@Size(min=3, max=50)
	@Column(name = "auditDesc", nullable = true)
	private String auditDesc;

	public int getAuditID() {
		return auditID;
	}

	public void setAuditID(int auditID) {
		this.auditID = auditID;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getTransactionName() {
		return transactionName;
	}

	public void setTransactionName(String transactionName) {
		this.transactionName = transactionName;
	}

	public String getTransactionTime() {
		return transactionTime;
	}

	public void setTransactionTime(String transactionTime) {
		this.transactionTime = transactionTime;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getAuditDesc() {
		return auditDesc;
	}

	public void setAuditDesc(String auditDesc) {
		this.auditDesc = auditDesc;
	}
	
	

	

	

}
 