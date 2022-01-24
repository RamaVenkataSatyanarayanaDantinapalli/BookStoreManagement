package com.capg.BookStoreManagement.beans;

public class Cart {
	int userId;
	int bookIsbn;
	String bookTitle;
	int bookQuantity;
	int totalPrice;
	
	public Cart(int userId,int bookIsbn,String bookTitle,int bookQuantity,int totalPrice){
		this.userId = userId;
		this.bookIsbn = bookIsbn;
		this.bookTitle = bookTitle;
		this.bookQuantity = bookQuantity;
		this.totalPrice = totalPrice;
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
	
	@Override
	public String toString() {
		return "Order [userId=" + userId + ", bookIsbn=" + bookIsbn + ",bookTitle=" + bookTitle
				+ ", bookQuantity=" + bookQuantity + ", TotalPrice=" + totalPrice + "]";
		}
}
