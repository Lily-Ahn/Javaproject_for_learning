package com.test01;

public class Main {

	public static void main(String[] args) {
		//객체 생성
		Account a = new Account();
		Account b = new Account();
		
		//잔액조회
		a.prnBalance();
		
		//입금
		a.in(10000);
		a.prnBalance();
		
		a.in(15000);
		a.prnBalance();
		
		
		//출금
		a.out(5000);
		a.prnBalance();
		
		b.prnBalance();
		
		//a.balance -=20000; //필드 접근제한을 하지 않아 balance에 접근 가능
		//private 로 접근을 제한하였기 때문에 더이상 접근 불가능
		
		a.out(15000);
		a.prnBalance();
	}

}
