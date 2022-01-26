package com.capg.BookStoreManagement.beans;

public class Book implements Comparable<Book>{
	private int isbn;
	private String title;
	private String author;
	private int price;
	private int qty;

	public Book(int isbn,String title,String author,int price,int qty) {
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.price = price;
		this.qty = qty;
	}
	
	public int getIsbn() {
		return isbn;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public int getPrice() {
		return price;
	}
	
	public int getQty() {
		return qty;
	}
	
public int compareTo(Book b) {
		
		
		return this.isbn-b.isbn;
		}
}
