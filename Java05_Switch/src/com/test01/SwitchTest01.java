package com.test01;
import java.util.Scanner;

public class SwitchTest01 {
	//조건식의 값에 따라 case 를 찾아 명령을 수행하는 조건문이다. 
	
		public void test() {
			int no = 5;
			
			switch(no) {
			
			case 1: 
				System.out.println("1입니다.");
				break;
			case 2:
				System.out.println("2입니다.");
				break;
			case 3:
				System.out.println("3입니다.");
				break;
			default:
				System.out.println("아닙니다!");
				break;
				
			}
		}
		
		public void test2() {
			//char type의 값을 switch문에 사용(string도 가능)
			
			char ch = 'a';
			
			switch(ch) {
			
			case 'a' :
				System.out.println("a!!");
				break;
			case 'b' :
				System.out.println("b@@");
				break;
			case 'c' :
				System.out.println("c##");
				break;
			default :
				System.out.println("아닙니다!!");
			
			}
			
			
			String str = "한국";
			
			switch(str) {
			
			case "한국" :
				System.out.println("kor");
				break;
			case "미국" :
				System.out.println("usa");
				break;
			case "영국" : 
				System.out.println("uk");
				break;
			default : 
				System.out.println("no!!");
				
			}
	
		}
		
		public void test3() {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("월 입력 : ");
			int month = sc.nextInt();
			
			switch(month) {
			
			case 12 :
			case 1 :
			case 2 : 
				System.out.print("겨울");
			break;
			
			case 3 :
			case 4 :
			case 5 :
				System.out.print("봄");
			break;
			
			}
			
		}

		
	}

