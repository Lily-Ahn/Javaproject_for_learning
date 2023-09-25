package com.chap05_Date.run;
import java.util.Date;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Run {

	public static void main(String[] args) {
		//1.Date(java.util)
		Date today = new Date();
		System.out.println(today);
		
		Date oriDay = new Date(1000L);
		System.out.println(oriDay);
		//oriDay = new Date(100+19,9-1,9);
		//System.out.println(oriDay);
		
		
		//원하는 패턴으로 날짜 출력 - simpleDateformat
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf.format(today));
		//2.Calender(java.util)
		System.out.println("-------Calender-------");
		
		//ctrl+space (자동완성)
		//ctrl+d (한라인 전체 삭제)
		//alt+방향키위 or 방향키 아래
		//ctral+alt+방향키위 or 방향키 아래 (한줄 전체 복사)
		
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar);
		calendar.set(2023,10-1,3);
		System.out.println(calendar);
		
		int year = calendar.get(1);
		int month = calendar.get(2)+1;
		int day = calendar.get(Calendar.MONTH);
		System.out.println(year+"년 "+month+"월 "+day+"일");
		
		//cal > 2023년 10월 3일 저장 
		Calendar cal = (Calendar)calendar.clone();
		cal.add(Calendar.YEAR, -9); //9년전
		cal.add(Calendar.MONTH, -9); //4달전
		cal.add(Calendar.DATE, -9); //10일 후 
		System.out.println(cal.getTime()); //gettime은 데이트 객체로 받는 메소드
		System.out.println(sdf.format(cal.getTime()));
		
		//3.GregorianCalender(java.util)
		
		GregorianCalendar gc = new GregorianCalendar();
		System.out.println(gc.getTime());
		
		System.out.println("year : " + gc.get(GregorianCalendar.YEAR));
		System.out.println(gc.get(Calendar.DATE));
		
		gc.set(2024, 4-1,22);
		System.out.println(gc.getTime());
		
		System.out.println(new GregorianCalendar().isLeapYear(2024));
		// is 라고 붙어있는 메소드는 무엇인가를 확인하는 기능을 가짐
		//leapyear 는 윤년인지 확인하는 메소드
		
		
	}

}
