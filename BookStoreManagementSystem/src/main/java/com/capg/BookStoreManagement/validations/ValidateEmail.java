package com.capg.BookStoreManagement.validations;

public class ValidateEmail {
	public boolean doValidateEmail(String Email) {
	      //System.out.println("Enter your Email: ");
	      String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
	      //Matching the given phone number with regular expression
	      boolean result = Email.matches(regex);
	      if(result) {
	         //System.out.println("Given email-id is valid");
	    	  return true;
	      } else {
	         //System.out.println("Given email-id is not valid");
	    	  return false;
	      }     
	}
}
