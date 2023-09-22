package com.silsub1.model;
import java.util.Arrays;
import java.util.Scanner;

public class Sample {
	
	
	public void munjae1() {
		
		int arr [][] = new int[4][4];
		int [] sum_row = new int [3];
		int [] sum_col = new int [3];
		int num = 0;
		int num2 = 0;
		

		
		for(int i=0 ; i<3 ; i++) {
			
			
			for (int j=0 ; j<3 ; j++) {
				
				arr[i][j]= (int)(Math.random() * 100) + 1;	
				System.out.print(arr[i][j] + "\t");	
				num += arr[i][j]; // 랜덤 난수 구하고 행의 합계 구하기 
			} 			
			arr[i][3] = num;
			num = 0;	
			System.out.println();	
		} 
		
		for(int i=0 ; i<3 ; i++) {

			for (int j=0 ; j<3 ; j++) {
				
				num += arr[j][i]; // 열의 합계 구하기 
			} 			
			arr[3][i] = num;
			num = 0;
			
			System.out.println();	
		} 
		
		
		for(int i=0 ; i<3 ; i++) {
			
			num += arr[i][3]; //행의 합계 열의 합계 더하기
			num2 += arr[3][i];
			arr[3][3] = num +num2;
		}
		
		for(int i=0 ; i<4 ; i++) { //잘 나왔는지 확인 
			
			for (int j=0 ; j<4 ; j++) {
				
				System.out.print(arr[i][j] + "\t");	
			} System.out.println();
		}
		
		
		

	
	}
	
	 public void munjae2() {
		 
		 System.out.println("생성할 열의 개수를 입력하시오 : ");
		 Scanner sc = new Scanner(System.in);
		 int no = sc.nextInt();
		 int arr [][] = new int [3][no]; 
		 int num=0;
		 int rownum [];
		 
		 
			
			for(int i=0 ; i<3 ; i++) {
				for (int j=0 ; j< no ; j++) {
					arr[i][j]= (int)(Math.random() * 100) + 1;	
					System.out.print(arr[i][j] + "\t");	
					num += arr[i][j]; // 랜덤 난수 구하고 행의 합계 구하기 
			}   if (num%5==0) {
				System.out.println ("5의 배수인 행 번호는 : "+ i +"\t");
			    num = 0;	
				System.out.println();	
		} 

		 
		 
		 
		 
	 }

		
		
	}
	
}
		
	
