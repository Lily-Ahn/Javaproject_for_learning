package com.test02;

import com.test01.MethodTest01;

public class MethodTest03 /*extends MethodTest01 (<- 이 코드를 상속하겠다)*/ {
	
	public static void main (String[] args) {
		
		//method 호출방법(실행방법)
		//1. static method : 클래스명.메소드명();
		
		MethodTest01.publicMethod();
		//MethodTest01.protectedMethod(); 만약 상속 안하면 같은 패키지 안에서만 가능
		//MethodTest01.defaultMethod();
		//MethodTest01.privateMethod();
		
		//2. non static method :
		//            (1) 준비 :  클래스명 변수명 =  new 클래스명 ();
		//            (2) 실행 : 변수명.(*실행하려는*)메소드명();
		
		MethodTest01 mt01 = new MethodTest01();
		mt01.nonstaticMethod();
		
	}
}
