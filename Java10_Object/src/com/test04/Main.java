package com.test04;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
		user u1 = new user(); //기본생성자를 이용하여 객체 생성
		u1.information();
		
		
		//public user(String userId,String userPwd,String userName)
		user u2 = new user("user01","pass01","안해림");
		u2.information();
		
		user u3 = new user("user02","pass02","김현영",new Date());
		u3.information();

	}

}
