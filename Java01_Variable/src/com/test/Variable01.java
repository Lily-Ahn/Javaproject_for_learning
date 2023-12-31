package com.test;

public class Variable01 {

	//main method: 메인 메소드, 프로그램의 진입점 , 프로그램 실행하는 기능
	public static void main(String[] args) {
	Variable01 var = new Variable01();
	//var.Test01();
	var.Test02();
	

	}
	
	//[변수선언 및 초기화]
	//자료형(타입) 변수명;
	//자료형: 생성할 변수의 종류(어떠한 종류의 값이 들어갈지 타입을 지정)
	//변수명:변수의 이름(방의 이름), 우리가 사용할 변수의 이름을 지정
	
	
	public void Test01() {
		//숫자
		//정수
		byte bnum;
		short snum;
		int inum;
		long lnum;
		
		//실수
		float fnum;
		double dnum;
		
		//논리
		boolean isTrue;
		
		//문자
		char ch;
		
		//문자열 (참조형,사용할 때에는 기본형처럼 사용 가능)
		String str;
		
		//변수에 값 대입
		bnum = 1;
		snum = 2;
		inum = 4;
		lnum = 8L; // L을 붙이지 않아도 자동형변환으로 long으로 변환
		
		fnum = 4.0f; 
		dnum = 8.0;
		
		isTrue = false; //true or false 값만 지정 가능 
		
		ch = 'A';
		str = "A";
		
		//변수에 저장된 값 출력하기 (출력문으로_)
		System.out.println("bnum : " + bnum);
		System.out.println("snum : " + snum);
		System.out.println("inum : " + inum);
		System.out.println("lnum : " + lnum);
		System.out.println("fnum : " + fnum);
		System.out.println("dnum : " + dnum);
		System.out.println("isTrue : " + isTrue);
		System.out.println("ch : " + ch);
		System.out.println("str : " + str);
		
		
	}
	
	//[변수 선언 동시에 초기화]
	public void Test02() {
		
		int inum = 4;
		double dnum = 8.5;
		String str = "안녕하세요.";

		
		System.out.println("inum : " + inum);
		System.out.println("dnum : " + dnum);
		System.out.println("str : " + str);
	}
}
