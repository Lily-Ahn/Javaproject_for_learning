package com.silsub2.point.model.vo;

public class Rectangle extends Point {
	//필드
	int width;
	int height;
	
	//생성자
	Rectangle(){};
	Rectangle(int x, int y, int width, int height){
		super(x,y);
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
		super.draw();
		System.out.println("사각형의 면적 : " + (int)(width*height)*10/10.0);
		System.out.println("사각형의 둘레 : " + (int)2.0*(width+height)*10/10.0);
		
	}

}
