package com.poly.silsub1.shape.model.vo;

public class Rectangle implements IShape {
	
	double width;
	double height;
	
	
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	public Rectangle(){
		super();
	}
	public Rectangle(double width,double height){
		this.width = width;
		this.height = height;
	}
	

	@Override
	public double area() {
		return width*height;
	}
	
	@Override
	public double perimeter() {
		return 2*(width+height);
	}
	

}
