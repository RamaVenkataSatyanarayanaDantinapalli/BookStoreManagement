package com.capg.BookStoreManagement.services;

import java.sql.SQLException;
import java.util.List;

import com.capg.BookStoreManagement.beans.Book;
import com.capg.BookStoreManagement.beans.Cart;
import com.capg.BookStoreManagement.beans.Order;
import com.capg.BookStoreManagement.beans.User;
import com.capg.BookStoreManagement.dao.UserDAO;
import com.capg.BookStoreManagement.dao.UserDAOImpl;
import com.capg.BookStoreManagement.exception.InvalidBookException;
import com.capg.BookStoreManagement.exception.InvalidOrderException;
import com.capg.BookStoreManagement.exception.InvalidUserException;

public class UserServiceImpl implements UserService{
	
	UserDAOImpl ad=new UserDAOImpl();
	/*public boolean doValidateUser(int userId, String password) {
		// TODO Auto-generated method stub
		boolean isUserValid=ad.doUserValidation(userId,password);
		return isUserValid;
	}*/
	public boolean doAddUser(User user)throws InvalidUserException {
		boolean isUserModified=ad.doRegisterUser(user);
		return isUserModified;
		}
	public List<Book> getBooks() throws InvalidBookException {
		// TODO Auto-generated method stub
		List<Book> allBooks=ad.getBooks();
		return allBooks;
	}
	/*public List<Book> getBooksByIsbnDesc() throws InvalidBookException {
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
	}*/
	
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
	
	
	public boolean doOrderBooks(Order od) {
		boolean isBookOrdered=ad.doOrderBooks(od);
		return isBookOrdered;
	}
	
	public boolean doCartBooks(Cart od) {
		boolean isBookCarted=ad.doCartBooks(od);
		return isBookCarted;
	}
	
	public List<Order> viewOrdersByUseId(int UserId) {
		List<Order> allOrders=ad.viewOrdersByUseId(UserId);
		return allOrders;
	}
	
	public List<Cart> DisplayCartOrders(int UserId) {
		List<Cart> cartOrders=ad.DisplayCartOrders(UserId);
		return cartOrders;
	}
	public int doCalculateTotalPrice(int isbn,int qty) {
		int TotalPrice=ad.doCalculateTotalPrice(isbn,qty);
		return TotalPrice;
	}
	public Integer doCalculateTotalOrderPrice(int UserId) {
		int TotalOrderPrice=ad.doCalculateTotalOrderPrice(UserId);
		return TotalOrderPrice;
	}
	
	public boolean doEmptyCart(int userId){
		// TODO Auto-generated method stub
			boolean isCartEmpty=ad.doEmptyCart(userId);
			return isCartEmpty;
	}
	public Integer GetOrderId() {
		int orderId=ad.GetOrderId();
		return orderId;
	}
	public String GetCurrentDate() {
		String CurrentDate=ad.GetCurrentDate();
		return CurrentDate;
	}
	public boolean doCancelOrder(int userId,int orderId){
		// TODO Auto-generated method stub
			boolean isOrderCanceled=ad.doCancelOrder(userId,orderId);
			return isOrderCanceled;
	}
	public void doUpdateBooksTotal(int Qty,int Isbn) throws InvalidBookException {
		// TODO Auto-generated method stub
		ad.doUpdateBooksTotal(Qty, Isbn);
		
	}
	public Integer getTotalBooks(int Isbn) throws InvalidBookException {
		// TODO Auto-generated method stub
		int TotalBooks=ad.getTotalBooks(Isbn);
		return TotalBooks;
	}
	public Integer getOrderQty(int userId,int orderId,int Isbn) {
		int OrderQty=ad.getOrderQty(userId,orderId,Isbn);
		return OrderQty;
	}
	
	public List<Integer> getOrderIsbn(int userId,int orderId){
		List<Integer> OrderIsbn=ad.getOrderIsbn(userId, orderId);
		return OrderIsbn;
	}
	
	public List<Order> getCanceledOrders(int userId,int orderId){
		List<Order> CanceledOrders=ad.getCanceledOrders(userId, orderId);
		return CanceledOrders;
	}
	public Integer doCalculateTotalCancelOrderPrice(int userId,int orderId) {
		int TotalCancelOrderPrice=ad.doCalculateTotalCancelOrderPrice(userId,orderId);
		return TotalCancelOrderPrice;
	}
}
