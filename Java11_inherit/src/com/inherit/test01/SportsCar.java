package com.inherit.test01;

public class SportsCar extends Car {
	
	public SportsCar() {
	//기본생성자
	//super(); //모든 생성자에는 super(); 생략되어있어 생성자 호출시 부모 생성자 호출부터 된다
	System.out.println("sports car 생성");
		
	};
	
	//매개변수 생성자
	public SportsCar(String color) {
	super(color);	
	System.out.println( color + "색 sports car 생성");
	};
}
