package com.test01;

public class ArrayTest01 {

	public static void main(String[] args) {
		//non static method 는 new 준비 필요
		ArrayTest01 at = new ArrayTest01();
		//at.testArray();
		//at.testArray2();
		at.testArray3();

	}
	
	public void testArray() {
		
		/*배열을 선언하지 않으면 변수를 여러개 설정해야한다. 
		
		int num1 = 10;
		int num2 = 20;
		int num3 = 30;
		int num4 = 40;
		int num5 = 50;
		
		int sum = 0;
		
		sum += num1
		sum += num2
		sum += num3
		sum += num4
		sum += num5
		
		*/
		
		//배열을 이용 
		
		int [] arr = new int[5];
		
		//arr [0] = 10;
		//arr [1] = 20;
		//arr [2] = 30;
		//arr [3] = 40;
		//arr [4] = 50;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i*10 + 10;
		}
		
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			sum+=arr[i];
		}
		
		System.out.println(sum);
		
	}
	
	public void testArray2() {
		//배열의 선언
		// 자료형[] 변수명;
		// 자료형 변수명[];
		
		//선언은 stack에 배열의 주소를 보관할 수 있는 공간을 생성가능하다
		//int [] iarr;
		//char charr [];
		
		//주소값을 저장하는 변수->참조형 변수->레퍼런스 변수
		//선언한 레퍼런스 변수에 배열을 할당이 가능하다
		//new 연산자는 heap 영역에 공간을 할당하고 발생한 주소값을 반환하는 연산자
		
		//배열을 할당할 때에는 반드시 배열의 크기를 지정해주어야한다. 
		//iarr = new int[]; //크기를 지정해주지 않으면 에러
		//iarr = new int[5];
		//charr = new char[10];
		
		//선언과 동시에 할당 가능
		int [] iarr = new int[5];
		char carr [] = new char[10];
		
		System.out.println("iarr : " +iarr);
		System.out.println("charr : " +carr);
		
		// 해시코드
		System.out.println("iarr의 hashcode : " + iarr.hashCode());
		System.out.println("charr : " + carr.hashCode());
		
		//배열의 길이
		System.out.println("iarr의 길이 : " + iarr. length);
		System.out.println("carr의 길이 : " + carr. length);
		
		//
		
		int size = 3;
		double[] darr = new double[size];
		
		System.out.println("darr 의 hashcode : " + darr.hashCode());
		System.out.println("darr 의 길이 : " + darr.length);
		
		
		//darr 의 크기를 변경
		// 한번 지정한 배열의 크기는 바꿀 수 가 없음
		//새로운 배열을 생성하여 주솟값을 덮어쓴 것
		
		darr = new double[30];
		
		System.out.println("수정 후 darr 의 길이 : " + darr.length);
		System.out.println("수정 후 darr 의 hashcode : " + darr.hashCode());
		
		
		//한번 할당한 배열을 지울 수 없다
		//다만 변수의 값을 null 로 변경하여 더이상 참조하지 않게 만들 수 있다
		
		darr = null;
		//nullpointerexception 발생 
		//System.out.println("삭제 후 darr 의 길이 : " + darr.length);
	}
	
	public void testArray3() {
		//초기화
		// HEAP 영역은 값이 없는 공간이 존재할 수 없기 때문에 
		// 배열을 선언하고 할당하면 지정된 기본값으로 값이 초기화된다.
		int [] iarr = new int[5];
		
		iarr[0] = 10;
		iarr[1] = 20;
		
		for (int i=0 ; i <5 ; i ++) {
		System.out.println(i + " : " +iarr[i]);
		}
		
		int[] iarr2 = {11,22,33,44,55,66};
		int[] iarr3 = new int[] {11,22,33};
		
		System.out.println(iarr2.length + ","  + iarr3.length);
		
		String[] sarr = {"apple","grape","orange"};
		for (int i = 0 ; i < sarr.length ; i++) {
			
			System.out.println(sarr[i]);
		}
		
		
	}

}
