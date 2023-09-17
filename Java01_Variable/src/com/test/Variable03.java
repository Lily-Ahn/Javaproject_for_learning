package com.test;

public class Variable03 {

	public static void main(String[] args) {
		
		//상수 테스트 
		
		int age;
		final int AGE;
		
		age = 20;
		AGE = 20;
		
		System.out.println("age : " + age);
		System.out.println("Age : " + AGE);
		
		age = 21;
		//AGE = 21;
		//에러발생, final 상수는 변경 불가 
		
		//상수는 한 번 값을 기록한 후에는 변경 불가능하다. 
		
		
	}
	
	
}
