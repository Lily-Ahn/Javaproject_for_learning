package com.test01;
import java.util.Scanner;

public class IfTest02 {
	
	//else if 
	//조건을 다중조건으로 줄 수 있다. 
	
	public void testElseIf() {
		
		int no1 = 30;
		int no2 = 20;
		
		if (no1>no2) {
			System.out.println(no1+"은 "+no2+"보다 큽니다.");	
		}
		
		else if (no1<no2) {
			System.out.println(no1+"은 "+no2+"보다 작습니다.");		
		}
		
		else {
			
			System.out.println(no1+"은 "+no2+"와 같습니다.");
		}
		
	}
	
	public void testElseIf2() {
		
		//점수를 하나 입력받아 등급을 나누어 점수와 등급을 출력합니다. 
		//90점 이상은 A등급
		//90점 미만, 80점 이상은 B 등급 
		//80점 미만, 70점 이상은 C 등급 
		//70점 미만, 60점 이상은 D 등급 
		//60점 미만은 F 등급으로 나눈다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수 입력 : ");
		
		int score = sc.nextInt();
		char grade; //등급을 저장할 변수 
		
		if (score >= 90 ) {
			grade = 'A';
		} else if (score < 90 && score >=80) {
			
			grade = 'B';
		} else if (score < 80 && score >=70) {
			
			grade = 'C';
		} else if (score < 70 && score >=60) {
			
			grade = 'D';
		} else  {
			
			grade = 'F';
		}
		
		System.out.printf("당신의 점수는 %d이고, 등급은 %c입니다.",score,grade);
		
	}

}
