package com.silsub2.point.model.vo;

public class Rectangle extends Point {
	
	int width;
	int height;
	Point rp;
	
	
	Rectangle(){};
	Rectangle(int x, int y, int width, int height){
		this.x = super.x;
		this.y = super.y;
		this.width = width;
		this.height = height;
	}
	
	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	@Override
	public void draw() {
		int recarea= x*y;
		int roundarea= 2*(x+y);
		System.out.println("사각형의 각 x,y 좌표는 : ");
		System.out.println("사각형의 둘레는 : " + String.format("%1.f", roundarea));
		System.out.println("사각형의 면적은 : " + String.format("%1.f", recarea));
		
	}

}
