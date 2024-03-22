package day12_api;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex07_SimpleDateFormat {
	public static void main(String[] args) {
	
		/*
		 *  SimpleDateFormat 의 형식
		 *  1. 년 : yy, yyyy
		 *  2. 월 : M, MM
		 *  3. 일 : d, dd
		 *  4. 요일 : E
		 *  5. 오전/오후 : a
		 *  6. 시 : hh(12시각제), HH(24시각제)
		 *  7. 분 : mm
		 *  8. 초 : ss
		 */
		
		// 2023년 2월 26일 오후 4:27
		Date today = new Date();
		System.out.println(today);
		String pattern = "yyyy년 M월 d일 E요일 a hh:mm";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		
		String now = sdf.format(today);
		System.out.println("현재 날짜와 시간 : " + now);
		
		
	}
}
