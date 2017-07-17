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
@Table(name="cart")
public class Cart {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cartID;
	
	@Size(min=3, max=50)
	@Column(name = "editionID", nullable = true)
	private String editionID;
	
	@NotNull
	@Column(name = "userID", unique=true, nullable = true)
	private int userID;
	
	@NotNull
	@Column(name = "quantity", unique=true, nullable = true)
	private int quantity;
	
	@NotNull
	@Column(name = "isAlive", unique=true, nullable = true)
	private boolean isAlive;

	public int getCartID() {
		return cartID;
	}

	public void setCartID(int cartID) {
		this.cartID = cartID;
	}

	public String getEditionID() {
		return editionID;
	}

	public void setEditionID(String editionID) {
		this.editionID = editionID;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public boolean getIsAlive() {
		return isAlive;
	}

	public void setIsAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}


	

	

}
