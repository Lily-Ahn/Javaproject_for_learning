package com.poly.silsub1.shape.model.vo;

public class Circle implements IShape {
	
	double P = Math.PI;
	double radius;
	
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public Circle(){
		super();
	}
	
	public Circle(double radius){
		this.radius = radius;
	}
	

	@Override 
	public double area(){
		return radius*radius*P;
	}
	
	@Override
	public double perimeter(){
		return 2*radius*P;
	}

}
