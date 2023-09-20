package com.test03;


//변수 선언 위치에 따른 구분
public class KindsOfVariable01 { //클래스 영역의 시작
	
	//클래스 영역에 작성하는 변수필드
	//필드 == 멤버변수 (얘는 클래스가 가지는 멤버라는 의미) == 전역변수 (클래스 전역에서 사용 가능한 변수라는 의미)
	private int globalnum;
	
	public void testmethod(int num) { //메소드 영역의 시작
		//메소드 영역에서 작성하는 변수 지역변수
		//메소드의 괄호 안에 선언하는 변수 매개변수 (매개변수도 일종의 지역변수)
		int localnum;
		
		//지역변수는 선언외에 사용하기 위해서는 반드시 초기화가 되어야한다. 
		//System.out.println(localnum);
		
		//매개변수는 호출시 값이 넘어와서 변경되기 때문에 초기화가 필요없다.
		System.out.println(num);
		
		System.out.println(globalnum); //필드(전역변수)는 클래스 전역에서 사용 가능하다 
		
		
	} //메소드 영역의 끝
	
	public void testmethod2() {
		System.out.println(globalnum); //전역변수는 다른 메소드에서도 사용 가능 
		//System.out.println(num); //지역변수는 해당지역(블럭,영역)에서만 사용 가능 
		
		
		
		
	}
}//클래스 영역의 끝
