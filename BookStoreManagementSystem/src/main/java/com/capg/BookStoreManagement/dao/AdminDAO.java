package com.capg.BookStoreManagement.dao;
import java.util.List;

import com.capg.BookStoreManagement.beans.Book;
import com.capg.BookStoreManagement.beans.Order;
import com.capg.BookStoreManagement.beans.User;
public interface AdminDAO {
	//public boolean doAddUser(int userId,String userName,String userPwd,String userEmail,String userAddress,int userPhone);
	public boolean doAddUser(User user);
    //public boolean doModifyUser(int userId,String userName,String userPwd,String userEmail,String userAddress,int userPhone);
	public boolean doModifyUser(User user);
    public boolean doDeleteUser(int userId);
    //public boolean doAddBooks(long isbn,String title,String author,int price,int qty);
    public boolean doAddBooks(Book book);
   // public boolean doEditBooks(long isbn,String title,String author,int price,int qty);
    public boolean doEditBooks(Book book);
    public boolean doDeleteBooks(int isbn);
    public User doSearchUser(int userId);
    public User doSearchUser(String userName);
    public Book doSearchBook(int isbn);
    public Book searchByBookTitle(String title);
    public Book doSearchBook(String author);
    public List<User> getUsers();
    /*public List<User> getUsersByUserIdDesc();
    public List<User> getUsersByUserName();
    public List<User> getUsersByUserNameDesc();*/
    public List<User> getUsersByRange(int userId1,int userId2);
    public List<Book> getBooks();
    /*public List<Book> getBooksByIsbnDesc();
    public List<Book> getBooksByTitle();
    public List<Book> getBooksByTitleDesc();
    public List<Book> getBooksByAuthor();
    public List<Book> getBooksByAuthorDesc();
    public List<Book> getBooksByPrice();
    public List<Book> getBooksByPriceDesc();
    public List<Book> getBooksByQuantity();
    public List<Book> getBooksByQuantityDesc();*/
    
    public List<Order> getOrders();
   /* public List<Order> getOrdersByOrderIdDesc();
    public List<Order> getOrdersByUserId();
    public List<Order> getOrdersByUserIdDesc();
    public List<Order> getOrdersByOrderDate();
    public List<Order> getOrdersByOrderDateDesc();*/
    public List<Order> doSearchOrderByOrderDate(String orderDate);
    public List<Order> doSearchOrderByOrderId(int orderId);
    public List<Order> doSearchOrderByUserId(int userId);
    public int doCalculateTotal(int orders);
    
}
