package com.arrayPractice1.sample;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.lang.String;

public class ArraySample {
	
	
	public void test1() {
		
		int[] arr = new int[10];
		int sum = 0;
		
		for (int i=0; i<10 ; i++) {
			
			arr[i]=(int)(Math.random() * 100) + 1;
			sum += arr[i];
			System.out.print(arr[i] + " ");
			
		}   System.out.print("그리고 합계는" + sum);
		
	
	}
	
	
	public void test2() {
		
		
		int [] arr = new int[10];
		int [] num = new int[10];

		
		for (int i=0; i<10 ; i++) {
			arr[i]=(int)(Math.random() * 100) + 1;
	   }  
		
		Arrays.sort(arr);
		
		
		for (int i=0; i<10 ; i++) {
			System.out.print(arr[i] + "  ");
	  
	   }  
	
	}
	
	
	public void test3() {
		
		Random rd = new Random();
		byte [] barr = new byte[10];
		int sum = 0;
		
		
		for (int i=0; i<10 ; i++) {
			rd.nextBytes(barr);
			System.out.print(barr[i] + "  ");
		}  

		for (int i=0; i<10 ; i++) {
			
			if (barr[i]%2==0) {
				
				sum+=barr[i];
			}
		}
		
		System.out.println();
		System.out.print("byte 난수들 중 짝수의 합계 : " + sum );
	}
	
	
	public void test4() {
		
		int sum = 0;
		
		System.out.println("숫자로 된 문자열을 입력하시오 : ");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String [] arr = new String [str.length()];
		
		
		for (int i=0; i<str.length(); i++) {
			arr[i] = str.substring(i,i+1);
			
			sum+= Integer.parseInt(arr[i]);
		}
		System.out.println("합계 : " + sum);
		
	}	
	
	
	public void test5() {
		
		
		int sum = 0;
		
		System.out.println("숫자로 된 문자열을 입력하시오 : ");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char [] arr = new char [str.length()];
		
		
		for (int i=0; i<str.length(); i++) {
			arr[i] = str.charAt(i);
			
			sum+= Character.getNumericValue(arr[i]);
		}
		System.out.println("합계 : " + sum);

		
		
		
		
		
		
	}	
	

}
