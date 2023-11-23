package com.test02;

import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class Functional01 {

	public static void main(String[] args) {
		//unaryTest();
		//binaryTest();
		//prediTest();
		funcTest();

	}
	
	public static void unaryTest() {
		//unaryOerator -> 특정 type 인자 하나 받고, 동일타입 객체를 리턴하는 함수형 인터페이스
		//apply() 를 호출하여 작업수행
		
		//Test01 test01_1 =람다식
		UnaryOperator<String> hello = name -> "hello," + name;
		System.out.println(hello.apply("Lambda"));
	}
	
	public static void binaryTest() {
		BinaryOperator<Integer> sum = (i,j) -> i+j;
		System.out.println(sum.apply(10,3));
		
	}
	
	public static void prediTest() {
		//predicate : 인자 하나 받아, boolean 리턴하는 함수형 인터페이스 
		Predicate<Integer> p = (n) -> n%2 ==0;
		if(p.test(5)) {
			System.out.println("짝수입니다");
		} else {System.out.println("홀수입니다");
		}
		
	}
	
	public static void funcTest() {
		//Function - R apply (T t) 매개변수 ㅇ, 반환값 o.
		Function<Integer,String> t = n -> (n<10)? "0"+n : ""+n;
		System.out.println(t.apply(1));
		System.out.println(t.apply(11));
	}
	
	//그 외 
	//ByFunction - 매개변수 2개, 반환값 o, apply()
	//supplier - 매개변수 x , 반환값 o, get()
	//Consumer - 매개변수 o, 반환값x,accept()
	//BiConsumer - 매개변수2개, 반환값x , accept()

}
