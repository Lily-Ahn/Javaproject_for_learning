package com.test01;

public class WhileTest02 {

	public static void main(String[] args) {
		// 1.1~100까지의 숫자를 역순으로 출력하자 (세 문제 다 while 문만을 사용)
		//WhileTest02.prn01();

		// 2.1~100까지의 숫자 중, 2의 배수만을 출력하자
		//WhileTest02.prn02();
		
		// 3.1~100까지의 숫자 중 7의 배수의 갯수와 총합을 구하여 출력하자 
		WhileTest02.prn03();

	}
	
	public static void prn01() {
		
		System.out.println("[prn01]");
		
		int i = 100;
		
		while (i >= 1) {
			
			System.out.println(i);
			
			i--;			
		}
		
		
	}
	
	public static void prn02() {
		
		System.out.println("[prn02]");
		
		int i = 1;
		while (i <= 100 ) {
				
			if (i%2 == 0) {
				System.out.println(i);
			} else {}
			   
			i++;
			
		}
					
	}
		
	
	
	public static void prn03() {
		
		System.out.println("[prn03]");
		
		int i = 1;
		int sum = 0;
		int count = 0;
		while (i <= 100 ){
			
			if (i%7==0) {
				
				sum = sum + i ;
				count = count +1 ;
				
			} else {}
			
			i++;
		}
		
		System.out.println("1~100 중 7의 배수의 갯수 : " + count);
		System.out.println("1~100 중 7의 배수의 총합 : " + sum);
		
	}

}
