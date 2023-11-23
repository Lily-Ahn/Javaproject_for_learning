package com.collection.silsub1.view;
import com.collection.silsub1.model.vo.Book;
import com.collection.silsub1.controller.BookManager;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class BookMenu {
	
	private Scanner sc = new Scanner(System.in);
	private BookManager bm = new BookManager();
	
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
		System.out.println();
		System.out.println(" 메뉴 번호를 선택하세요 : ");
		System.out.println();
		
		no = sc.nextInt();
		sc.nextLine();
			
		switch(no) {
			
			case 1 : 
				//Book b = inputBook();
				//bm.addBook(b);
				bm.addBook(inputBook());
				break;
				
			case 2 : 
				bm.printBookList(bm.sortedBookList());
				break;
				
			case 3 : 
				int result = bm.deletBook(inputBookNo());
				if(result>0) {
					System.out.println("성공적으로 삭제되었습니다.");
				} else {
					System.out.println("삭제할 책이 존재하지 않습니다.");
				}
				
				break;

			case 4 : 
				int index = bm.searchBook(inputBookTitle());
				if(index == -1 ) {
					System.out.println("조회한 책이 없습니다.");
				} else {
					System.out.println(bm.selectBook(index));
				}		
				break;
				
			case 5 : 
				
				ArrayList<Book> list = bm.selectAll();
				if(list.isEmpty()) {	
					System.out.println("도서가 없습니다");
				} else {
					Iterator<Book> it = list.iterator();
					while(it.hasNext()) {
						System.out.println(it.next());
					}
				}
				
				break;
				
			case 6 : 
				
				System.out.println("  시스템이 종료됩니다. ");
				
				return;
			
			default : 
				
				System.out.println(" 해당되지 않는 번호입니다. 다시 시도하십시오.");
				System.out.println();
				
				break;
				
		  }
		
		} while(no < 7 );
		
	}
	
	//도서 추가
	
	public Book inputBook() {
		
		System.out.println("*** 도서 목록 추가 ***");
		System.out.println();
		System.out.println("도서 제목 : ");
		String title = sc.nextLine();
			
			System.out.println(" < 도서 장르 > ");
			System.out.println();
			System.out.println("1. 인문");
			System.out.println("2. 자연과학");
			System.out.println("3. 의료");
			System.out.println("4. 기타");
			int category = sc.nextInt();
			
			
			while (category>4) {
				
				do {
					System.out.println("잘못된 도서 장르 번호입니다. 다시 입력해주십시오.");
					System.out.println();
					System.out.println(" < 도서 장르 > ");
					System.out.println();
					System.out.println("1. 인문");
					System.out.println("2. 자연과학");
					System.out.println("3. 의료");
					System.out.println("4. 기타");
					category = sc.nextInt();
					
				} while (category>4);
				
			}
			
		System.out.println();
		System.out.println("도서 저자 : ");
		sc.nextLine();
		String author = sc.nextLine();
		
		Book addBook = new Book( category ,title, author);
		
		return addBook;
	}
	
	//삭제할 도서 번호 출력

	public int inputBookNo() {
		
		int deleteNo;
		
		System.out.println("*** 도서 삭제 ***");
		System.out.println();
		System.out.println("-삭제할 도서 번호를 입력하세요");
		System.out.println();
		System.out.println("도서 번호 : ");
		int no = sc.nextInt();
		sc.nextLine();
		
		return no;
	
	}
	
	//검색할 도서제목
	public String inputBookTitle() {
		
		String searchBookname;
		
		System.out.println("*** 도서 제목으로 도서 검색 ***");
		System.out.println();
		System.out.println("-검색할 도서 제목을 입력하세요");
		System.out.println();
		System.out.println("도서 제목 : ");
		String title = sc.nextLine();
		
		return title;
	
	}
	

}
