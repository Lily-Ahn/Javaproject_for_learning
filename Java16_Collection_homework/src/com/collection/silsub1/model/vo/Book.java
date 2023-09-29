package com.collection.silsub1.model.vo;

public class Book {
	
	int bNO;
	int category;
	String title;
	String author;
	
	Book(){}
	
	Book(int category, String title, String author){
		
	};
	
	
	
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


	
	

}
