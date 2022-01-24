package com.capg.BookStoreManagement.dao;

import java.util.List;

import com.capg.BookStoreManagement.beans.Book;
import com.capg.BookStoreManagement.beans.Cart;
import com.capg.BookStoreManagement.beans.Order;
import com.capg.BookStoreManagement.beans.User;

public interface UserDAO {
	
	//public boolean doRegisterUser(User user);
	public List<Book> getBooksByIsbn();
    public List<Book> getBooksByIsbnDesc();
    public List<Book> getBooksByTitle();
    public List<Book> getBooksByTitleDesc();
    public List<Book> getBooksByAuthor();
    public List<Book> getBooksByAuthorDesc();
    public List<Book> getBooksByPrice();
    public List<Book> getBooksByPriceDesc();
    public List<Book> getBooksByQuantity();
    public List<Book> getBooksByQuantityDesc();
    
    public Book doSearchBook(int isbn);
    public Book searchByBookTitle(String title);
    public Book doSearchBook(String author);
    
    public boolean doOrderBooks(Order od);
    public List<Order> viewOrdersByUseId(int UserId);
    
    public boolean doCartBooks(Cart ct);
    public List<Cart> DisplayCartOrders(int UserId);
    public boolean doCancelOrder(int UserId,int orderId);
    public boolean doEmptyCart(int UserId);
    public Integer doCalculateTotalOrderPrice(int UserId);
    public Integer GetOrderId();
    public String GetCurrentDate();
    
    public void doUpdateBooksTotal(int Isbn,int Qty);
    public Integer getTotalBooks(int Isbn);
    public Integer getOrderQty(int userId,int orderId,int Isbn);
    public List<Integer> getOrderIsbn(int userId,int orderId);
    public List<Order> getCanceledOrders(int userId,int orderId);
    public Integer doCalculateTotalCancelOrderPrice(int userId,int orderId);
    public Integer doCalculateTotalPrice(int isbn,int BookQty);
}
