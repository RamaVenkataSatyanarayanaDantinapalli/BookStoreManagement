package com.capg.BookStoreManagement.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.capg.BookStoreManagement.beans.Book;
import com.capg.BookStoreManagement.beans.Order;
import com.capg.BookStoreManagement.beans.User;
import com.capg.BookStoreManagement.util.DBConnection;

public class AdminDAOImpl implements AdminDAO{
	//public boolean doAddUser(int userId,String userName,String userPwd,String userEmail,String userAddress,int userPhone)
	Connection con = DBConnection.con;
    PreparedStatement ps;
	public boolean doAddUser(User user)
    {
		    try
		    {
		        ps = con.prepareStatement("insert into user values (?,?,?,?,?,?)");
		        ps.setInt(1,user.getUserId());
		        ps.setString(2,user.getUserName());
		        ps.setString(3,user.getUserPwd());
		        ps.setString(4,user.getUserEmail());
		        ps.setString(5,user.getUserAddress());
		        ps.setString(6,user.getUserPhone());
		        int i = ps.executeUpdate(); // DML, i holds the value :- number of rows effected
				if(i==1) return true;
				return false;
		    }
		    catch(Exception e)
		    {
		    	System.out.println("Exception while Insertion of User "+e);
		    }
		    return false;
		 }
	public boolean doModifyUser(User user)
    {
		
	    try
	    {
	    	//int UserId=user.getUserId();
	      String cmd = "update user set userId=?, userName=?, userPwd=?, userEmail=?, userAddress =?, userPhone=? where userId=?";

	      ps = con.prepareStatement(cmd);
	        ps.setInt(1,user.getUserId());
	        ps.setString(2,user.getUserName());
	        ps.setString(3,user.getUserPwd());
	        ps.setString(4,user.getUserEmail());
	        ps.setString(5,user.getUserAddress());
	        ps.setString(6,user.getUserPhone());
	        ps.setInt(7,user.getUserId());
	      
	      int i = ps.executeUpdate(); // DML, i holds the value :- number of rows effected
			if(i==1) return true;
			return false;
	    }
	   catch(Exception e)
	   {
		   System.out.println("Exception while Updating User "+e);
	   }
	   return false;

	  }
	 public boolean doDeleteUser(int userId)
	    {

		    try
		    {
		      String cmd = "delete from user where userId=?";

		      ps = con.prepareStatement(cmd);
		      ps.setInt(1,userId);
		      int i = ps.executeUpdate(); // DML, i holds the value :- number of rows effected
				if(i==1) return true;
				return false;
		    }
		   catch(Exception e)
		   {
			   System.out.println("Exception while Deleting User "+e);
		   }
		   return false;

		  }
	 public User doSearchUser(int userId) {
		 try {
		 ps=con.prepareStatement("SELECT * FROM user where userId=?");
		 ps.setInt(1,userId);
		 
		 ResultSet rs = ps.executeQuery(); // DML, i holds the value :- number of rows effected
		while(rs.next()) {
			int userID = rs.getInt("userId");
			String userName = rs.getString("userName");
			String userPwd = rs.getString("userPwd");
			String userEmail = rs.getString("userEmail");
			String userAddress = rs.getString("userAddress");
		    String userPhone = rs.getString("userPhone");
			User u=new User(userID,userName,userPwd,userEmail,userAddress,userPhone);
			return u;
		}
	 }
		 catch(Exception e) {
			 System.out.println("Exception while Searching User");
		 }
		 return null;
	}
	 
	 public User doSearchUser(String userName) {
		 try {
		 ps=con.prepareStatement("SELECT * FROM bookstoremanagement.user where userName=?");
		 ps.setString(1,userName);
		 
		 ResultSet rs = ps.executeQuery(); // DML, i holds the value :- number of rows effected
		while(rs.next()) {
			int userID = rs.getInt("userId");
			String guserName = rs.getString("userName");
			String userPwd = rs.getString("userPwd");
			String userEmail = rs.getString("userEmail");
			String userAddress = rs.getString("userAddress");
		    String userPhone = rs.getString("userPhone");
			User u=new User(userID,guserName,userPwd,userEmail,userAddress,userPhone);
			return u;
		}
	 }
		 catch(Exception e) {
			 System.out.println("Exception while Searching User by userName");
		 }
		 return null;
	}
	 //public boolean doAddBooks(long isbn,String title,String author,int price,int qty){
	 public boolean doAddBooks(Book book) {

		    try
		    {
		        ps = con.prepareStatement("insert into book values (?,?,?,?,?)");
		        ps.setLong(1,book.getIsbn());
		        ps.setString(2,book.getTitle());
		        ps.setString(3,book.getAuthor());
		        ps.setInt(4,book.getPrice());
		        ps.setInt(5,book.getQty());
		        int i = ps.executeUpdate(); // DML, i holds the value :- number of rows effected
				if(i==1) return true;
				return false;
		    }
		    catch(Exception e)
		    {
		    	System.out.println("Exception while Adding Books "+e);
		    }
		    return false;
	    }
	 public boolean doDeleteBooks(int isbn) {
		 
		    try
		    {
		        ps = con.prepareStatement("delete from book where isbn=?");
		        ps.setInt(1,isbn);
		        int i = ps.executeUpdate(); // DML, i holds the value :- number of rows effected
				if(i==1) return true;
				return false;
		    }
		    catch(Exception e)
		    {
		    	System.out.println("Exception while Deleting Books "+e);		    
		    	}
		    return false;
	    }
	 //public boolean doEditBooks(long Isbn,String title,String author,int price,int qty) {
	 public boolean doEditBooks(Book book) {
		 
		    try
		    {
		        
		        ps = con.prepareStatement("update Book set isbn=?, title=?, author=?, price=?, qty =? where isbn=?");
		        ps.setLong(1,book.getIsbn());
		        ps.setString(2,book.getTitle());
		        ps.setString(3,book.getAuthor());
		        ps.setInt(4,book.getPrice());
		        ps.setInt(5,book.getQty());
		        ps.setLong(6,book.getIsbn());
		        int i = ps.executeUpdate(); // DML, i holds the value :- number of rows effected
				if(i==1) return true;
				return false;
		    }
		    catch(Exception e)
		    {
		    	System.out.println("Exception while Editing Books "+e);
		    }
		    return false;
	    }
	 
	 
	 public Book doSearchBook(int Isbn) {
		 try {
		 ps=con.prepareStatement("select * from book where isbn=?");
		 ps.setInt(1,Isbn);
		 
		 ResultSet rs = ps.executeQuery(); // DML, i holds the value :- number of rows effected
			while(rs.next()) {
				int isbn = rs.getInt("isbn");
				String title = rs.getString("title");
				String author = rs.getString("author");
				int price = rs.getInt("price");
				int qty = rs.getInt("qty");
				Book b=new Book(isbn,title,author,price,qty);
				return b;
			}
		 }
			 catch(Exception e) {
				 System.out.println("Exception while Searching Book");
			 }
			 return null;
	    }
	 
	 public Book doSearchBook(String author)
	 {
		 try {
			// List<Book> booksList=new ArrayList<Book>();
			 ps=con.prepareStatement("select * from bookstoremanagement.book where author=?");
			 ps.setString(1,author);
			 
			 ResultSet rs = ps.executeQuery(); // DML, i holds the value :- number of rows effected
				while(rs.next()) {
					int isbn = rs.getInt("isbn");
					String title = rs.getString("title");
					String authorSearch = rs.getString("author");
					int price = rs.getInt("price");
					int qty = rs.getInt("qty");
					Book b=new Book(isbn,title,authorSearch,price,qty);
					return b;
				}
			 }
				 catch(Exception e) {
					 System.out.println("Exception while Searching Book by author");
				 }
				 return null;
	 }
	 
	 public Book searchByBookTitle(String title)
	 {
		 try {
			// List<Book> booksList=new ArrayList<Book>();
			 ps=con.prepareStatement("select * from bookstoremanagement.book where title=?");
			 ps.setString(1,title);
			 
			 ResultSet rs = ps.executeQuery(); // DML, i holds the value :- number of rows effected
				while(rs.next()) {
					int isbn = rs.getInt("isbn");
					String Title = rs.getString("title");
					String authorSearch = rs.getString("author");
					int price = rs.getInt("price");
					int qty = rs.getInt("qty");
					Book b=new Book(isbn,Title,authorSearch,price,qty);
					return b;
				}
			 }
				 catch(Exception e) {
					 System.out.println("Exception while Searching Book by Title");
				 }
				 return null;
	 }
	 
	 public List<User> getUsers()
	 {
		 String sqlQuery="Select * from user";
		 List<User> usersList=new ArrayList<User>();
		 try
		 {
			 ps=con.prepareStatement(sqlQuery);
			 ResultSet rs=ps.executeQuery();
			 while(rs.next())
			 {
				 int UserId=rs.getInt("userId");
				 String UserName=rs.getString("userName");
				 String UserPwd=rs.getString("UserPwd");
				 String UserEmail=rs.getString("userEmail");
				 String UserAddress=rs.getString("userAddress");
				 String UserPhone=rs.getString("userPhone");
				 User us=new User(UserId,UserName,UserPwd,UserEmail,UserAddress,UserPhone);
				 usersList.add(us);
			 }
			 return usersList;
		 }
		 catch (Exception e) {
			 System.out.println("exception in Getting Users");
			// TODO: handle exception
		}
		return null;
		 
	 }
	 
	 /*public List<User> getUsersByUserIdDesc()
	 {
		 String sqlQuery="Select * from User order by userId desc";
		 List<User> booksList=new ArrayList<User>();
		 try
		 {
			 ps=con.prepareStatement(sqlQuery);
			 ResultSet rs=ps.executeQuery();
			 while(rs.next())
			 {
				 int UserId=rs.getInt("userId");
				 String UserName=rs.getString("userName");
				 String UserPwd=rs.getString("UserPwd");
				 String UserEmail=rs.getString("userEmail");
				 String UserAddress=rs.getString("userAddress");
				 String UserPhone=rs.getString("userPhone");
				 User us=new User(UserId,UserName,UserPwd,UserEmail,UserAddress,UserPhone);
				 booksList.add(us);
			 }
			 return booksList;
		 }
		 catch (Exception e) {
			 System.out.println("exception in sorting");
			// TODO: handle exception
		}
		return null;
		 
	 }
	 
	 public List<User> getUsersByUserName()
	 {
		 String sqlQuery="Select * from User order by userName";
		 List<User> booksList=new ArrayList<User>();
		 try
		 {
			 ps=con.prepareStatement(sqlQuery);
			 ResultSet rs=ps.executeQuery();
			 while(rs.next())
			 {
				 int UserId=rs.getInt("userId");
				 String UserName=rs.getString("userName");
				 String UserPwd=rs.getString("UserPwd");
				 String UserEmail=rs.getString("userEmail");
				 String UserAddress=rs.getString("userAddress");
				 String UserPhone=rs.getString("userPhone");
				 User us=new User(UserId,UserName,UserPwd,UserEmail,UserAddress,UserPhone);
				 booksList.add(us);
			 }
			 return booksList;
		 }
		 catch (Exception e) {
			 System.out.println("exception in sorting");
			// TODO: handle exception
		}
		return null;
		 
	 }
	 
	 public List<User> getUsersByUserNameDesc()
	 {
		 String sqlQuery="Select * from User order by UserName desc";
		 List<User> booksList=new ArrayList<User>();
		 try
		 {
			 ps=con.prepareStatement(sqlQuery);
			 ResultSet rs=ps.executeQuery();
			 while(rs.next())
			 {
				 int UserId=rs.getInt("userId");
				 String UserName=rs.getString("userName");
				 String UserPwd=rs.getString("UserPwd");
				 String UserEmail=rs.getString("userEmail");
				 String UserAddress=rs.getString("userAddress");
				 String UserPhone=rs.getString("userPhone");
				 User us=new User(UserId,UserName,UserPwd,UserEmail,UserAddress,UserPhone);
				 booksList.add(us);
			 }
			 return booksList;
		 }
		 catch (Exception e) {
			 System.out.println("exception in sorting");
			// TODO: handle exception
		}
		return null;
		 
	 }*/
	 
	 public List<User> getUsersByRange(int userId1, int userId2)
	 {
		 String sqlQuery="SELECT * FROM User where userId>=? and userId<=?";
		 List<User> usersList=new ArrayList<User>();
		 try
		 {
			 ps=con.prepareStatement(sqlQuery);
			 ps.setInt(1, userId1);
			 ps.setInt(2, userId2);
			 ResultSet rs=ps.executeQuery();
			 while(rs.next())
			 {
				 int UserId=rs.getInt("userId");
				 String UserName=rs.getString("userName");
				 String UserPwd=rs.getString("userPwd");
				 String UserEmail=rs.getString("userEmail");
				 String UserAddress=rs.getString("userAddress");
				 String UserPhone=rs.getString("userPhone");
				 
				 User u=new User(UserId,UserName,UserPwd,UserEmail,UserAddress,UserPhone);
				 usersList.add(u);
			 }
			 return usersList;
		 }
		 catch (Exception e) {
			// TODO: handle exception
			 System.out.println("Exception in getting users by range "+e);
		}
		 return null;
	 }
	// public List<ArrayList<Object>> getBooks()
	 public List<Book> getBooks()
	 {
		 String sqlQuery="Select * from Book order by isbn";
		 List<Book> booksList=new ArrayList<Book>();
		 try
		 {
			 ps=con.prepareStatement(sqlQuery);
			 ResultSet rs=ps.executeQuery();
			 while(rs.next())
			 {
				 int isbn=rs.getInt("isbn");
				 String title=rs.getString("title");
				 String author=rs.getString("author");
				 int price=rs.getInt("price");
				 int qty=rs.getInt("qty");
				 Book bp=new Book(isbn,title,author,price,qty);
				 booksList.add(bp);
			 }
			 return booksList;
		 }
		 catch (Exception e) {
			 System.out.println("exception in sorting");
			// TODO: handle exception
		}
		return null;
		 
	 }
	 
	/* public List<Book> getBooksByIsbnDesc()
	 {
		 String sqlQuery="Select * from Book order by isbn desc";
		 List<Book> booksList=new ArrayList<Book>();
		 try
		 {
			 ps=con.prepareStatement(sqlQuery);
			 ResultSet rs=ps.executeQuery();
			 while(rs.next())
			 {
				 int isbn=rs.getInt("isbn");
				 String title=rs.getString("title");
				 String author=rs.getString("author");
				 int price=rs.getInt("price");
				 int qty=rs.getInt("qty");
				 Book bp=new Book(isbn,title,author,price,qty);
				 booksList.add(bp);
			 }
			 return booksList;
		 }
		 catch (Exception e) {
			 System.out.println("exception in sorting");
			// TODO: handle exception
		}
		return null;
		 
	 }
	 
	 public List<Book> getBooksByPrice()
	 {
		 String sqlQuery="Select * from Book order by price";
		 List<Book> booksList=new ArrayList<Book>();
		 try
		 {
			 ps=con.prepareStatement(sqlQuery);
			 ResultSet rs=ps.executeQuery();
			 while(rs.next())
			 {
				 int isbn=rs.getInt("isbn");
				 String title=rs.getString("title");
				 String author=rs.getString("author");
				 int price=rs.getInt("price");
				 int qty=rs.getInt("qty");
				 Book bp=new Book(isbn,title,author,price,qty);
				 booksList.add(bp);
			 }
			 return booksList;
		 }
		 catch (Exception e) {
			 System.out.println("exception in sorting");
			// TODO: handle exception
		}
		return null;
		 
	 }
	 
	 public List<Book> getBooksByPriceDesc()
	 {
		 String sqlQuery="Select * from Book order by price desc";
		 List<Book> booksList=new ArrayList<Book>();
		 try
		 {
			 ps=con.prepareStatement(sqlQuery);
			 ResultSet rs=ps.executeQuery();
			 while(rs.next())
			 {
				 int isbn=rs.getInt("isbn");
				 String title=rs.getString("title");
				 String author=rs.getString("author");
				 int price=rs.getInt("price");
				 int qty=rs.getInt("qty");
				 Book bp=new Book(isbn,title,author,price,qty);
				 booksList.add(bp);
			 }
			 return booksList;
		 }
		 catch (Exception e) {
			 System.out.println("exception in sorting");
			// TODO: handle exception
		}
		return null;
		 
	 }
	 
	public List<Book> getBooksByTitle() {
		// TODO Auto-generated method stub
		String sqlQuery="Select * from Book order by title";
		 List<Book> booksList=new ArrayList<Book>();
		 try
		 {
			 ps=con.prepareStatement(sqlQuery);
			 ResultSet rs=ps.executeQuery();
			 while(rs.next())
			 {
				 int isbn=rs.getInt("isbn");
				 String title=rs.getString("title");
				 String author=rs.getString("author");
				 int price=rs.getInt("price");
				 int qty=rs.getInt("qty");
				 Book bp=new Book(isbn,title,author,price,qty);
				 booksList.add(bp);
			 }
			 return booksList;
		 }
		 catch (Exception e) {
			 System.out.println("exception in sorting");
			// TODO: handle exception
		}
		return null;
	}
	public List<Book> getBooksByTitleDesc() {
		// TODO Auto-generated method stub
		String sqlQuery="Select * from Book order by title desc";
		 List<Book> booksList=new ArrayList<Book>();
		 try
		 {
			 ps=con.prepareStatement(sqlQuery);
			 ResultSet rs=ps.executeQuery();
			 while(rs.next())
			 {
				 int isbn=rs.getInt("isbn");
				 String title=rs.getString("title");
				 String author=rs.getString("author");
				 int price=rs.getInt("price");
				 int qty=rs.getInt("qty");
				 Book bp=new Book(isbn,title,author,price,qty);
				 booksList.add(bp);
			 }
			 return booksList;
		 }
		 catch (Exception e) {
			 System.out.println("exception in sorting");
			// TODO: handle exception
		}
		return null;
	}
	public List<Book> getBooksByAuthor() {
		// TODO Auto-generated method stub
		String sqlQuery="Select * from Book order by author";
		 List<Book> booksList=new ArrayList<Book>();
		 try
		 {
			 ps=con.prepareStatement(sqlQuery);
			 ResultSet rs=ps.executeQuery();
			 while(rs.next())
			 {
				 int isbn=rs.getInt("isbn");
				 String title=rs.getString("title");
				 String author=rs.getString("author");
				 int price=rs.getInt("price");
				 int qty=rs.getInt("qty");
				 Book bp=new Book(isbn,title,author,price,qty);
				 booksList.add(bp);
			 }
			 return booksList;
		 }
		 catch (Exception e) {
			 System.out.println("exception in sorting");
			// TODO: handle exception
		}
		return null;
	}
	public List<Book> getBooksByAuthorDesc() {
		// TODO Auto-generated method stub
		String sqlQuery="Select * from Book order by author desc";
		 List<Book> booksList=new ArrayList<Book>();
		 try
		 {
			 ps=con.prepareStatement(sqlQuery);
			 ResultSet rs=ps.executeQuery();
			 while(rs.next())
			 {
				 int isbn=rs.getInt("isbn");
				 String title=rs.getString("title");
				 String author=rs.getString("author");
				 int price=rs.getInt("price");
				 int qty=rs.getInt("qty");
				 Book bp=new Book(isbn,title,author,price,qty);
				 booksList.add(bp);
			 }
			 return booksList;
		 }
		 catch (Exception e) {
			 System.out.println("exception in sorting");
			// TODO: handle exception
		}
		return null;
	}
	public List<Book> getBooksByQuantity() {
		// TODO Auto-generated method stub
		String sqlQuery="Select * from Book order by qty";
		 List<Book> booksList=new ArrayList<Book>();
		 try
		 {
			 ps=con.prepareStatement(sqlQuery);
			 ResultSet rs=ps.executeQuery();
			 while(rs.next())
			 {
				 int isbn=rs.getInt("isbn");
				 String title=rs.getString("title");
				 String author=rs.getString("author");
				 int price=rs.getInt("price");
				 int qty=rs.getInt("qty");
				 Book bp=new Book(isbn,title,author,price,qty);
				 booksList.add(bp);
			 }
			 return booksList;
		 }
		 catch (Exception e) {
			 System.out.println("exception in sorting");
			// TODO: handle exception
		}
		return null;
	}
	public List<Book> getBooksByQuantityDesc() {
		// TODO Auto-generated method stub
		String sqlQuery="Select * from Book order by qty desc";
		 List<Book> booksList=new ArrayList<Book>();
		 try
		 {
			 ps=con.prepareStatement(sqlQuery);
			 ResultSet rs=ps.executeQuery();
			 while(rs.next())
			 {
				 int isbn=rs.getInt("isbn");
				 String title=rs.getString("title");
				 String author=rs.getString("author");
				 int price=rs.getInt("price");
				 int qty=rs.getInt("qty");
				 Book bp=new Book(isbn,title,author,price,qty);
				 booksList.add(bp);
			 }
			 return booksList;
		 }
		 catch (Exception e) {
			 System.out.println("exception in sorting");
			// TODO: handle exception
		}
		return null;
	}*/
	
	public List<Order> getOrders(){
		// TODO Auto-generated method stub
		String sqlQuery="Select * from bookstoremanagement.order order by orderId";
		 List<Order> ordersList=new ArrayList<Order>();
		 try
		 {
			 ps=con.prepareStatement(sqlQuery);
			 ResultSet rs=ps.executeQuery();
			 while(rs.next())
			 {
				 int userId=rs.getInt("userId");
				 int Isbn=rs.getInt("bookIsbn");
				 String title=rs.getString("bookTitle");
				 int qty=rs.getInt("bookQuantity");
				 int totalPrice=rs.getInt("totalPrice");
				 int orderId=rs.getInt("orderId");
				 String orderDate=rs.getString("orderDate");
				 Order od=new Order(userId,Isbn,title,qty,totalPrice,orderId,orderDate);
				 ordersList.add(od);
			 }
			 return ordersList;
		 }
		 catch (Exception e) {
			 System.out.println("exception in sorting Orders");
			// TODO: handle exception
		}
		return null;
	}
	
	
	/* public int doCalculateTotal(int orders)
	    {
		 return orders;
	    }*/
	 
	/*public List<Order> getOrdersByOrderIdDesc(){
		// TODO Auto-generated method stub
		String sqlQuery="Select * from bookstoremanagement.order order by orderId desc";
		 List<Order> ordersList=new ArrayList<Order>();
		 try
		 {
			 ps=con.prepareStatement(sqlQuery);
			 ResultSet rs=ps.executeQuery();
			 while(rs.next())
			 {
				 int userId=rs.getInt("userId");
				 int Isbn=rs.getInt("bookIsbn");
				 String title=rs.getString("bookTitle");
				 int qty=rs.getInt("bookQuantity");
				 int totalPrice=rs.getInt("totalPrice");
				 int orderId=rs.getInt("orderId");
				 String orderDate=rs.getString("orderDate");
				 Order od=new Order(userId,Isbn,title,qty,totalPrice,orderId,orderDate);
				 ordersList.add(od);
			 }
			 return ordersList;
		 }
		 catch (Exception e) {
			 System.out.println("exception in sorting Orders");
			// TODO: handle exception
		}
		return null;
	}
	
	public List<Order> getOrdersByUserId(){
		// TODO Auto-generated method stub
		String sqlQuery="Select * from bookstoremanagement.order order by userId";
		 List<Order> ordersList=new ArrayList<Order>();
		 try
		 {
			 ps=con.prepareStatement(sqlQuery);
			 ResultSet rs=ps.executeQuery();
			 while(rs.next())
			 {
				 int userId=rs.getInt("userId");
				 int Isbn=rs.getInt("bookIsbn");
				 String title=rs.getString("bookTitle");
				 int qty=rs.getInt("bookQuantity");
				 int totalPrice=rs.getInt("totalPrice");
				 int orderId=rs.getInt("orderId");
				 String orderDate=rs.getString("orderDate");
				 Order od=new Order(userId,Isbn,title,qty,totalPrice,orderId,orderDate);
				 ordersList.add(od);
			 }
			 return ordersList;
		 }
		 catch (Exception e) {
			 System.out.println("exception in sorting Orders");
			// TODO: handle exception
		}
		return null;
	}
	
	public List<Order> getOrdersByUserIdDesc(){
		// TODO Auto-generated method stub
		String sqlQuery="Select * from bookstoremanagement.order order by userId desc";
		 List<Order> ordersList=new ArrayList<Order>();
		 try
		 {
			 ps=con.prepareStatement(sqlQuery);
			 ResultSet rs=ps.executeQuery();
			 while(rs.next())
			 {
				 int userId=rs.getInt("userId");
				 int Isbn=rs.getInt("bookIsbn");
				 String title=rs.getString("bookTitle");
				 int qty=rs.getInt("bookQuantity");
				 int totalPrice=rs.getInt("totalPrice");
				 int orderId=rs.getInt("orderId");
				 String orderDate=rs.getString("orderDate");
				 Order od=new Order(userId,Isbn,title,qty,totalPrice,orderId,orderDate);
				 ordersList.add(od);
			 }
			 return ordersList;
		 }
		 catch (Exception e) {
			 System.out.println("exception in sorting Orders");
			// TODO: handle exception
		}
		return null;
	}
	
	public List<Order> getOrdersByOrderDate(){
		// TODO Auto-generated method stub
		String sqlQuery="Select * from bookstoremanagement.order order by orderDate";
		 List<Order> ordersList=new ArrayList<Order>();
		 try
		 {
			 ps=con.prepareStatement(sqlQuery);
			 ResultSet rs=ps.executeQuery();
			 while(rs.next())
			 {
				 int userId=rs.getInt("userId");
				 int Isbn=rs.getInt("bookIsbn");
				 String title=rs.getString("bookTitle");
				 int qty=rs.getInt("bookQuantity");
				 int totalPrice=rs.getInt("totalPrice");
				 int orderId=rs.getInt("orderId");
				 String orderDate=rs.getString("orderDate");
				 Order od=new Order(userId,Isbn,title,qty,totalPrice,orderId,orderDate);
				 ordersList.add(od);
			 }
			 return ordersList;
		 }
		 catch (Exception e) {
			 System.out.println("exception in sorting Orders");
			// TODO: handle exception
		}
		return null;
	}
	public List<Order> getOrdersByOrderDateDesc(){
		// TODO Auto-generated method stub
		String sqlQuery="Select * from bookstoremanagement.order order by orderDate desc";
		 List<Order> ordersList=new ArrayList<Order>();
		 try
		 {
			 ps=con.prepareStatement(sqlQuery);
			 ResultSet rs=ps.executeQuery();
			 while(rs.next())
			 {
				 int userId=rs.getInt("userId");
				 int Isbn=rs.getInt("bookIsbn");
				 String title=rs.getString("bookTitle");
				 int qty=rs.getInt("bookQuantity");
				 int totalPrice=rs.getInt("totalPrice");
				 int orderId=rs.getInt("orderId");
				 String orderDate=rs.getString("orderDate");
				 Order od=new Order(userId,Isbn,title,qty,totalPrice,orderId,orderDate);
				 ordersList.add(od);
			 }
			 return ordersList;
		 }
		 catch (Exception e) {
			 System.out.println("exception in sorting Orders");
			// TODO: handle exception
		}
		return null;
	}*/
	
	 public List<Order> doSearchOrderByUserId(int userId)
	 {
		 try {
			 ps=con.prepareStatement("select * from bookstoremanagement.order where userId=?");
			 ps.setInt(1,userId);
			 List<Order> OrdersList=new ArrayList<Order>();
			 ResultSet rs = ps.executeQuery(); // DML, i holds the value :- number of rows effected
			 while(rs.next())
			 {
				 int UserID3=rs.getInt("userId");
				 int Isbn=rs.getInt("bookIsbn");
				 String title=rs.getString("bookTitle");
				 int qty=rs.getInt("bookQuantity");
				 int totalPrice=rs.getInt("totalPrice");
				 int orderId=rs.getInt("orderId");
				 String orderDate=rs.getString("orderDate");
				 Order od=new Order(UserID3,Isbn,title,qty,totalPrice,orderId,orderDate);
				 OrdersList.add(od);
				}
			 return OrdersList;
			 }
				 catch(Exception e) {
					 System.out.println("Exception while Searching Order by UserId");
				 }
				 return null;
	 }
	 public List<Order> doSearchOrderByOrderId(int orderId)
	 {
		 try {
			 
			 ps=con.prepareStatement("select * from bookstoremanagement.order where orderId=?");
			 ps.setInt(1,orderId);
			 List<Order> OrdersList=new ArrayList<Order>();
			 ResultSet rs = ps.executeQuery(); // DML, i holds the value :- number of rows effected
			 while(rs.next())
			 {
				 int UserID3=rs.getInt("userId");
				 int Isbn=rs.getInt("bookIsbn");
				 String title=rs.getString("bookTitle");
				 int qty=rs.getInt("bookQuantity");
				 int totalPrice=rs.getInt("totalPrice");
				 int OrderId=rs.getInt("orderId");
				 String orderDate=rs.getString("orderDate");
				 Order od=new Order(UserID3,Isbn,title,qty,totalPrice,OrderId,orderDate);
				 OrdersList.add(od);
				}
			 return OrdersList;
			 }
				 catch(Exception e) {
					 System.out.println("Exception while Searching Order by UserId");
				 }
				 return null;
	 }
	 
	 public List<Order> doSearchOrderByOrderDate(String orderDate)
	 {
		 try {
			 List<Order> OrdersList=new ArrayList<Order>();
			 ps=con.prepareStatement("select * from bookstoremanagement.order where orderDate=?");
			 ps.setString(1,orderDate);
			 
			 ResultSet rs = ps.executeQuery(); // DML, i holds the value :- number of rows effected
			 while(rs.next())
			 {
				 int UserID3=rs.getInt("userId");
				 int Isbn=rs.getInt("bookIsbn");
				 String title=rs.getString("bookTitle");
				 int qty=rs.getInt("bookQuantity");
				 int totalPrice=rs.getInt("totalPrice");
				 int orderId=rs.getInt("orderId");
				 String OrderDate=rs.getString("orderDate");
				 Order od=new Order(UserID3,Isbn,title,qty,totalPrice,orderId,OrderDate);
				 OrdersList.add(od);
				}
			 return OrdersList;
			 }
				 catch(Exception e) {
					 System.out.println("Exception while Searching Order by UserId");
				 }
				 return null;
	 }
	 
	
	 public int doCalculateTotal(int orders)
	    {
		 return orders;
	    }
}
