package com.silsub1.book.model.vo;

public class Book {
	
	String title;
	String author;
	int price;
	
	public Book(){};
	public Book(String title,String author,int price){
		this.title = title;
		this.author = author;
		this.price = price;	
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String gertAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return title + " , " + author + " , " + price;
	}
	
	@Override
	public boolean equals(Object obj) {
			
		if (this==obj) { //주솟값이 같을 경우 
			return true;
		}
		if (obj==null) { //obj 자체가 null 일 경우
			return false;
		}
		
		
		Book obj2 = (Book) obj;
		
		
		if (title == null) {
			if(obj2.title!=null) {
				return false;
			} else if(!title.equals(obj2.title)) {
				return false;
			}   return true;	
		}
		
	
		if (author == null) {
			if(obj2.author!=null) {
				return false;
			} else if(!title.equals(obj2.author)) {
				return false;
			}	return true;
		} 
			
		if (price != obj2.price) {
			return false;
		}
		    return true;
	}
   
	@Override 
	public int hashCode() {
		return (title+author+price).hashCode();
		
	}
	

}
