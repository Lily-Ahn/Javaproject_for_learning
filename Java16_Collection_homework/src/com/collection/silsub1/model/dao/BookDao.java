package com.collection.silsub1.model.dao;
import com.collection.silsub1.model.vo.Book;
import com.collection.silsub1.model.comparator.AscCategory;
import java.util.ArrayList;

public class BookDao {
	
	//필드값
	private ArrayList<Book> bookList;
	//기본생성자
	public BookDao(){
		bookList = new ArrayList<Book>();
	}
	
	//매개변수 생성자
	public BookDao(ArrayList<Book> bookList) {
		this.bookList = bookList;
	}
	
	
	
	//도서의 마지막 번호 리턴
	public int getLastBookNo() {
		return bookList.get(bookList.size()-1).getbNO();
	}
	
	//도서추가
	public void addBook(Book book) {
		
		bookList.add(book);
		
	}
	
	//도서 삭제
	public int deleteBook(int no) {
		
		int result = 0;
		
		for(int i =0; i<bookList.size();i++) {
			if(bookList.get(i).getbNO()== no) {
				bookList.remove(i);
				result = 1;
				break;
			}
			
		}
		
		return result;
	}
	
	//도서 인덱스 리턴
	public int searchBook(String title) {
		
		int index = -1;
		for(int i=0; i < bookList.size(); i++) {
			if(bookList.get(i).getTitle().contains(title)) {
				index = i;
				break;
			}
		}
		
		return index;
		
	}
	
	//도서 인덱스로 도서 객체 리턴
	
	public Book selectBook(int index) {		
		return bookList.get(index);		
	}
	
	//전체 도서리스트 리턴 
	public ArrayList<Book> selectAll(){
		
		return bookList;	
	}

	//정렬처리 후 list 리턴
	public ArrayList<Book> sortedBookList(){
		bookList.sort(new AscCategory());
		return bookList;
	}
	
	

}
