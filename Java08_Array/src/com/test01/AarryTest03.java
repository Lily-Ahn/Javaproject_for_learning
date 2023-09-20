package com.test01;

public class AarryTest03 {

	public static void main(String[] args) {
		//배열을 하나 만들어서 데이터를 입력 
		char[] ch = new char[26];
		for (int i=0; i <26; i++) {
			
			ch[i] = (char)((int)'a' + i);
		}
		
		/* char[] bigch = new char[26];
		for (int i=0; i<26;i++) {
			
			bigch[i] =(char)((int)'A'+i);
			
		} */
		
		//1. a~z 일차원 배열 출력 
		
		//prn(ch);
		//System.out.println();
		//reverse(ch);
		//System.out.println();
		
		upper(ch);
		
		
		//2. 만든 배열(ch) 거꾸로 출력 
		//3.만든 배열(ch)을 대문자로 변경

	}
	
	public static void prn(char[] ch) {
		
		for(int i = 0; i<ch.length; i++) {
			
			System.out.print(ch[i]);
		}
		
	}
	
	public static void reverse(char[] ch) {
		
		for(int i = ch.length-1; i>=0 ; i--) {
			
			System.out.print(ch[i]);

			}
	}
	
	
	public static void upper(char[] ch) {
		
		
		for( int i = 0; i<ch.length; i++) {
			
			ch[i] = (char)(ch[i] -32);
			
			System.out.print(ch[i]);

			}
	}
		
		
	

}
