package com.collection.silsub3.model.vo;

public class Book {
	
	private String bNo;
	private int category;
	private String title;
	private String author;
	
	public Book(){}
	
	public Book(int category , String title, String author){
		this.category = category;
		this.title = title;
		this.author = author;
	}

	public String getbNo() {
		return bNo;
	}

	public void setbNo(String bNo) {
		this.bNo = bNo;
	}

	public int getCategory() {
		return category;
	}

	public void setCategory(int category) {
		this.category = category;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	
	
	@Override
	public String toString() {
		
		if(category == 1) {
			
			return " 인문 : " + "key : " +bNo + " , "+ title + " , " + author;
		
		} else if(category == 2) {
			
			return " 자연과학 : " + "key : " +bNo + " , " + title + " , " + author;
			
		} else if(category == 3) {
			
			return " 의료 : " + "key : " +bNo + " , " + title + " , " + author;
			
		} else {
			
			return " 기타 : " + "key : " +bNo + " , " + title + " , " + author;
		}
		
	}

	
	public int compareTo(Object arg0) {
		return 0;
	}
	

}
