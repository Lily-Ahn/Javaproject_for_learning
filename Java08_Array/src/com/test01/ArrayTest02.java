package com.test01;

public class ArrayTest02 {

	public static void main(String[] args) {
		
		ArrayTest02 at = new ArrayTest02() ;
		//at.shallowcopy();
		//at.deepcopy();
		//at.deepcopy2();
		at.deepcopy3();
		

	}
	
	public void shallowcopy() {
		//얕은 복사 : 주소만 복사 
		int[] oriArr = {1,2,3,4,5};
		int[] copyArr;
		copyArr = oriArr;
		
		//----------------
		
		System.out.print("1.oriArr : ");
		for (int i = 0; i < oriArr.length ; i++) {
			System.out.print(oriArr[i] + " ");
			
		} System.out.println();
		
		System.out.print("2.copyArr : ");
		for (int i = 0; i < copyArr.length ; i++) {
			System.out.print(oriArr[i] + " ");
			
		} System.out.println();
		
		//-----------------
		
		//원본 배열의 index 0의 값을 변경 
		oriArr[0] = 99;
		copyArr[1] = 22;
		
		//-----------------
	
		
		System.out.print("1.oriArr : ");
		for (int i = 0; i < oriArr.length ; i++) {
			System.out.print(oriArr[i] + " ");
			
		} System.out.println();
		
		System.out.print("2.copyArr : ");
		for (int i = 0; i < copyArr.length ; i++) {
			System.out.print(oriArr[i] + " ");
			
		} System.out.println();
		
	} //--------------------------------------------------------------------------
	
	public void deepcopy() {
		// 깊은 복사 : 새로운 배열을 하나 생성하고 값을 복사 
		int [] oriarr = {1,2,3,4,5};
		int [] copyarr = new int[5];
		
		// for 문 이용해서 1:1 로 값만 복사 
		
		for (int i = 0 ; i < oriarr.length; i++) {
			
			copyarr[i] = oriarr[i];
		}
		
		
		System.out.print("1.oriarr : ");
		for (int i = 0; i < oriarr.length ; i++) {
			System.out.print(oriarr[i] + " ");
			
		} System.out.println();
		
		System.out.print("2.copyarr : ");
		for (int i = 0; i < copyarr.length ; i++) {
			System.out.print(oriarr[i] + " ");
			
		} System.out.println();
		
		//-------------------------
		//원본 배열 값 변경 
		
		oriarr[0] = 99;
		copyarr[3] = 77;
		
		System.out.print("1.oriarr : ");
		for (int i = 0; i < oriarr.length ; i++) {
			System.out.print(oriarr[i] + " ");
			
		} System.out.println();
		
		System.out.print("2.copyarr : ");
		for (int i = 0; i < copyarr.length ; i++) {
			System.out.print(copyarr[i] + " ");
			
		} System.out.println();
		
		
	}
	
	public void deepcopy2() {
		//arraycopy() 메소드 이용
		//java.lang.System
		
		int[] oriarr = {1,2,3,4,5};
		int[] copyarr = new int[10];
		
		System.arraycopy(oriarr,0,copyarr,0,oriarr.length);
		
		// arraycopy(Object src, int srcPos , Object dest , int destPos , int length)
		// src : 원본배열 , srcPos : 복사시작위치 , dest: 카피배열 , destPos : 붙여넣기 시작위치 
		// length : 복사할 길이
		
		
		
		System.out.print("1.oriarr : ");
		for (int i = 0; i < oriarr.length ; i++) {
			System.out.print(oriarr[i] + " ");
			
		} System.out.println();
		
		System.out.print("2.copyarr : ");
		for (int i = 0; i < copyarr.length ; i++) {
			System.out.print(copyarr[i] + " ");
			
		} System.out.println();
		
		
		
		
	}
	
	public void deepcopy3() {
		//clone(); 을 이용한 복사 
		
		int[] oriarr = {1,2,3,4,5};
		int[]  copyarr;
		
		copyarr = oriarr.clone();
		//복사한 새로운 배열을 copyarr이 참조
		
		System.out.print("1.oriarr : ");
		for (int i = 0; i < oriarr.length ; i++) {
			System.out.print(oriarr[i] + " ");
			
		} System.out.println();
		
		System.out.print("2.copyarr : ");
		for (int i = 0; i < copyarr.length ; i++) {
			System.out.print(copyarr[i] + " ");
			
		} System.out.println();
		
		
	}
	
	

}
