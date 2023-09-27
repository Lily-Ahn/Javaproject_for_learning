package com.poly.silsub1.shape.controller;
import com.poly.silsub1.shape.model.vo.*;


public class ShapeManager {
	
	public void calcShape() {
		
		IShape s;
		
		s = new Circle(15.5);
		System.out.println("원면적 : " + s.area());
		System.out.println("원둘레 : " + s.perimeter());
		
		s = new Rectangle(34.5 , 42.7);
		System.out.println("사각형 면적 : " + s.area());
		System.out.println("사각형 둘레 : " + s.perimeter());
		
	}
	
	public void calcShapeArray(){
		
		IShape[] iarr = new IShape[5];
		
		for(int i=0; i <5;i++) {
			double r = (int)(Math.random()*100)+1;
			iarr[i] = new Circle(r);
			System.out.println("반지름 : " + r );
			System.out.println("원면적 : " + iarr[i].area());
			System.out.println("원둘레 : " + iarr[i].perimeter());
			
			System.out.println();
			
			double height = (int)(Math.random()*100)+1;
			double width = (int)(Math.random()*100)+1;
			iarr[i] = new Rectangle(width,height);
			System.out.println("사각형 밑변 : " +  width );
			System.out.println("사각형 높이 : " +  height );
			System.out.println("사각형 면적 : " +  iarr[i].area());
			System.out.println("사각형 둘레 : " +  iarr[i].perimeter());
			
			System.out.println();
			
			double base = (int)(Math.random()*100)+1;
			iarr[i] = new Triangle(base,height);
			System.out.println("사각형 밑변 : " +  base );
			System.out.println("사각형 높이 : " +  height );
			System.out.println("삼각형 면적 : " +  iarr[i].area());
			System.out.println("삼각형 둘레 : " +  iarr[i].perimeter());
			System.out.println("삼각형 빗변 : " +  ((Triangle)iarr[i]).getHypotenuse());
			
			System.out.println();
			
		}
		
		
		
		
	}
	

}

