package Test;

import java.util.Calendar;

public class Test03 {
//	Test03.java
//	현재 날짜를 StringBuffer, Calendar 클래스를 이용하여
//	"2019년 10월 21일 월요일 오후 1시 10분" 과 같은 형식으로 완성하고 출력하시오.
	public static void main(String[] args) {
		

		Calendar cal = Calendar.getInstance();
		StringBuffer sb = new StringBuffer();
		String dayOfWeek = "";
		
		sb.append(cal.get(Calendar.YEAR) + "년 ");
		sb.append(cal.get(Calendar.MONTH) + "월 ");
		sb.append(cal.get(Calendar.DAY_OF_MONTH) + "일 ");
		
		switch(cal.get(Calendar.DAY_OF_WEEK)) {
		case 1: dayOfWeek = "일요일 "; break;
		case 2: dayOfWeek = "월요일 "; break;
		case 3: dayOfWeek = "화요일 "; break;
		case 4: dayOfWeek = "수요일 "; break;
		case 5: dayOfWeek = "목요일 "; break;
		case 6: dayOfWeek = "금요일 "; break;
		case 7: dayOfWeek = "토요일 "; break;
		}
		
		sb.append(dayOfWeek);
		
		if(cal.get(Calendar.AM_PM) == 0) {
			sb.append("오전 ");
		} else {
			sb.append("오후 ");
		}
		
		sb.append(cal.get(Calendar.HOUR) + "시 ");
		sb.append(cal.get(Calendar.MINUTE) + "분");
		
		System.out.println(sb.toString());
		
	}
}
