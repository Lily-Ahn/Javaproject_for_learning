package com.silsub2.point.model.vo;
import java.lang.Math;

public class Circle extends Point {
	
	int radius;
	
	public Circle (){};
	public Circle (int x , int y , int radius) {
		this.x = super.x;
		this.y = super.y;
	}
	
	public void draw() {
		super.draw();
		double res1 = Math.PI * radius * radius;
		double res2 = 2 * Math.PI * radius;
		
		System.out.println("원의 면적은 : " + String.format("%2,f", res1));
		System.out.println("원의 둘레는 : " + String.format("%2.f",res2));
		
		
	}
	

}
