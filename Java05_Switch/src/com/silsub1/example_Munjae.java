package com.silsub1;
import java.util.Scanner;

public class example_Munjae {
	
	public void test1 () {
		
		System.out.println("국어 점수를 입력하시오 : ");
		System.out.println("수학 점수를 입력하시오 : ");
		System.out.println("영어 점수를 입력하시오 : ");
		
		Scanner sc = new Scanner(System.in);
		
		int kor = sc.nextInt();
		int math = sc.nextInt();
		int eng = sc.nextInt();
		double aver = (kor+math+eng)/3.0;
		
		if (kor >= 40 && math >= 40 && eng >= 40 && aver >=60 ) {
			System.out.println("합격입니다!");
			System.out.println("국어 점수 : " + kor);
			System.out.println("수학 점수 : " + math);
			System.out.println("영어 점수 : " + eng);
			System.out.println("과목 점수 합계 : " + (kor+math+eng) );
			System.out.println("평균 : " + aver );
			
		} else { System.out.println("불합격입니다.");
			
		}	
	}
	
	public void test2 () {
		
		System.out.println(" ***  초기 메뉴  ***");
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");
		System.out.println("메뉴 번호 입력 : ");
		
		Scanner sc = new Scanner (System.in);
		
		int no = sc.nextInt();
		
		switch(no) { 
		
		case 1 :
			System.out.println("입력메뉴가 선택되었습니다.");
			break;
		case 2 :
			System.out.println("수정메뉴가 선택되었습니다.");
			break;
		case 3 :
			System.out.println("조회메뉴가 선택되었습니다.");
			break;
		case 4 :
			System.out.println("삭제메뉴가 선택되었습니다.");
			break;
		case 7 :
			System.out.println("프로그램이 종료됩니다.");
			break;
			
		default : 
			System.out.println("번호가 잘 못 입력되었습니다.");
			System.out.println("다시 입력하십시오.");
	
		}
	}
	
	
	public void test3 () {
		
		System.out.println("정수를 입력하시오 : ");
		
		Scanner sc = new Scanner(System.in);
		
		int no = sc.nextInt();
		
		if ( no > 0 ) { 
			System.out.println("양수다.");
		} else {	
			System.out.println("양수가 아니다.");
		}	
	}
	
	
	public void test4 () {
		
		
		System.out.println("양수를 입력하시오 : ");
		
		Scanner sc = new Scanner(System.in);
		
		int no = sc.nextInt(); // 정수 변수 선언 후 키보드로 입력받기 
		String str; //문자열 변수 선언
		
		if ( no > 0 ) {
			
			
			if ( no%2 == 0 ) {
				
				str = new String("짝수다");
				System.out.println(str);
				
			} else {
				str = new String("홀수다");
				System.out.println(str);
			}
			
			
		} else {
			System.out.println("양수가 아닙니다. 다시 입력하십시오");
		}
	}
	
	
	public void inputTest () {

		
		System.out.println("이름을 입력하시오 : ");
		System.out.println("나이를 입력하시오 : ");
		System.out.println("키를 입력하시오 : ");
		
		Scanner sc = new Scanner(System.in);

		String 이름;
		int 나이;
		double 키;		
		
		이름 = sc.nextLine();
		나이 = sc.nextInt();
		키 = sc.nextDouble();
		
		if ( 이름 != null && 이름.length() > 0 && 나이 > 0 && 키 > 0 ) {
			
			System.out.println("이름 : " + 이름 );
			System.out.println("나이 : " + 나이 );
			System.out.println("키 : " + 키 );
			System.out.printf("확인 : %s의 나이는 %d세이고, 키는 %.2fcm 이다." , 이름,나이,키);
		} else {
			System.out.println("입력값이 잘못되었습니다. 다시 시도하십시오.");
		}	
	}
	
	
	public void test6 () {
		
		System.out.println("첫번째 양수를 입력하시오 : ");
		System.out.println("두번째 양수를 입력하시오 : ");
		
		Scanner sc = new Scanner(System.in);
		
		int no1 = sc.nextInt(); 
		int no2 = sc.nextInt(); // 두개의 변수 정수 선언 후 키보드로 입력받기
		
		if ( no1 > 0 && no2 > 0 ) {
			
			System.out.println("첫번째 정수 : " + no1);
			System.out.println("두번째 정수 : " + no2);
			System.out.println( no1+"+"+no2+"="+(no1 + no2));
			System.out.println( no1+"-"+no2+"="+(no1 - no2));
			System.out.println( no1+"*"+no2+"="+(no1 * no2));
			System.out.println( no1+"/"+no2+"="+(no1 / no2));
			System.out.println( no1+"%"+no2+"="+(no1 % no2));
			
			
		} else {
			System.out.println("양수가 아닙니다. 다시 입력하시오.");
		}
	}
	
	
	
	public void test7 () {
		
		int 점수;
		char 등급;
		
		System.out.println("점수를 입력하시오 : ");	
		Scanner sc = new Scanner(System.in);
		
		점수 = sc.nextInt();
		
		if (점수 >= 90) {	
			등급 = 'A';
		} else if ( 점수 < 90 && 점수 >= 80){
			등급 = 'B';	
		} else if ( 점수 < 80 && 점수 >= 70) {
			등급 = 'C';
		} else if ( 점수 < 70 && 점수 >= 60) {
			등급 = 'D';
		} else {
			등급 = 'F';
		} 
		
		System.out.println("해당 학생의 점수 : " + 점수);
		System.out.println("해당 학생의 학점 : " + 등급);
	
	}
}
