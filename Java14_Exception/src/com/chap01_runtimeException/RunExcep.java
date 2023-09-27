package com.chap01_runtimeException;

public class RunExcep {

	public static void main(String[] args) {
		RunExcep re = new RunExcep();
		//re.test01();
		re.test02();

	}
	
	
	public void test01() {
		/*ArithmeticException
		 * 예외발생!
		int no1 = 10, no2=0;
		int res = 0;
		
		res = no1/no2;
		System.out.println("res : " + res);
		*/
		
		
		
		//1.해결1 if 
		/*int no1 = 10, no2=0;
		int res = 0;
		
		if(no2==0) {
			System.out.println("0입니다. 나눌 수 없습니다");
		} else {
			res = no1/no2;
			System.out.println("res : " + res);
		}
		*/
		
		
		//2.해결2 try/catch
		int no1 = 10, no2=0;
		int res = 0;
		
		try {
		res = no1/no2;
		System.out.println("res : " + res);
		} catch(ArithmeticException e) {
			System.out.println("ArithmeticException 발생!!");
			System.out.println("0으로 나눌 수 없습니다");
		}
		
		
	}
	
	
	public void test02() {
		//classCastException : 허용할 수 없는 형변환 연산을 진행하는 경우 발생
		//말도 안되는 형변환 시도하지마
		
		Object obj = 'a'; //char >> (Boxing) >> Character >> (다형성) Object
		System.out.println(obj);
		//1. Character str = (Character)obj;
		//2.
		
		if(obj instanceof String ) {
			String str= (String)obj;
		}else if(obj instanceof Character) {
			char ch = (Character)obj;
			System.out.println("char : " + ch);
			
		}
		
		
		System.out.println();
		//ArrayIndexOutOfBoundException
		int [] arr = new int[2];
		arr[0] = 1; 		//길이가 2인 배열 생성
		arr[1] = 2;
		
		//arr[2] = 3; //ArrayIndexOutOfBoundException 발생
		
		for (int i=0; i <arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println();
		//NullPointerException
		String str = null;
		//int length = str.length(); //nullpointerException 발생		
		
		
	}
	
	
	
	
	

}
