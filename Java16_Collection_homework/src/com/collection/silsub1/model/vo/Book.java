package com.collection.silsub1.model.vo;
//vo 는 필드(값 저장), 생성자(객체생성),게터세터 (혹은 DTO 라고도 부름)
public class Book {
	
	private int bNO;
	private int category;
	private String title;
	private String author;
	
	public Book(){
		super();
	}
	
	public Book(int category, String title, String author){
		super();
		this.category = category;
		this.title = title;
		this.author = author;
		
	}

	public int getbNO() {
		return bNO;
	}

	public void setbNO(int bNO) {
		this.bNO = bNO;
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
	};
	
	
	
	//도서 분류
	
	@Override 
	public String toString() {
		
		if(category == 1) {
			
			return " 인문 : " + bNO + " , "+ title + " , " + author;
		
		} else if(category == 2) {
			
			return " 자연과학 : " + bNO + " , " + title + " , " + author;
			
		} else if(category == 3) {
			
			return " 의료 : " + bNO + " , " + title + " , " + author;
			
		} else {
			
			return " 기타 : " + bNO + " , " + title + " , " + author;
		}
		
	}
	
	
	
}
