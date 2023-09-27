package com.chap03_myException;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나 입력 : ");
		try {
			check(sc.nextInt());
		} catch (MyException e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
	
	public static void check(int num) throws MyException {
		if (num<=0 || num>=10) {
			/*예외발생 
			MyException me = new MyException();
			throw me;
			*/
			//2. 
			throw new MyException("1~9사이의 숫자가 아닙니다.");
			
		} else {	
		System.out.println("100을 " +num+" 으로 나눈 몫 : " + (100/num));
		}
	}

}
