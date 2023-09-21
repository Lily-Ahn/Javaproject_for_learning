package com.test05_02;

public class Main {

	public static void main(String[] args) {
		MethodTest mt = new MethodTest();
		//1.매개변수와 반환값이 없는 메소드 호출 
		mt.method1();
		
		//2.매개변수가 없고 반환값이 있는 메소드 호출 
		//메소드와 리턴타입이 일치하는 자료형의 변수에다가 리턴값을 담아서 사용
		String res = mt.method2();
		System.out.println(res);
		
		//리턴 값을 바로 사용
		System.out.println( mt.method2());
		
		//3.매개변수가 있고 반환값이 없는 메소드 
		mt.method3(3,3);
		
		//4.매개변수가 있고 반환값이 있는 메소드 
		System.out.println( "res : " + mt.method4(5,5));

	}

}
