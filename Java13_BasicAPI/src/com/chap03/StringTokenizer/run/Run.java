package com.chap03.StringTokenizer.run;
import java.util.StringTokenizer;

public class Run {
	
	/*
	 * StringTokenizer
	 * split() 과 큰 차이점 : split은 String 클래스의 메소드로 추출한 문자를 배열로 저장.
	 * 					StringTokenizer는 클래스로 추출한 문자를 토큰으로 저장.
	 * 
	 * 
	 * countToken(): 토큰 수 파악
	 * nextToken() : 토큰 읽어오기 
	 * hasMoreTokens() : 토큰이 남아 있는지 확인 후, nextToken으로 토큰을 읽어옴.
	 * 
	 * 
	 */

	public static void main(String[] args) {
		String str = "이창진,20,서울 광진구,남";
		//토크나이저는 다른 패키지에 있는 메소드라 임포트 해줘야 함
		StringTokenizer st = new StringTokenizer(str,",");
		System.out.println(st.countTokens());
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		///
		System.out.println();
		String arr[] = str.split(",");
		for (String res : arr) {
			System.out.println(res);
		}

	}

}
