package com.test01;

public class Operator02 {

	public static void main(String[] args) {
		
		//준비
		Operator02 op = new Operator02();
		//op.test01();
		//op.test02();
		op.test03();
		
	}
		
	
	// &&(그리고,~면서)
	// || (또는,~거나)
	// 논리값 && 논리값
	// 논리값 || 논리값
	
		public void test01() {
			
			// 1<= 변수 <= 100 이렇게는 사용 못함 --> 변수 >= 1 && 변수 <= 100
			
			int num = 150;
			
			System.out.println("1~100 의 숫자인지 확인 : " + (num >= 1 && num <=100) );
			
			java.util.Scanner sc = new java.util.Scanner (System.in);
	
			//영어문자 하나 입력받아 대문자인지 확인 
			
			System.out.println("문자 하나 입력 : ");
			
			//String str = sc.next();
			//char ch = str.charAt(0);
		    char ch = sc.next().charAt(0);
		    
		    //문자변수 >= A && 문자변수=< Z 가능 , 문자는 특이하게 유니코드로 변환되어 숫자로 인식될 수 있기 때문.
		    System.out.println("영어 대문자인지 확인 : " + (ch>='A' && ch<='Z'));
			
			// || : 여러 조건을 제시하고 그 중에 하나라도 맞는 게 있는지 물어볼 때 사용
		    
		    System.out.println("y 또는 Y 입력 : ");
		    char ch2 = sc.next().charAt(0);
		    
			System.out.println("영문자 y 인지 확인 : " + (ch2=='y' || ch2=='Y'));
			
		}
		
		
		public void test02() {
			
			//삼항 연산자 
			//항목이 3개 -- (조건식) ? (참일때 사용할 값) : (거짓일 때 사용할 값);
			//조건식은 반드시 참 거짓으로 구분이 가능해야 함. 반드시 결과가 논리값!
			
			int num = 0; 
		   //String res = (num>0)? "양수!":"양수가 아니다!";
			String res = (num>0)? "양수!":(num==0)? "0이다!":"음수이다!";
		    	
			System.out.println(res);
			
		}
		
		public void test03() {
			//복합대입연산자(산술대입)
			//+= ,-=,*=,/=,%=
			
			int num =12;
			//3증가 
			num +=3; //num = num + 3
			System.out.println(num);
			
			// ++ : 1증가 
			// -- : 1감소 
			
			
			num -= 3;
			num *= 3;
			num /= 3;
			
			System.out.println(num);
			
		}
		
		
}
