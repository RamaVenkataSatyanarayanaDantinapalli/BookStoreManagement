package com.capg.BookStoreManagement.services;

import java.util.List;

import com.capg.BookStoreManagement.beans.Book;
import com.capg.BookStoreManagement.beans.Order;
import com.capg.BookStoreManagement.beans.User;
import com.capg.BookStoreManagement.exception.InvalidBookException;
import com.capg.BookStoreManagement.exception.InvalidOrderException;
import com.capg.BookStoreManagement.exception.InvalidUserException;

public interface AdminService {
	//public boolean doValidateAdmin(String username,String password);
	public boolean doAddUser(User user) throws InvalidUserException;
	//public boolean doAddUser(int userId,String userName,String userPwd,String userEmail,String userAddress,int userPhone) throws InvalidUserException;
    //public boolean doModifyUser(int userId,String userName,String userPwd,String userEmail,String userAddress,int userPhone) throws InvalidUserException;
	public boolean doModifyUser(User user)throws InvalidUserException;
	public boolean doDeleteUser(int userId) throws InvalidUserException;
    public boolean doAddBooks(Book book) throws InvalidBookException;
    //public boolean doAddBooks(int isbn,String title,String author,int price,int qty) throws InvalidBookException;
    //public boolean doEditBooks(int isbn,String title,String author,int price,int qty) throws InvalidBookException;
    public boolean doEditBooks(Book book) throws InvalidBookException;
    public boolean doDeleteBooks(int isbn) throws InvalidBookException;
    public User doSearchUser(int userId) throws InvalidUserException;
    public User doSearchUser(String userName) throws InvalidUserException;
    public Book doSearchBook(int isbn) throws InvalidBookException;
    public Book searchByBookTitle(String title) throws InvalidBookException;
    public Book doSearchBook(String author) throws InvalidBookException;
    
    public List<User> getUsersByUserId() throws InvalidUserException;
    public List<User> getUsersByUserIdDesc() throws InvalidUserException;
    public List<User> getUsersByUserName() throws InvalidUserException;
    public List<User> getUsersByUserNameDesc() throws InvalidUserException;
    public List<User> getUsersByRange(int userId1,int userId2) throws InvalidUserException;
    
    public List<Book> getBooksByIsbn() throws InvalidBookException;
    public List<Book> getBooksByIsbnDesc() throws InvalidBookException;
    public List<Book> getBooksByTitle() throws InvalidBookException;
    public List<Book> getBooksByTitleDesc() throws InvalidBookException;
    public List<Book> getBooksByAuthor() throws InvalidBookException;
    public List<Book> getBooksByAuthorDesc() throws InvalidBookException;
    public List<Book> getBooksByPrice() throws InvalidBookException;
    public List<Book> getBooksByPriceDesc() throws InvalidBookException;
    public List<Book> getBooksByQuantity() throws InvalidBookException;
    public List<Book> getBooksByQuantityDesc() throws InvalidBookException;
    
    public List<Order> getOrdersByOrderId() throws InvalidOrderException;
    public List<Order> getOrdersByOrderIdDesc() throws InvalidOrderException;
    public List<Order> getOrdersByUserId() throws InvalidOrderException;
    public List<Order> getOrdersByUserIdDesc() throws InvalidOrderException;
    public List<Order> getOrdersByOrderDate() throws InvalidOrderException;
    public List<Order> getOrdersByOrderDateDesc() throws InvalidOrderException;
    public  List<Order> doSearchOrderByOrderDate(String orderDate) throws InvalidOrderException;
    public List<Order> doSearchOrderByOrderId(int orderId) throws InvalidOrderException;
    public List<Order> doSearchOrderByUserId(int userId) throws InvalidOrderException;
    
    public int doCalculateTotal(int orders);
}
