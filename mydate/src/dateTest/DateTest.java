package dateTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class DateTest {
	public static void main(String[] args) {
		
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		System.out.println(now.format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 a hh시 mm분 ss초 E요일")));
		System.out.println(now.format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH시 mm분 ss초")));
		
//		LocalDate now = LocalDate.now();
//		System.out.println(now);
//		
//		System.out.println(now.format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일")));
//		System.out.println(LocalDate.parse("1900년 12월 04일", DateTimeFormatter.ofPattern("yyyy년 MM월 dd일")));
		
//		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");
//		Calendar calendar = Calendar.getInstance();
//		System.out.println(calendar);
//		
//		System.out.println(simpleDateFormat.format(calendar.getTime()));
//		try {
//			System.out.println(simpleDateFormat.parse("2020/12/04"));
//		} catch (ParseException e) {
//			e.printStackTrace();
//		}
		
//		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy년 MM월 dd일");
//		Date date = new Date();
//		System.out.println(date);
//		System.out.println(simpleDateFormat.format(date));
//		try {
//			System.out.println(simpleDateFormat.parse("1900년 12월 04일"));
//		} catch (ParseException e) {
//			e.printStackTrace();
//		}
		
	}
}
