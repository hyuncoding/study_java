package Test;

import java.util.Calendar;

public class Test04 {
//	Test04.java
//	각자 기념하고 싶은 기념일을 이용해서
//	기념일부터 오늘까지 며칠이 지났는지 계산하시오.
//	Calendar 클래스와 getTimeInMillis() 메소드 활용 
	public static void main(String[] args) {
		
		Calendar then = Calendar.getInstance();
		Calendar now = Calendar.getInstance();
		
		then.set(2021, 3, 20);
		
		long thenInMilli = then.getTimeInMillis();
		long nowInMilli = now.getTimeInMillis();
		
		long diff = nowInMilli - thenInMilli;
		System.out.println("기념일로부터 " + diff/86400000 + "일만큼 지났습니다.");
		
	}
}
