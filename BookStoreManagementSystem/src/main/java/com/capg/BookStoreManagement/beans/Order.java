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
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getBookIsbn() {
		return bookIsbn;
	}
	public void setBookIsbn(int bookIsbn) {
		this.bookIsbn = bookIsbn;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public int getBookQuantity() {
		return bookQuantity;
	}
	public void setBookQuantity(int bookQuantity) {
		this.bookQuantity = bookQuantity;
	}
	public int getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	
	@Override
	public String toString() {
		return "Order [userId=" + userId + ", bookIsbn=" + bookIsbn + ",bookTitle=" + bookTitle
				+ ", bookQuantity=" + bookQuantity + ", TotalPrice=" + totalPrice +", orderId=" + orderId +", orderDate=" + orderDate + "]";
	}
}
