package com.test01;
import java.util.Scanner;

public class ForTest02 {

	public static void main(String[] args) {
		
		//ForTest02.testFor1();
		//ForTest02.testFor2();
		//ForTest02.testFor3();
		//ForTest02.testFor4();
		//ForTest02.testFor4();
		ForTest02.testFor5();

	}
	
	public static void testFor1() {
		
		for(int i = 0 ; i <10 ; i++) {
			
			for (int j = 0 ; j<10 ; j++) {
				System.out.println("i=" + i + " , j= " + j );
			}	
		}
	}
	
	public static void testFor2() {
		//구구단을 2단부터 9단까지 출력
		
		for (int i = 2 ; i <= 9 ; i++) {
			
			for (int j =1 ; j <=9 ; j++) {
				
				System.out.println( i + "*" + j + "=" +(i*j) );
				
			}		
		}
	}
	
	public static void testFor3() {
		//*****
		//*****
		//*****
		// .
		// .
		// .
		//
		//*****
		//*****
		//입력받은 숫자만큼 줄을 출력 
		
		for (int i = 1 ; i <=7 ; i ++)   {
			
		  for ( int j = 1 ; j <=5 ; j++) {
			System.out.print( "*" );
			  }
		    System.out.println();
		}
	
	}
	
	public static void testFor4() {
		
		//입력된 줄수와 칸수만큼 *문자를 출력
		//단, 줄수와 칸수가 일치하는 위치에는 줄 번호에 대한 정수가 출력
		/*
				* 1*****
				* *2****
				* **3***
				* ***4**
				* ****5*
				* *****6
				* */
		
		System.out.println("줄수를 입력하시오 : ");
		System.out.println("칸수를 입력하시오 : ");
		Scanner sc = new Scanner(System.in);
		int no1 = sc.nextInt();
		int no2 = sc.nextInt();
		
		for (int i = 1; i <= no2; i++) {
			
			for (int j = 1; j <= no1; j++) {
				
				
				if (i == j) {
					
					System.out.print(i);
					
				} else {System.out.print("*");}
				
			} System.out.println();
		
		}
	}
	
	public static void testFor5() {
		
		        // 1  2  3  4  5
				// 6  7  8  9  10
				// 11 12 13 14 15
				// 16 17 18 19 20
				// 21 22 23 24 25
				// 대각선의 합
		 
		int num = 1;
		int sum1 = 0;
		int sum2 = 0;
		
		for (int i=1; i <= 5; i++) {
			for (int j=1; j <=5; j++) {
				System.out.print(num + "\t");
				
				//for 문 제일 안 쪽에서 대각선의 합을 구하여 sum 변수에 저장 
				
				if ( i == j) {			
					sum1 += num;
				} else {}
				if ( i + j == 6 ) {
					sum2 += num;
				} else {}
				
				//num 증가 
				
				num = num+1;
				
				
			} System.out.println();
		}
		 System.out.println("왼쪽부터의 대각선의 합 : " + sum1);
		 System.out.println("오른쪽부터의 대각선의 합 : " +sum2);

		
	}			
	
}
