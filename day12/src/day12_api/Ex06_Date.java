package day12_api;

import java.util.Calendar;

//import java.sql.Date;

import java.util.Date;

public class Ex06_Date {
	public static void main(String[] args) {
		
		// 1. 자바용 Date : java.util.Date (java.util 패키지에 저장된 Date 클래스)
		// 2. SQL용 Date : java.sql.Date (java.sql 패키지에 저장된 Date 클래스)
		
		// 자바용 Date
//		Date now = new Date();
//		System.out.println("현재 시간 : " + now);
		
		// SQL문용 Date
//		Date now = new Date(System.currentTimeMillis());
//		System.out.println("현재 시간 : " + now);
		
		// Calendar를 통해 자바용 Date
		Calendar cal = Calendar.getInstance();
		Date now = cal.getTime();
		System.out.println("현재 시간 : " + now);
		
	}
}
