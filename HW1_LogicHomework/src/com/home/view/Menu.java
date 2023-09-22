package com.home.view;
import com.home.controller.Function;
import java.util.Scanner;

public class Menu {
	
	public static void displayMenu(){
		
		Function Fc = new Function();
		Scanner sc = new Scanner(System.in);
		int num;
		
		do {
			
			System.out.println("\t" + "*** 변수/연산자/제어문 연습 프로그램 ***" + "\t");
			System.out.println("1. 간단 계산기");
			System.out.println("2. 작은수에서 큰수까지 합계구하기");
			System.out.println("3. 신상정보 확인하기");
			System.out.println("4. 학생정보 확인하기");
			System.out.println("5. 별과 숫자 출력하기");
			System.out.println("6. 난수까지의 합게 구하기");
			System.out.println("7. 구구단");
			System.out.println("8. 주사위 숫자 알아맞추기 게임");
			System.out.println("9. 프로그램 종료");
			System.out.println();
			System.out.println("메뉴번호 입력 : ");
			
			num = sc.nextInt();
			
			
			switch (num) { 
			
			case 1:
				Fc.calculator();				
			break;
			
			case 2:				
				Fc.totalCalculator();				
			break;
			
			case 3:
				Fc.profile();
			break;
			
			case 4:
				Fc.sungjuk();
			break;
				
			case 5:
				Fc.printStarNumber();
			break;
					
			case 6:
				Fc.sumRandomNumber();
			break;
		    			
			case 7:
				Fc.continueGugudan();
			break;
			
			case 8:
				Fc.shutNumber(); 
			break;
				
			case 9:
			    System.out.println("프로그램이 종료됩니다.");
				System.out.println();			
			break; 
				
			default : 		
				System.out.println("해당하는 번호가 없습니다. 다시 입력하십시오");
				System.out.println();	
			} 
			
		} while (num < 9 || num > 9);
		
		
	}
	
	
	
	
	
	

}
