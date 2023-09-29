package com.collection.silsub1.view;
import com.collection.silsub1.model.vo.Book;
import com.collection.silsub1.controller.BookManager;
import java.util.Scanner;

public class BookMenu {
	
	Scanner sc = new Scanner(System.in);
	BookManager bm = new BookManager();
	private Object category;
	
	public BookMenu(){}
	
	public void mainMenu() {
		
		int no;
		
		do {
		
		System.out.println(" *** 도서관리 프로그램 *** ");		
		System.out.println("1. 새 도서 추가 ");		
		System.out.println("2. 도서 정보 정렬 후 출력 ");		
		System.out.println("3. 도서 삭제 ");		
		System.out.println("4. 도서 검색 출력 ");		
		System.out.println("5. 전체 출력 ");		
		System.out.println("6. 끝내기 ");		
		System.out.println(" 메뉴 번호를 선택하세요 : ");
		System.out.println();
		
		no = sc.nextInt();
				
		
		switch(no) {
			
			case 1 : 
				
			case 2 : 
				
			case 3 : 

			case 4 : 
				
			case 5 : 
				
			case 6 : 
				
				System.out.println("  시스템이 종료됩니다. ");
			
			}
		
		} while( no > 6 || no < 6);
		
		
		
	}
	
	
	public Book inputBook(int category, String title, String author) {
		
		this.category = Book.category
		this.title = Book.title;
		this.author = Book.author;
		
		System.out.println("도서 제목 : ");
		title = sc.nextLine();
		
		System.out.println(" < 도서 장르 > ");
		System.out.println();
		System.out.println("1. 인문");
		System.out.println("2. 자연과학");
		System.out.println("3. 의료");
		System.out.println("4. 기타");
		category = sc.nextInt();
		
		System.out.println("도서 저자 : ");
		author = sc.nextLine();
		
		return inputBook();
		
	}

	//public int inputBookNo() {
	
	
	//}
	
	//public String inputBookTitle() {
	
	
	//}
	

}
