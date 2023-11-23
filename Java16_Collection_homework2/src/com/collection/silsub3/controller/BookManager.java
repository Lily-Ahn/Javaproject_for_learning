package com.collection.silsub3.controller;
import com.collection.silsub3.model.dao.BookDao;
import com.collection.silsub3.model.vo.Book;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class BookManager {
	
	private Scanner sc= new Scanner(System.in);
	private BookDao bd = new BookDao();
	
	public BookManager(){}
	
	public void addBook(Book book) {
		
		String key = String.valueOf(bd.getLastBookNo()+1);
		book.setbNo(key);
		bd.addBook(book);
	}
	
	public Book deleteBook(String key) {

		return bd.deleteBook(key);
	}
	
	public String searchBook(String title) {
		
		return bd.searchBook(title);
	}
	
	public Book selectBook(String key) {
		return bd.selectBook(key);
	}
	
	public HashMap <String, Book> selectAll(){
		return null;
	}
	
	public Book[] sortedBookList() {
		return null;
	}
	
	public void printBookList(Book[] br) {
		
	}
	

}
