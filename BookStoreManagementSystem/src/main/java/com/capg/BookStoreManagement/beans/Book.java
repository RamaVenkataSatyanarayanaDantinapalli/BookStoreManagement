package com.capg.BookStoreManagement.beans;

public class Book implements Comparable<Book>{
	private int isbn;
	private String title;
	private String author;
	private int price;
	private int qty;
	
	/*public Book() {
		super();
	}*/
	public Book(int isbn,String title,String author,int price,int qty) {
		//super();
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
	/*@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", title=" + title + ", author=" + author + ", price=" + price + ", qty=" + qty
				+ "]";
	}
	@Override
	public int hashCode() {
		System.out.println(" hashcode method called for "+title+"- "+isbn);
		return isbn+title.length()+author.length()+price+qty;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println(" equals method called for "+title+"- "+isbn);
		if(obj instanceof Book)
		{
			Book tempLaptop = (Book) obj;
			
			boolean a = (this.isbn == tempLaptop.isbn);
			boolean b = (this.title.equals(tempLaptop.title));
			boolean c = (this.author.equals(tempLaptop.author));
			boolean d = (this.price == tempLaptop.price);
			boolean e = (this.qty == tempLaptop.qty);
			
			return a&&b&&c&&d&&e;
		}
		else return false;
	}*/
	
	//	@Override
	
	
}
