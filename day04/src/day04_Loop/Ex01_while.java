package day04_Loop;

public class Ex01_while {
	public static void main(String[] args) {
		
		/*
		 *  반복문 (while)
		 *  
		 *  while(조건식){
		 *  	조건이 참인 동안 계속 실행
		 *  }
		 */
		
		// 1. 0 ~ 9 출력
		int a = 0;					// 초기문
		while(a < 10) {				// 조건문 (종료문)
			System.out.println(a);
			a++;					// 증감문
		}
		
		System.out.println(a);
		
		System.out.println("-----");
		
		// 2. 9 ~ 0 출력
		int b = 9;
		while(b >= 0) {
			System.out.println(b);
			b--;
		}
		System.out.println(b);
	}
}
