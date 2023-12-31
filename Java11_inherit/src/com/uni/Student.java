package com.uni;

public class Student extends Human {
	
	private String number;
	private String major;
	
	Student(){}
	
	Student(String name, int age, int height, int weight, String number,String major){
		super(name,age,height,weight);
		this.number = number;
		this.major = major;
	}
	
	@Override
	String printinformation( ) {
		return name +"\t"+age+"\t"+height+"\t"+weight+"\t"+number+"\t"+major;
	
	}
	
	public String getNumber() {
		return number;
	}
	
	public void setNumber(String number) {
		this.number = number;
	}
	
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major=major;
	}
	
	
}
