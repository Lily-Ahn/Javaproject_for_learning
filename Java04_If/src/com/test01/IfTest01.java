package com.test01;
import java.util.Scanner;

public class IfTest01 {
	
	public void testIf() {
		//단독 if 문
		//조건식의 결과값이 true이면 {} 안에 있는 코드를 실행.
		//조건식의 결과값이 false이면 {} 안에 있는 코드를 무시하고 넘어감 
	
		int num = 3;
		// 짝수인지 조건을 통해 확인 후 출력문으로 출력
		// 짝수인지 조건을 확인함
		if( num%2 == 0 ) {
			
			//조건이 참일때 수행 , 조건 거짓이면 건너 뜀 
			System.out.println("짝수입니다.");
		}
		
		//짝수가 아닌지 조건을 확인함 (즉, 홀수인지 확인)
        if( num%2 != 0 ) {
			System.out.println("홀수입니다.");
			 }
		System.out.println("종료!");	
		
	}
	
	
	
	public void testIfElse1() {
		
		//if ~ else
		// 둘 중 하나를 선택하는 조건문을 통해 , 조건이 참인 경우와 거짓인 경우 중 하나를 수행
		
		int num = 3;
		//짝수인지 확인하는 조건 
		
		if( num%2 == 0 ) {	
			//조건이 참일 때 실행 
			System.out.println("짝수입니다!");
		}  else {
			//조건이 거짓일 때 실행 
			System.out.println("홀수입니다!"); 
			}
	}
	
	
	
	
	public void testIfElse2() {
		//50 보다 큰수일 때(50이상) 짝수면 "50보다 큰 짝수" , 홀수면 "50보다 큰 홀수" 
		//"50보다 크다", 50보다 작은 수라면(미만) "50보다 작다" 라고 출력 
		
		int num = 53;
		
		if (num >=50) {
			
			if (num%2 == 0)
			
			{System.out.println("50보다 큰 짝수");}
			
			else {System.out.println("50보다 큰 홀수");}
			
		}
		
		else { 
			System.out.println("50보다 작다");			
		}
	}
	
	
	public void testIfElse3() {
		// 정수 하나 입력받아 양수인지 음수인지 출력
		//단, 0이면 "0입니다" 라고 출력 ( if ~ else 문으로 중첩해서 )
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("정수가 양수인지 음수인지 확인 : ");
		
		int num = sc.nextInt();
		
		if (num > 0) {System.out.println("양수입니다");}
		
		else { if (num < 0) {System.out.println("음수입니다");}
		
		else System.out.println("0입니다"); }
		
	}
		
		
		
		
	}
	
	
	
	
	

