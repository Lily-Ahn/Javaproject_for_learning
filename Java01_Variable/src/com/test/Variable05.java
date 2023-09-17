package com.test;

public class Variable05 {
	//형변환
	//자동형변환, 강제형변환
	
	
	public static void main(String[] args) {
		Variable05 var = new Variable05();
		var.test01(); // 이 실행과정은 static 이 아닌 메소드 실행시 필요한 코드
	}
	
	public void test01() {
		//자료형이 다르더라도 작은크기의 타입은 큰 크기의 타입으로 저장가능. (자동형변환, upcasting, 묵시적 형변환)
		// 하지만 큰 크기의 타입은 작은크기의 타입으로 자동 변환되지 않기 때문에 형변환을 명시해야한다 (강제형변환, downcasting, 명시적 형변환)
		//변경할 값(변수) 앞에 (변경할 타입) 을 지정해주면 된다. 
		
		int num = 'a';
		System.out.println("num : " + num );
		
		char ch = 65;
		System.out.println("ch : " + ch);
		
		ch = (char)num ;
		
		long no = 65;
		double dno = 65;
		
		
		////
		
		int inum = 10;
		long  lnum = 100;
		
		//에러
		//int isum = inum + lnum;
		//1. 수행결과를 int로 강제 형변환
		int isum = (int)(inum + lnum);
		System.out.println("isum : " + isum);
		
		//2.long type 값을 int 로 먼저 강제 형변환
		
		int isum2 = inum + (int)lnum;
		System.out.println("isum2 : " + isum2);
		
		//3. 수행결과를 long 타입의 변수에 저장 
		
		long lsum = inum + lnum ; 
		System.out.println("lsum : " + lsum);
		
		
		//강제적으로 형변환 함으로써 데이터가 사라지는 모습을 확인해보자. 
		
		double dnum = 1234.56;
		System.out.println("dnum : " + dnum);
		
		int res = (int)dnum;
		System.out.println("res : " + res );
		System.out.println ("double(res) : " + (double)res );
		
		
	}
	
	
	
	
}
