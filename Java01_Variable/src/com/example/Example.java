package com.example;
import java.util.Scanner;

public class Example {
	
	public void example1() {
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("첫번째 정수 : ");
		System.out.println("두번째 정수 : ");
		
		int num1 = sc1.nextInt();
		int num2 = sc1.nextInt();
		
		System.out.println("더하기 결과 : " + (num1 + num2));
		System.out.println("빼기 결과 : " + (num1 - num2));
		System.out.println("곱하기 결과 : " + (num1*num2));
		System.out.println("나누기한 몫 : " + (num1 / num2));
		System.out.println("나누기한 나머지 : " + (num1 % num2));
		
	}
	
	public void example2() {
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("가로 : ");
		System.out.println("세로 : ");

		float num3 = sc2.nextFloat();
		float num4 = sc2.nextFloat();
		
		System.out.println("면적 : " + (num3 * num4));
		System.out.println("둘레 : " + (2*(num3 + num4)));
		
		
	}
	
	public void example3() {
		
		Scanner sc3 = new Scanner(System.in);//키보드로 입력 받기
		System.out.println("문자열을 입력하시오 : "); //입력받을 제시문구 제시
		
		String str1  = sc3.next(); // 스캐너 준비해서 사용자가 입력할 수 있도록 제시
		
		//공백 필요 = nextline , 공백제외 = next
						// charat= 글자 하나만 잘라오겠다
						// 준비된 글자 출력 
						// 글자 준비= 모드 변수 = (적용할 변수).함수(몇번째글자)
						
						System.out.println("첫번째 문자 : " + str1.charAt(0) );
						System.out.println("두번째 문자 : " + str1.charAt(1) );
						System.out.println("세번째 문자 : " + str1.charAt(2) );
						System.out.println("입력된 글자 갯수 : " + str1.length());
						

	}
	
	
}
