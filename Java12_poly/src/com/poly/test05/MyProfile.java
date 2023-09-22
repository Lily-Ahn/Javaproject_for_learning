package com.poly.test05;

public class MyProfile extends profile implements Job, Display {
	//implements 는 여러개 상속이 가능하다 
	//필드
	private String loc;
	
	//생성자
	public MyProfile() {} //기본생성자
	public MyProfile(String name, String Phone) { //매개변수 생성자
		super(name,Phone);
		
	}
	
	//로케이션 초기화 
	@Override
	public void jobLoc(String loc) {
		this.loc = loc;
		
	}
	
	@Override
	public void display() {
		
	
	super.printProfile();
	System.out.println("회사 주소 : " + loc);
	System.out.println("회사 직종 : " + Job.jobId);
	
	}

}
