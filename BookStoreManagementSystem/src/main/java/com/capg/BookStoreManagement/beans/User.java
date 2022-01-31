package com.capg.BookStoreManagement.beans;

public class User implements Comparable<User>{
	private int userId;
	private String userName;
	private String userPwd;
	private String userEmail;
	private String userAddress;
	private long userPhone;
	
	public User(int userId,String userName,String userPwd,String userEmail,String userAddress,long userPhone) {
		
		this.userId = userId;
		this.userName = userName;
		this.userPwd = userPwd;
		this.userEmail = userEmail;
		this.userAddress = userAddress;
		this.userPhone = userPhone;
	}
	
	public int getUserId() {
		return userId;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public String getUserPwd() {
		return userPwd;
	}
	
	public String getUserEmail() {
		return userEmail;
	}
	
	public String getUserAddress() {
		return userAddress;
	}
	
	public long getUserPhone() {
		return userPhone;
	}
	
public int compareTo(User u) {
		
		
		return this.userId-u.userId;
	}
}