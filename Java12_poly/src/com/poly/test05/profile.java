package com.poly.test05;

public class profile {
	
	
	//필드
	private String name;
	private String Phone;
	
	//생성자
	public profile() {}
	public profile(String name, String Phone) {
		this.name = name;
		this.Phone = Phone; 
		
	}
	
	//getter&setter
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getphone() {
		return this.Phone;
		
	}
	
	public void setPhone(String Phone) {
		this.Phone = Phone;
		
	}
	
	public void printProfile() {
		
		System.out.println("이름 : " + name);
		System.out.println("전화번호 : " + Phone);
		
		
		
	}
	



}
