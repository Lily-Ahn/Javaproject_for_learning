package com.silsub1.book.main;
import com.silsub1.book.model.vo.Book;

public class Main {

	public static void main(String[] args) {
		
		Book b1 = new Book("강아지는 훌륭하다","강형욱",15000);
		Book b2 = new Book("고양이는 훌륭하다","안해림",12000);
		
		//두 객체 값 출력
		System.out.println(b1.toString());
		System.out.println(b2.toString());
		//두 객체의 값이 일치하는지 결과 출력
		System.out.println("b1과 b2의 값들은 일치하는가 ? : " +  b1.equals(b2));
		//얕은 복사
		Book b3=b1;
		//깊은 복사
		Book b4 = new Book("강아지는 훌륭하다","강형욱",15000);
		//첫번째 객체와 얕은 복제 객체의 내용은 같은가?
		System.out.println("b1과 얕은 복사한 b3의 값들은 일치하는가 ? : " + b1.equals(b3));
		//첫번째 객체와 깊은 복제 객체의 내용은 같은가?
		System.out.println("b1과 깊은 복사한 b4의 값들은 일치하는가 ? : " + b1.equals(b4));
		//첫번째 객체와 얕은 복제 객체의 주소가 같은가?
		System.out.println(b3);
		System.out.println(b4);
		//첫번째 객체와 깊은 복제 객체의 주소가 같은가?
		System.out.println(b1.equals(b4));
		
		
	}

}
