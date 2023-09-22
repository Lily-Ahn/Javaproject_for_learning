package com.poly.test03;

public class Eagle extends Animal implements Bird {
	
	@Override 
	public void fly() {
		//interface bird에 선언되었던 추상메소드 구현
		System.out.println("파닥파닥");
	}
	
	@Override 
	public void bark() {
		//추상 클래스 Animla에 선언되었던 추상메소드 구현 
		System.out.println("웁니다");
	}


}
