package com.home.controller;
import java.util.Scanner;

public class Function {
	
	Scanner sc = new Scanner(System.in);
	
	//간단 계산기
	 public void calculator(){
	 int num1;
	 int num2;
	 char cal;
	 System.out.println("*** 자바자바 간단 계산기 ***");
	 System.out.println();
	 System.out.println("정수 두 개를 입력하시오 : ");
	 num1 = sc.nextInt();
	 num2 = sc.nextInt();
	 System.out.println("연산문자를 입력하시오 : ");	 
	 cal = sc.next().charAt(0);
	 
	 
	 switch(cal) {
	 
	 case '+' :
		 System.out.println("두 정수의 합은 : " + (num1+num2));
		 break; 		 
	 case '-' :
		 System.out.println("두 정수의 차는 : " + (num1-num2));
		 break; 		 
	 case 'x' :
		 System.out.println("두 정수의 곱은 : " + (num1*num2));
		 break; 		 
	 case '*' :
		 System.out.println("두 정수의 곱은 : " + (num1*num2));
		 break; 		 
	 case '/' :
		 
		 if (num2==0) {
		 System.out.println("결과 값 : 0");
		 System.out.println("0으로 나눌 수 없습니다. ");
		 } else {
		 System.out.println("두 정수의 나눈 몫은 : " + (num1/num2));
		 }
		 break; 
		 
	 }  System.out.println("계산기를 종료합니다.");
	 	System.out.println();
 }
	 //작은 수에서 큰 수까지 합계 구하기 
	 public void totalCalculator(){
		 int num1;
		 int num2;
		 System.out.println("*** 자바자바 작은 수에서 큰수까지 합계구하기 ***");
		 System.out.println();
		 System.out.println("정수 두 개를 입력하시오 : ");
		 num1 = sc.nextInt();
		 num2 = sc.nextInt();
		 int sum1 =0;
		 
		 if (num1>num2) {
			 
				 for (int i = 0; i <= num1-num2; i++) {
					sum1 += num2 + i;
				 } 
			 System.out.println( num2+ "부터 " + num1 + "까지 정수들의 합계 : " + sum1 );
			 
			 
		 } else if (num1<num2) {
			 
			 	for (int i = 0; i <= num2-num1; i++) {
				sum1 += num1 + i;
			 	} 
			 	System.out.println( num1+ "부터 " + num2 + "까지 정수들의 합계 : " + sum1 );
			 
		 } else {
			 System.out.println("두 값이 똑같기 때문에 결과값은 " + num1 + " 입니다"); 
		}	 System.out.println();	 
	 }
	 
	 //신상정보
	 public void profile(){
		 String name;
		 int age;
		 String sex;
		 String personal;
		 
		 name = "안 해림";
		 age = 25;
		 sex = "여자";
		 personal = "평범";
		 
		 System.out.println("*** 자바자바 신상정보 확인하기 ***");
		 System.out.println();
		 System.out.println("이름 : " + name);
		 System.out.println("나이 : " + age+ "세");
		 System.out.println("성별 : " + sex);
		 System.out.println("성격 : " + personal);
		 
	 } 
	
	 //성적 시스템 
	 public void sungjuk(){
		 
		 String name;
		 int grade;
		 int clas;
		 int no;
		 char sex;
		 String sex2;
		 double score;
		 char credit;
		 
		 System.out.println("*** 자바자바 학생정보 확인하기 ***");
		 System.out.println();
		 System.out.println("학생의 이름은? : ");
		 name = sc.nextLine();
		 System.out.println("학생의 학년은? : ");
		 grade = sc.nextInt();
		 System.out.println("학생의 반은? : ");
		 clas = sc.nextInt();
		 System.out.println("학생의 번호는? : ");
		 no = sc.nextInt();
		 System.out.println("학생의 성별을 영어로 입력하시오 : ");
		 sex = sc.next().charAt(0);
		 System.out.println("학생의 성적을 소수점 아래 둘째 자리까지 입력하시오 : ");
		 score = sc.nextDouble();
		 System.out.println();
		 
		 sex2 = (sex=='f' || sex=='F')? (sex2 = "여학생") : (sex2 = "남학생");
		 
		 
		 if(score>=90) {
		     credit= 'A'; 
		 } else if(score<90 && score>=80) {
		     credit= 'B';
		 } else if(score<80 && score>=70 ) {
			 credit= 'C';
		 } else if(score<70 && score>=60 ) {
			 credit= 'D';
		 } else {
			 credit= 'F';
		 }
		 
		 System.out.printf("%d학년 %d반 %d번 %s %s의 점수는 %.2f이고, %c 학점입니다.",grade,clas,no,sex2,name,score,credit);
		 System.out.println();
		 System.out.println();
	 }
	 
	 
	 
	 //별과 숫자 출력하기
	 public void printStarNumber(){
		 
		 System.out.println("*** 자바자바 별과 숫자 출력하기 ***");
		 System.out.println();
		 System.out.println("양수인 정수를 하나 입력하시오 : ");
		 int num = sc.nextInt();
		 
		 if(num > 0) {
			 
			 for(int i=0; i < num ; i++) {
				 for (int j=0; j < num ; j++) {
					 
					 if(i==j) {
						 	System.out.print(i+1);
					 } else if (j<i){System.out.print("*");
					 } else {  
					 }
				 }	 
				 System.out.println();
			 }
		 } else {
			 System.out.println("양수가 아닙니다!");
		 }	
		 System.out.println();
	 }
	 
	 
	 
	 
	 //난수까지의 합계 구하기 
	 public void sumRandomNumber(){
		 
		 int sum=0;
		 System.out.println("*** 자바자바 난수까지의 합계 구하기 ***");
		 System.out.println();
		 System.out.println("1~100 사이의 임의의 난수가 하나 발생합니다 : ");
		 int random = (int)(Math.random()*100)+1;
		 System.out.println("발생한 난수 : "+ random);
		 
		 for (int i=0; i < random; i++) {
			 sum += i+1;
		 }
		 System.out.println("1부터 "+ random + "까지의 합계 : " + sum);
		 System.out.println();		 
	 }
	 
	 
	 //구구단
	 public void continueGugudan(){
		 
		 System.out.println("*** 자바자바 구구단 ***");
		 System.out.println();
		 System.out.println("구구단 숫자를 입력해주세요 : ");
		 int num = sc.nextInt();
		 System.out.println("곱하기 결과에서 제외할 배수를 입력해주세요 : ");
		 int num2 = sc.nextInt();
		 
		 if(num>0) {
			 for(int i = 1; i < 10 ; i++) {
				 if ( (num*i)%num2 == 0 ) 
				   continue;
				  System.out.println( num + " * " + i + " = " + (num*i) );
				 } 
		 } else {
		 System.out.println("양수가 아닙니다!"); 
		 System.out.println();
		 }
     }
	 //주사위 숫자 알아맞추기 게임 
	 public void shutNumber() {
		 
		 char yesorno;
		 
		 
		 System.out.println("*** 자바자바 주사위 숫자 알아맞추기 게임 ***");
		  
			 System.out.println();
			 System.out.println("- 당신은 지금 카지노에 있습니다.");
			 System.out.println("- 주위를 둘러보니 주사위게임이 괜찮아보입니다.");
			 System.out.println("- 당신은 주사위게임을 하기로 결정했습니다.");
			 System.out.println("- 딜러가 말합니다.");
			 System.out.println("- 할거라면 빨리 빨리 하시오.");
		 do { System.out.println("- 두 개의 주사위가 굴러갑니다... .");
		 
			 int num = (int) (Math.random() * 6) + 1;
			 int num2 = (int) (Math.random() * 6) + 1;
		 
			 System.out.println("- 주사위가 굴려졌습니다");
			 System.out.println("- 두 주사위의 합은 얼마일지 베팅하세요! : ");
			 int sum = sc.nextInt();
			 
			 if ((num+num2)==sum) {
				 System.out.println("베팅에 성공하였습니다! 당신은 돈을 얻었습니다! ");
			 } else {
				 System.out.println("당신은 돈을 잃었습니다... .");
			 }
			 
			 System.out.println("계속 하시겠습니까? (y/n) ");
			 yesorno = sc.next().charAt(0);
			 
		 } while((yesorno=='Y') || (yesorno=='y'));
		 
		 System.out.println("-당신은 카지노를 떠납니다... .");
		 System.out.println();
		 
		 
	 }
	 
}
