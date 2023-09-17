package com.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Variable02 {
	//키보드 입력 : java.io 패키지에서 제공되는 클래스 활용
	public static void main(String[] args) {
		
		Variable02 var = new Variable02();
		//var.inputTest1();
		var.inputTest2();

	}
	
	
	public void inputTest1() {
		//현재위치(com.test)한 패키지 외 다른 패키지에 속한 클래스를 사용할 때 import 해줘야한다. 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
		String value = br.readLine();
		String value02 = value+"!!";
		System.out.println(value02);
		} catch(java.io.IOException e) {
			
			e.printStackTrace();
		}
		
		
		}
	
	
	public void inputTest2() {
		//java.util.Scanner
		//스캐너 준비하세요 할 때 밑에 한 줄 적기
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 입력 : ");
		String name = sc.nextLine();
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		
		System.out.println(name);
		System.out.println(age);
	}
		
	}
	
	
	
