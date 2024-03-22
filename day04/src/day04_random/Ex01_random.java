package day04_random;

import java.util.Random;

public class Ex01_random {
	public static void main(String[] args) {
		
		// 1. Random 클래스를 이용해 random 객체 생성
		Random random = new Random();
		
		System.out.println(random.nextInt());	// int 데이터 범위 중 하나의 난수가 출력
		System.out.println(random.nextInt(10)); // 10개(0 ~ 9) 정수 중 하나의 난수를 발생시킴
		
		// 주사위 던지기
		int dice = random.nextInt(6)+1;
		System.out.println("주사위 던지기 = " + dice);
		
		
		System.out.println(random.nextDouble()); 	// 0 ~ 0.999999 (확률 만들 때 쓰임)
		System.out.println(random.nextDouble()*10); // 0 ~ 9.999999
		System.out.println((int)(random.nextDouble()*10));
		
		// 로또번호 중 하나를 난수로 발생
		int lotto = (int)(random.nextDouble() * 45) + 1;
		System.out.println("생성된 로또번호 = " + lotto);
	}
}
