package com.test05_02;

public class MethodTest {
	
	//매개변수 유무와 반환값 유무에 따른 구분
	
	//1.매개변수 없고 반환값 없는 메소드
	public void method1() {
		//아무런 값도 반환하지 않고 메소드 내용만 수행 후 리턴값 없이 호출한 메소드로 돌아간다.
		//저장되는 (반환되는 ,나한테 돌아오는 ) 값이 없이 실행만 하고 끝남 
		System.out.println("매개변수와 반환 값이 둘 다 없는 메소드입니다");
		return; //메소드에 생략되어있음 (JVM 이 자동처리)
	}
	
	
	//2.매개변수 없고 반환값 있는 메소드
	
	public String method2() {
		return "매개변수는 없고 반환 값이 있는 메소드입니다";
	}
	
	//3.매개변수 있고 반환값 없는 메소드
	
	public void method3 (int num1, int num2) {
		//호출하는 쪽의 괄호에 인자로 넘긴 값을 받기 위해 선언하는 것이 매개변수
		//메소드 선언시 괄호 안에 변수를 선언하여 메소드 안에서만 사용한다. 
		int sum = num1+num2;
		System.out.println("sum : " + sum );
		return;
	}
	
	
	
	//4.매개변수 있고 반환값 있는 메소드
	public int method4(int num1, int num2) {
		//넘겨받은 값이 저장된 매개변수를 메소드 내에서 사용할 수 있으며,
		//리턴값으로 메소드 선언시 지정한 타입과 일치하도록 값을 return 해주어야 한다. 
		return num1+num2;
		//return sum;
	}

}
