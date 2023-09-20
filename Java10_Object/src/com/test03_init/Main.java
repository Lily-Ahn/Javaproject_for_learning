package com.test03_init;

public class Main {

	public static void main(String[] args) {
		InitBlock p = new InitBlock(); //기본생성자로 객체 생성
		p.information();
		
		InitBlock p2 = new InitBlock("z플립",1200000,"samsung");
		p2.information();
		

	}

}
