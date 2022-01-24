package com.capg.BookStoreManagement.sortings;
import com.capg.BookStoreManagement.beans.Book;
import java.util.Comparator;
public class SortByBookName implements Comparator<Book>{

	public int compare(Book o1, Book o2) {
		// TODO Auto-generated method stub
		return o1.getTitle().compareToIgnoreCase(o2.getTitle());
	}
}
