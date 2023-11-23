package collection.silsub3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import com.collection.silsub3.controller.BookManager;
import com.collection.silsub3.model.vo.Book;

public class BookMenu {
	
	Scanner sc= new Scanner(System.in);
	BookManager bm = new BookManager();
	
	public BookMenu() {}
	
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
			
		//새도서 추가
			case 1 : 
				bm.addBook(inputBook());
				System.out.println("도서가 추가되었습니다.");
				break;	
		//도서 정보 정렬 후 출력 
			case 2 : 
				bm.printBookList(bm.sortedBookList());
				break;
		//도서 삭제
			case 3 : 
				
				Book result = bm.deleteBook(inputBookNo());
				
				if(result!= null) {
					System.out.println("도서가 삭제 되었습니다.");
				} else {
					System.out.println("삭제할 도서가 존재하지 않음.");
				}
				
				break;
		//도서 검색 출력
			case 4 : 
				
				String index = bm.searchBook(inputBookTitle());
				
				if (index = -1 ) {
					
					System.out.println("조회한 책이 없습니다.");
				} else {
					System.out.println(bm.selectBook(index));
				}
				
				break;	
		//전체 출력
			case 5 : 
				
				if(bm.selectAll() != null) {
					
					
				} else {
					
					
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
		
		} while(no < 0 || no >= 0);
		
		
	}
	
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
		
		System.out.println("도서 저자 : ");
		String author = sc.nextLine();
			
		return new Book( category ,title, author);
		
	}
	
	
	
	public String inputBookNo() {
		
		System.out.println("*** 도서 삭제 ***");
		System.out.println();
		System.out.println("-삭제할 도서 번호를 입력하세요");
		System.out.println();
		System.out.println("도서 번호 : ");
		String key = sc.nextLine();
		
		return key;

	}

	
	public String inputBookTitle() {
		
		System.out.println("*** 도서 제목으로 도서 검색 ***");
		System.out.println();
		System.out.println("-검색할 도서 제목을 입력하세요");
		System.out.println();
		System.out.println("도서 제목 : ");
		String title = sc.nextLine();
		
		return title;

	}

	
	
	

}
