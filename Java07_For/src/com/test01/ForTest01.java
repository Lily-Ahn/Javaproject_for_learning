package com.test01;
import java.util.Scanner;

public class ForTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ForTest01.testFor();
		//ForTest01.testFor2();
		//ForTest01.testFor3();
		ForTest01.testFor4();

	}
	
	public static void testFor() {
		//1~10 출력
		for ( int i = 1 ; i <=10 ; i++) {
			
			System.out.println("i : " + i);
		}
	}
	
	public static void testFor2() {
		//10~1 출력
		
		for(int i = 10; i>=1; i--) {
			
			System.out.println("i : " + i );
			
		}
		
		System.out.println();
		
		//반드시 1씩 증가할 필요는 없음
		for(int i = 0; i <10; i+=2) {
			
			System.out.println("i : " + i );
		}
		
		//초기식과 증감식은 1개 이상 작성이 가능하다 (조건식은 1개만 기입해야함)
		
		for (int i = 0 ,j = 10; i<10 && j>0 ; i++,j--) {
			
			System.out.println(i+"번째");
			System.out.println(j+"번째");
		}
		
		//char은 유니코드에 해당하는 숫자로 인식하여 실행 가능 
		for (char ch='a' ; ch <='z' ; ch++) {
			
			System.out.println(ch);
		}
		
		int i = 0;
		for(;;) {
			
			System.out.println(i);
			i++;
			
			if (i==10) {
				
				break;
			}
		}
	}
	
	public static void testFor3() {
		
		//정수를 하나 입력받아 그 수가 양수일 때만 그 수의 구구단을 출력
		//양수가 아니면 "반드시 1~9 사이의 양수만을 입력해야합니다" 출력
		
		System.out.println("1~9 사이의 양수를 입력하시오 : ");
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		
		if (no >=1 && no <=9) {
			
			for (int i=1; i<=9 ; i++) {	
				System.out.println( no + "*" + i + "=" + (no*i));	
			}
		}else {
			System.out.println("반드시 1~9 사이의 양수만을 입력해야합니다");
		}
	}
	
	public static void testFor4() {
		// 1~100 사이의 정수 중에 임의의 난수를 구한 다음
		// 1~난수 까지의 합계를 구한 후 출력하기
		
		int random = (int)(Math.random()*100)+1;
		int sum = 0;
		
		for (int i = 1; i <= random ; i++) {
			
			sum += i;	//sum = sum + i; 같음	
			
		} System.out.println(sum);
		
	}


}
