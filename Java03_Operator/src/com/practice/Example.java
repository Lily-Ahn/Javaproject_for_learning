package com.practice;
import java.util.Scanner;

public class Example {
	
	public void sample1() {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("국어점수를 입력하세요 : ");
		System.out.println("영어점수를 입력하세요 : ");
		System.out.println("수학점수를 입력하세요 : ");
		
		
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int math = sc.nextInt();
		
		int total = (kor + eng + math);
		double aver =  total/3.0 ;
		
		if (kor >= 40 && eng >= 40 && math >= 40 && aver >=60) {
			
			System.out.println("합격입니다.");
			
		} else {
			
			System.out.println("불합격입니다.");
		}
			
	}
	
	
	public void sample2() {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("이름을 입력하세요 : ");
		System.out.println("학년을 입력하세요 : ");
		System.out.println("반을 입력하세요 : ");
		System.out.println("번호를 입력하세요 : ");
		System.out.println("성별(M/F)을 입력하세요 : ");
		System.out.println("성적을 소수점 아래 두번째 자리까지 입력하세요 : ");
		
		String name = sc.nextLine();
		int grade = sc.nextInt();
		int class1 = sc.nextInt();
		int num = sc.nextInt();
		char sex = sc.next().charAt(0);
		float score = sc.nextFloat();
		
		if (sex == 'M') {
			System.out.printf("%d학년 %d반 %d번 남학생 %s는(은) 성적이 %.2f이다.",grade,class1,num,name,score);		
		} else {
			System.out.printf("%d학년 %d반 %d번 여학생 %s는(은) 성적이 %.2f이다.",grade,class1,num,name,score);	
		}
				
	} 

	
	
	public void sample3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요 : ");
		
		int num = sc.nextInt();
		
		if (num>0) {
			System.out.println("양수다.");
		} else {
			System.out.println("양수가 아니다.");
		}
				
	}

	
	
	public void sample4() {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요 : ");
		
		int num = sc.nextInt();
		String str = new String();
		
		if (num%2 == 0) { 

			str = "짝수다";
			
		} else {
			
			str = "홀수다";
			
		}
		
		System.out.println(str);
		
	}

	
	

}
