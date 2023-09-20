package com.test01;

public class DiArrayTest {
	
	
	public static void main(String[] args) {
		
		DiArrayTest da = new DiArrayTest();
		da.testInit1();


	}
	
	public void testInit1() {
		
		// 2차원 배열의 선언
		
		int [][] iarr1;
		int iarr2 [][];
		
		//할당, heap 영역에 배열의 공간을 만든다
		iarr1 = new int [3][5];
		
		iarr2 = new int[3][];
		iarr2[0] = new int [5];
		iarr2[1] = new int [5];
		iarr2[2] = new int [5];
		
		for (int i=0; i < iarr2.length ; i++) {
			for (int j=0; j < iarr2[i].length; j++) {
				
				System.out.print(iarr2[i][j] + " ");
			}
			System.out.println();
		}
		
		//2차원 배열에 값 기록 
		//인덱스로 접근하여 값 기록
		iarr1[0][0] = 1;
		iarr1[0][1] = 2;
		iarr1[0][2] = 3;
		iarr1[1][1] = 4;
		iarr1[1][4] = 5;
		iarr1[2][1] = 6;
		iarr1[2][3] = 7;
		
		printArr(iarr1);
		
		
		//다차원 배열의 할당과 초기화를 동시에 진행할 수도 있다. 
		
		int [][] iarr3 = {{1,2,3},{4,5,6,7},{8,9,10,11,12}};
		iarr3 = new int [4][3];
		
		printArr(iarr3);
	}
	
	// 2차원 배열을 전달 받아서 출력하는 기능인 메소드
	public void printArr(int [][] iarr) {
		for (int i=0; i <iarr.length; i++) {
			for(int j=0; j < iarr[i].length; j++) {
				System.out.print("\t" + iarr[i][j]);
			}
			System.out.println();
		}
		
	}

}
