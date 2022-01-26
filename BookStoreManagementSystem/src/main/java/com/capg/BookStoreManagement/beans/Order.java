package com.capg.BookStoreManagement.beans;

public class Order {
	public int userId;
	public int bookIsbn;
	public String bookTitle;
	public int bookQuantity;
	public int totalPrice;
	public int orderId;
	public String orderDate;
	
	public Order(int userId,int bookIsbn,String bookTitle,int bookQuantity,int totalPrice,int orderId,String orderDate) {
		this.userId = userId;
		this.bookIsbn = bookIsbn;
		this.bookTitle = bookTitle;
		this.bookQuantity = bookQuantity;
		this.totalPrice = totalPrice;
		this.orderId = orderId;
		this.orderDate = orderDate;
	}
	
	public int getUserId() {
		return userId;
	}
	
	public int getBookIsbn() {
		return bookIsbn;
	}
	
	public String getBookTitle() {
		return bookTitle;
	}
	
	public int getBookQuantity() {
		return bookQuantity;
	}
	
	public int getTotalPrice() {
		return totalPrice;
	}
	
	public int getOrderId() {
		return orderId;
	}
	
	public String getOrderDate() {
		return orderDate;
	}
	
}