package day04_Loop;

import java.util.Scanner;

public class Ex03_for {
	public static void main(String[] args) {
		
		/*
		 * 반복문 (for 문)
		 * 
		 *  for(초기식; 조건식; 증감식){
		 *  	조건식이 참인 동안 실행
		 *  }
		 *  
		 */
		
		// 1. 1 ~ 10
		int a;
		for(a = 1; a < 11; a++) {
			System.out.println(a);
		}
		
		for(int b = 1; b < 11; b++) {	// b는 for문 안에서만 사용 가능(지역 변수)
			System.out.println(b);		// for문의 초기식은 말 그대로 초기식.
		}								// 즉, int b = 1 이렇게 넣어도 공간할당을 매번 하지 않음
		
		/*
		 * 변수[참고]
		 * 
		 * 4. 스코프(범위)
		 * 		1) 지역 변수 : 코드 블럭({})내에서 선언하고, 사용하는 변수
		 * 		2) 전역 변수 : 모든 지역에서 사용하는 변수
		 */
		
		
		System.out.println(a);
//		System.out.println(b);		// 불가능(지역변수이므로)
		
		
		// 2. 사용자가 입력한 값만큼 "Hello"를 출력하기
		System.out.print("인사할 횟수를 입력하시오. >> ");
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		
		for(int i = 0; i < c; i++) {		// 1부터 하지 말고 0부터 하는 게 좋다.(배열의 인덱스 0부터 시작)
			System.out.println("Hello");
		}
		
		sc.close();
		
	}
}
