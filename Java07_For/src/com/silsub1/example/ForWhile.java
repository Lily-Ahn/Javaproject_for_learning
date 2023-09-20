package com.silsub1.example;
import java.util.Scanner;

public class ForWhile {
	
	Scanner sc = new Scanner (System.in);
	
	
	public void printStar1() {
		
		System.out.println("정수를 하나 입력하시오 : ");
		int no = sc.nextInt();
		
		if (no>0) {
			
			for (int i = 1; i <= no ; i++) {
				for ( int j= 1 ; j <= i ; j++) {
					//2번째 방법
					
					if (i == j) {
						
						System.out.print(i);
						//1번째 방법 break;
						
					} else {
						System.out.print("*");
					}
					
					
				} System.out.println();
			}
			
			
		} else {
			System.out.println("양수가 아닙니다.");
		}		
	}
	
	
	
	public void printStar2() {
		
		System.out.println("정수를 하나 입력하시오 : ");
		int no = sc.nextInt();
		
		if (no > 0) {
			
			for (int i = 1; i <=no ; i++) {
				
				for (int j = 1 ; j <=i ; j++) {
					System.out.print("*");
					
				} System.out.println();
			}
			
			
		
		} else if (no < 0 ) {
			
			for (int i = -(no) ; i > 0  ; i--) {
				
				for (int j = 1 ; j <=i ; j++) {
					System.out.print("*");
					
				} System.out.println();
			}	
			
		} else {
			
			System.out.println("출력기능이 없습니다.");	
		}
	}
	
	
	
	public void countInputCharacter() {
		
		System.out.println("문자열을 입력하시오 : ");
		String str = sc.nextLine();
		
		for (int i = 0 ; i < str.length(); i++) {
			
			char tmp =str.charAt(i);
			
			if ( ! ((tmp >= 'a' && tmp <= 'z') || (tmp >= 'A' && tmp <= 'Z'))) {
				
				System.out.println("영문자가 아닙니다!");
				return;
				
			}

		}
		
		

		System.out.println("문자를 입력하시오 : ");
		char ch = sc.next().charAt(0);
		
		int cnt = 0;
		
		for (int i = 0 ; i < str.length(); i++) {
			
			if (str.charAt(i) == ch)  {
				
				cnt++;
			}
		}
		System.out.println("포함된 갯수 : "  + cnt + "개");
	}

}
