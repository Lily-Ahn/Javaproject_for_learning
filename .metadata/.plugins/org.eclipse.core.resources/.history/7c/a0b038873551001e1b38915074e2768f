package com.test01;

public class MethodTest01 {
	
	public static void main(String[] args) {
		//static method 실행 
		//클래스명.메소드명();
		MethodTest01.publicMethod();
		MethodTest01.protectedMethod();
		defaultMethod(); //클래스 안적어도 상관없지만 되도록 붙이기
		privateMethod();
		
	}
	
	//(+)public 은 접근제한자 
	//public 이라는 말은 어디서든, 누구나 접근 가능하다는 뜻, 기호는 '+' 임 
	public static void publicMethod() {
		
		System.out.println("public Method");
	}
	
	//(#)protected : 상속일 경우 상속된 곳에서, 상속이 아닌 경우에는 같은 패키지 안에서만 접근 가능 

	protected static void protectedMethod() {
		
		System.out.println("protected Method");
		
	}
	
	//default (default) : 같은 패키지 안에서만 접근 가능 
	
	static void defaultMethod() {
		
		System.out.println("default Method");
		
	}
	
	//(-)private : 현재 클래스 안에서만 접근 가능 
	
	private static void privateMethod() {
		
		System.out.println("private Method");
		
	}
	
	//non static Method
	public void nonstaticMethod() {
		System.out.println("nonstatic Method");
	}
	
}
