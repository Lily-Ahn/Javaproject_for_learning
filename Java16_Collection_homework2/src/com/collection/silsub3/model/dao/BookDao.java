package com.collection.silsub3.model.dao;
import java.util.ArrayList;
import java.util.HashMap;
import com.collection.silsub3.controller.BookManager;
import com.collection.silsub3.model.vo.Book;

public class BookDao {
	
	private HashMap<String,Book> bookMap;
	
	public BookDao(){
		bookMap = new HashMap<String,Book>();
	}
	
	public BookDao(HashMap<String, Book> map){
		this.bookMap = map;
	}
	
	public int getLastBookNo() {
		return 0;
		
	}
	
	public void addBook(Book book) {
		bookMap.put(book.getbNo(),book);
	}
	
	public Book deleteBook(String key) {
		return bookMap.remove(key);
	}
	
	public String searchBook(String title) {
		return "";
	}
	
	public Book selectBook(String key) {
		return null;
	}

	public HashMap<String, Book> selectAll(){
		return null;
	}
	
	public ArrayList<Book> sortedBookList(){
		return null;
	}



}
