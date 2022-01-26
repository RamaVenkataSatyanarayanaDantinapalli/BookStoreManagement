package com.capg.BookStoreManagement.validations;

public class ValidatePhone {
	public boolean doValidatePhone(String Phone) {
		
		String regex="^\\d{10}$";
	      boolean result=Phone.matches(regex);
	      if(result) {
	    	  return true;
	      }
	      else {
	    	  return false;
	      }
	   }
	}