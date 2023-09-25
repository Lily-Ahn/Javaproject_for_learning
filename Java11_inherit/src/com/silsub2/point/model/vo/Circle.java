package com.silsub2.point.model.vo;
import java.lang.Math;
import java.util.Scanner;

public class Circle extends Point {
	//필드
	private int radius;
	
	public Circle (){};
	public Circle (int x , int y , int radius) {
		super(x,y);
		this.radius = radius;
		
	}
	
	@Override
	public void draw() {
		//round() 메소드 사용하면 반올림이 됨
		super.draw();
		System.out.println("원의 면적은 : " + (int)( Math.PI * radius * radius)*10/10.0);
		System.out.println("원의 둘레는 : " + (int)( 2 * Math.PI * radius)*10/10.0);
		
		System.out.println(Math.round(Math.PI * radius * radius)*10/10.0);
		
		
		
	}
	

}
