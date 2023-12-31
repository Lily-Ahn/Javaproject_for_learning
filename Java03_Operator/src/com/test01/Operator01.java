package com.test01;
import java.util.Scanner;

public class Operator01 {
	
	public static void main(String[] args) {
		
		//static 메소드 호출 
		//클래스명.메소드명();
		
		//Operator01.test01();
		
		//non static 메소드 호출
		//1. 준비 : 클래스명 변수명 = new 클래스명 
		
		Operator01 op = new Operator01();
		
		//2. 실행 : 변수명.메소드명();
		op.test02();
		op.test03();
		
	}
	
	// ! : 논리부정연산자
	// !true => false , !false => true
	public static void test01() {
		
		System.out.println("true의 부정 : " + !true);
		System.out.println("flase의 부정 : " + !false);
		
		
		//키보드로 정수하나 입력받아 짝수인지 확인해보자.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수하나 입력 : ");
		int num = sc.nextInt();
		
		System.out.println("입력한 정수가 짝수인가? " + (num%2 == 0));
		System.out.println("입력한 정수가 홀수인가? " + (num%2 != 0 ));

	}
	
	public void test02() {
		//증감연산자
		
		int age = 20;
		System.out.println("현재 나이는? " + age);
		
		++age;
		System.out.println("++age 결과 : " + age);
		age++;
		System.out.println("age++ 결과 : " + age);
		
		--age;
		System.out.println("--age 결과 : " +age);
		
		/////
		
		int num1 = 20;
		
		//후위연산자
		//다른 연산(계산)을 먼저 처리하고 난 뒤 증감 처리 
		
		int res = num1++*3;
		System.out.println("res : " + res);
		System.out.println("num1 : " +num1);
		
		int num2 = 20;
		
		//전위연산자
		//증감을 먼저 처리하고 난 후 다른 연산(계산)을 함
		
		int res2 = ++num2*3;
		System.out.println("res2 : " + res2);
		System.out.println("num2 : " + num2);
		
	}
	
	public void test03() {
		//비교연산자 : 두 개의 값(변수)을 비교하여 조건에 만족하면 true, 아니면 false 반환
		// > , < , == , != , >= , <=
		
		int a = 10 , b = 20;
		boolean res1,res2,res3;
		
		res1 = (a == b);
		res2 = (a <= b);
		res3 = (a > b);
		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res3);
		
		
	}
	

}
