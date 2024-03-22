package Test;

import java.util.Calendar;

public class Test04_ans {
	public static void main(String[] args) {
		
		// 기념일
		Calendar anniversary = Calendar.getInstance();
		anniversary.set(2023, 1, 18);		// 2023-02-18 (개강일) : Month 는 0부터 시작 (0 ~ 11)
		
		// 오늘
		Calendar today = Calendar.getInstance();
		
		// 경과한 밀리초 구하기
		long elapseTime = today.getTimeInMillis() - anniversary.getTimeInMillis();
		
		// 밀리초 -> 초 -> 분 -> 시간 -> 일
		long elapseDay = elapseTime / (1000 * 60 * 60 * 24);
		
		System.out.println("경과한 일수는 " + elapseDay + "일 입니다.");
	}
}
