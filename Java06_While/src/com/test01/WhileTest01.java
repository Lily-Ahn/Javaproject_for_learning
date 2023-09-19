package com.test01;
import java.util.Scanner;

public class WhileTest01 {

	public static void main(String[] args) {
		// static method 실행 
		//클래스명.실행을 할 메소드명;
		
		//WhileTest01.testWhile();
		//WhileTest01.testWhile2();
		//WhileTest01.testWhile3();
		//WhileTest01.testWhile4();
		//WhileTest01.testWhile5();
		//WhileTest01.testDoWhile();
		WhileTest01.testDoWhile2();

	}
	
	
	public static void testWhile() {
		
		//초기식
		
		int i = 10;
		
		while(i <= 19) { //조건식
			
			System.out.println(i + "번째 반복분 수행 중 ... .");
			
			i ++;
	
		}	
	}
	
	public static void testWhile2() {
		
		String str = "apple@#$";
		
		int index = 0;
		
		while( index < str.length() ) {
			
			char ch = str.charAt(index);
			
			System.out.println(index + " : " + ch);
			
			index ++;
			
			
			
		}

	}
	
	public static void testWhile3() {
		//1부터 입력받은 수까지 정수들의 합
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 하나 입력 : ");
		
		int num = sc.nextInt();
		int sum=0;
		int i=1;
		
		while (i <= num) {
			
			sum = sum+i;			
			i++;
			
		}
		
		System.out.println(sum);
				
	}
	
	public static void testWhile4() {
		int i = 1;
		while (true) {
			
			System.out.println(i);
			
			i++;
			
			if (i == 10) {
			break;
			}			
		}
		
		System.out.println("종료 후 i 값 : " + i);
	}
	
	
	public static void testWhile5() {
		//반복하여 키보드로 숫자를 입력받자
		//단, 4가 되면 while 문 종료
		Scanner sc = new Scanner(System.in);
		
		
		while (true) {
			System.out.println("정수입력");
			int 숫자 = sc.nextInt();
			
			if (숫자 == 4 ) {
				
				System.out.println("숫자가 4가 되어 종료합니다");
				
				break;			
			}  
		}			
	} 
	
	
	 public static void testDoWhile () {
		 int i = 1;
		 do {
			 System.out.println(i);
			 i ++;
		 } while(i <= 10 );
		 
		 	 
	 } //---------------------------------
	 
	 // do { 
	 // System.out.println(i);
	 // i++;
	 // } while (i < = 10);
	 
	 //while (i==10) {
	 //System.out.println(i);
	 // i ++;
     // }
	 public static void testDoWhile2() {
		 //영어 문자열을 입력받아 입력받은 문자열을 출력
		 //단, end 라는 문자열을 입력 받으면 반복 종료
		 
		 Scanner sc= new Scanner(System.in);
		 String str = null;
		 
		 do {
			 System.out.println("문자열 입력 : ");
			 str = sc.next();
			 System.out.println("str : " + str);
		 } while (!str.equals("end"));

	 }
	 
	 
	
}

