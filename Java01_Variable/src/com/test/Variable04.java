package com.test;

public class Variable04 {

	public static void main(String[] args) {
		Variable04 var = new Variable04();
		var.test01();
		var.test02();
		
		
		
	}
	
	
	public void test01() {
		//변수 사이즈 출력
		
		System.out.println("byte의 크기 : " + Byte.BYTES);
		System.out.println("int의 크기 : " + Integer.BYTES);
		System.out.println("double의 크기 : "+ Double.BYTES);
		System.out.println("char의 크기 : " + Character.BYTES);
	}
	
	
	
	public void test02() {
	//오버 플로우
		
		//byte bnum = 128;
		//범위보다 큰 값을 집어넣을려고 하면 에러뜸
		//계산 과정에서 범위를 벗어나면 오버플로우 발생함 

		byte bnum = 127;
		bnum++;
		
		System.out.println("bnum : " + bnum);
		
		
		
		
	}
}
