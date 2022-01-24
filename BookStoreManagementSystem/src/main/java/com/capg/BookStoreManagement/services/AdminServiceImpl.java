package com.capg.BookStoreManagement.services;
import java.util.*;
import com.capg.BookStoreManagement.beans.Admin;
import com.capg.BookStoreManagement.beans.Book;
import com.capg.BookStoreManagement.beans.Order;
import com.capg.BookStoreManagement.beans.User;
import com.capg.BookStoreManagement.dao.AdminDAO;
import com.capg.BookStoreManagement.dao.AdminDAOImpl;
import com.capg.BookStoreManagement.exception.InvalidBookException;
import com.capg.BookStoreManagement.exception.InvalidOrderException;
import com.capg.BookStoreManagement.exception.InvalidUserException;

public class AdminServiceImpl implements AdminService{
	Admin as=new Admin();
	AdminDAO ad=new AdminDAOImpl();
	/*public boolean doValidateAdmin(String adminName,String adminPassword) {
		if(adminName.equals(as.UserNameSaved) && adminPassword.equals(as.PasswordSaved)) {
			return true;
		}
		else {
			return false;
		}
	}*/
	public boolean doAddUser(User user)throws InvalidUserException {
		// TODO Auto-generated method stub
		//if(user!=null) {
			//if(user.getUserId()>=1 && user.getUserName()!=null) {
				boolean isUserAdded=ad.doAddUser(user);
				return isUserAdded;
			//}
		//}
		//return false;
	}
	//public boolean doModifyUser(int userId, String userName, String userPwd, String userEmail, String userAddress,int userPhone) throws InvalidUserException {
		// TODO Auto-generated method stub
	public boolean doModifyUser(User user)throws InvalidUserException {
				boolean isUserModified=ad.doModifyUser(user);
				return isUserModified;
			
	}
	public boolean doDeleteUser(int userId) throws InvalidUserException {
		// TODO Auto-generated method stub
			boolean isBookDeleted=ad.doDeleteUser(userId);
			return isBookDeleted;
	}
	
	public User doSearchUser(int userID) throws InvalidUserException{
		User isUserSearch=ad.doSearchUser(userID);
		return isUserSearch;
	}
	
	public User doSearchUser(String userName) throws InvalidUserException{
		User isUserSearch=ad.doSearchUser(userName);
		return isUserSearch;
	}
	
	/*public boolean doManageStocks() {
		// TODO Auto-generated method stub
		return false;
	}*/
	//public boolean doAddBooks(int isbn, String title, String author, int price, int qty) throws InvalidBookException {
	public boolean doAddBooks(Book book) throws InvalidBookException{
		// TODO Auto-generated method stub
				boolean isBookAdded=ad.doAddBooks(book);
				return isBookAdded;
	}
	
	 public boolean doDeleteBooks(int isbn) throws InvalidBookException{
		 boolean isBookDeleted=ad.doDeleteBooks(isbn);
			return isBookDeleted;
	 }
	//public boolean doEditBooks(int isbn, String title, String author, int price, int qty) throws InvalidBookException {
	public boolean doEditBooks(Book book) throws InvalidBookException{
		// TODO Auto-generated method stub
				boolean isBookEdited=ad.doEditBooks(book);
				return isBookEdited;
	}
	
	public Book doSearchBook(int Isbn) throws InvalidBookException{
		Book isBookSearch=ad.doSearchBook(Isbn);
		return isBookSearch;
	}
	public Book doSearchBook(String author) throws InvalidBookException{
		Book isBookSearch=ad.doSearchBook(author);
		return isBookSearch;
	}
	public Book searchByBookTitle(String title) throws InvalidBookException{
		Book isBookSearch=ad.searchByBookTitle(title);
		return isBookSearch;
	}
	
	public List<User> getUsersByUserId() throws InvalidUserException {
		// TODO Auto-generated method stub
		List<User> allBooks=ad.getUsersByUserId();
		return allBooks;
	}
	public List<User> getUsersByUserIdDesc() throws InvalidUserException {
		// TODO Auto-generated method stub
		List<User> allBooks=ad.getUsersByUserIdDesc();
		return allBooks;
	}
	public List<User> getUsersByUserName() throws InvalidUserException {
		// TODO Auto-generated method stub
		List<User> allBooks=ad.getUsersByUserName();
		return allBooks;
	}
	public List<User> getUsersByUserNameDesc() throws InvalidUserException {
		// TODO Auto-generated method stub
		List<User> allBooks=ad.getUsersByUserNameDesc();
		return allBooks;
	}
	
	public List<User> getUsersByRange(int userId1,int userId2)
	{
		List<User> allUsers=null;
		if(userId1<userId2)
		{
			allUsers=ad.getUsersByRange(userId1,userId2);
			return allUsers;
		}
		else
		{
			return null;
		}
	}
	
	public List<Book> getBooksByIsbn() throws InvalidBookException {
		// TODO Auto-generated method stub
		List<Book> allBooks=ad.getBooksByIsbn();
		return allBooks;
	}
	public List<Book> getBooksByIsbnDesc() throws InvalidBookException {
		// TODO Auto-generated method stub
		List<Book> allBooks=ad.getBooksByIsbnDesc();
		return allBooks;
	}
	public List<Book> getBooksByTitle() throws InvalidBookException {
		// TODO Auto-generated method stub
		List<Book> allBooks=ad.getBooksByTitle();
		return allBooks;
	}
	public List<Book> getBooksByTitleDesc() throws InvalidBookException {
		// TODO Auto-generated method stub
		List<Book> allBooks=ad.getBooksByTitleDesc();
		return allBooks;
	}
	public List<Book> getBooksByAuthor() throws InvalidBookException {
		// TODO Auto-generated method stub
		List<Book> allBooks=ad.getBooksByAuthor();
		return allBooks;
	}
	public List<Book> getBooksByAuthorDesc() throws InvalidBookException {
		// TODO Auto-generated method stub
		List<Book> allBooks=ad.getBooksByAuthorDesc();
		return allBooks;
	}
	public List<Book> getBooksByPrice()
	{
		List<Book> allBooks=ad.getBooksByPrice();
		return allBooks;
	}
	public List<Book> getBooksByPriceDesc() throws InvalidBookException {
		// TODO Auto-generated method stub
		List<Book> allBooks=ad.getBooksByPriceDesc();
		return allBooks;
	}
	public List<Book> getBooksByQuantity() throws InvalidBookException {
		// TODO Auto-generated method stub
		List<Book> allBooks=ad.getBooksByQuantity();
		return allBooks;
	}
	public List<Book> getBooksByQuantityDesc() throws InvalidBookException {
		// TODO Auto-generated method stub
		List<Book> allBooks=ad.getBooksByQuantityDesc();
		return allBooks;
	}
	
	public int doCalculateTotal(int orders) {
		// TODO Auto-generated method stub
		return 0;
	}
	public List<Order> getOrdersByOrderId() throws InvalidOrderException {
		// TODO Auto-generated method stub
		List<Order> allOrders=ad.getOrdersByOrderId();
		return allOrders;
	}
	public List<Order> getOrdersByOrderIdDesc() throws InvalidOrderException {
		// TODO Auto-generated method stub
		List<Order> allOrders=ad.getOrdersByOrderIdDesc();
		return allOrders;
	}
	public List<Order> getOrdersByUserId() throws InvalidOrderException {
		// TODO Auto-generated method stub
		List<Order> allOrders=ad.getOrdersByUserId();
		return allOrders;
	}
	public List<Order> getOrdersByUserIdDesc() throws InvalidOrderException {
		// TODO Auto-generated method stub
		List<Order> allOrders=ad.getOrdersByUserIdDesc();
		return allOrders;
	}
	public List<Order> getOrdersByOrderDate() throws InvalidOrderException {
		// TODO Auto-generated method stub
		List<Order> allOrders=ad.getOrdersByOrderDate();
		return allOrders;
	}
	public List<Order> getOrdersByOrderDateDesc() throws InvalidOrderException {
		// TODO Auto-generated method stub
		List<Order> allOrders=ad.getOrdersByOrderDateDesc();
		return allOrders;
	}
	public  List<Order> doSearchOrderByOrderDate(String orderDate) throws InvalidOrderException {
		// TODO Auto-generated method stub
		 List<Order> isOrderSearch=ad.doSearchOrderByOrderDate(orderDate);
		return isOrderSearch;
	}
	public List<Order> doSearchOrderByOrderId(int orderId) throws InvalidOrderException {
		// TODO Auto-generated method stub
		List<Order> isOrderSearch=ad.doSearchOrderByOrderId(orderId);
		return isOrderSearch;
	}
	public List<Order> doSearchOrderByUserId(int userId) throws InvalidOrderException {
		// TODO Auto-generated method stub
		List<Order> isOrderSearch=ad.doSearchOrderByUserId(userId);
		return isOrderSearch;
	}
}
