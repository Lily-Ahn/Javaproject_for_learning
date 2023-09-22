package com.inherit.test01;

public class Car {
	//필드
	private String color;
	private int speed;
	
	//메소드
	//생성자(기본생성자, 매개변수(2개)생성자
	
	public Car() { 
		super();
	};
	
	public Car(String color) {
		super();
		this.color = color;
	}
	public Car(String color, int speed) {
		super();
		this.color = color;
		this.speed = speed;
		
	}
	
	
	//getter & setter
	//필드 color의 getter 메소드
	
	public String getColor() {
		
		return color;
	}
	
	//필드 color의 setter 메소드
	public void setColor(String color) {
		this.color = color;
		
	}
	
	
	public int getSpeed() {
		
		return speed;
	}
	
	//필드 color의 setter 메소드
	public void setSpeed(int speed) {
		this.speed = speed;
		
	}
	
	public void accelPedal() {
		System.out.println("속도가 올라갑니다");
		setSpeed(getSpeed()+10);
	}
	
	public void breakPedal() {
		setSpeed(getSpeed()-10);
		
		if (getSpeed()>0) {
		System.out.println("속도가 내려갑니다");
		} else {
		System.out.println("멈췄습니다");
		setSpeed(0);
		}
	}
	
	@Override
	public String toString() {
		
		return "현재 속도는" + speed + "입니다";
	}


}
