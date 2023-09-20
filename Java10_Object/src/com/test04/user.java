package com.test04;

import java.util.Date;

public class user {
	
	private String userId;
	private String userPwd;
	private String userName;
	Date date;
	
	//생성자
	//1.객체 생성해주기 위한 목적
	//2.매개변수로 전달받은 값으로 필드를 초기화할 목적
	
	//생성자 사용시 주의할 점 
	//1. 반드시 클래스명과 동일하게 생성 (대/소문자구분)
	//2. 리턴형이 존재하지 않는다(void,int ,char ... x )
	
	//기본생성자 : field 초기화 역할은 수행하지 못하고 객체만 생성할 때 사용
	public user() {};
	
	//매개변수 있는 생성자 : 객체 생성과 필드를 초기화하는 두가지 목적으로 사용 
	public user(String userId,String userPwd,String userName) {
		//this. 숨겨진채 존재하는 레퍼런스변수 . 할당된 객체 자신을 의미 (객체의 주솟값)
		//지역변수와 필드의 이름이 동일할 경우 지역변수가 우선시된다. 
		//필드와 지역변수를 구별하기 위해 this.을 명시해주어야한다 
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
		
		
	}
	
	public user(String userId,String userPwd,String userName,Date date) {
		//this. 숨겨진채 존재하는 레퍼런스변수 . 할당된 객체 자신을 의미 (객체의 주솟값)
		//지역변수와 필드의 이름이 동일할 경우 지역변수가 우선시된다. 
		//필드와 지역변수를 구별하기 위해 this.을 명시해주어야한다 
		//this.userId = userId;
		//this.userPwd = userPwd;
		//this.userName = userName;
		//중복되는 동일한 초기화하는 내용의 생성자가 존재하는 경우 this() 를 이용해 사용 가능 
		//this() 가장 첫줄에 사용해야한다. 
		this(userId,userPwd,userName); //같은 클래스 내 다른 생성자 호출 
		this.date = date;
		
		
	}
	
	
	

	//저장된 필드값 출력용 메소드 
	
	public void information() {
		
		
		System.out.println(userId +","+ userPwd+","+userName+","+date);
		
	}
	
	
	
	
	

}
