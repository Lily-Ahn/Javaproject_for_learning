package com.poly.test03;

public abstract class Animal { 
	//클래스는 클래스인데 추상클래스 넣어도 된다 :abstract
	
	public abstract void bark();
	
	public void eat(String animal) {
		
		System.out.println(animal + "먹는다!!");
	}

}
