package day02_Scanner;

public class Ex06_casting {
	public static void main(String[] args) {
		
		/*
		 * 형 변환 (casting)
		 * 
		 *  1. 자동 형변환
		 *  	1) java가 스스로 형 변환
		 *  	2) 타입이 섞여있는 경우 작은 크기의 타입을 큰 크기의 타입으로 통일하는 방향으로 동작
		 *  		예) int 와 long 타입을 연산 -> int 가 long으로 변환
		 *  	3) 정수와 실수 타입을 연산 -> 실수로 변환
		 *  
		 *  2. 강제 형변환
		 *  	1) 개발자가 직접 형 변환
		 *  	2) 기존 타입 상관 없이 원하는 타입으로 무조건 변환
		 *  	3) 변수명 앞에 (타입) 을 붙여서 사용
		 *  		예) int n = 10;
		 *  		   (double)n;
		 */
		
		// 자동 형 변환
		System.out.println(1 + 1.5);	// 1.0 + 1.5 = 2.5
		
		double a = 10;
		// java가 스스로 double a = 10.0; 으로 변환 후 처리
		System.out.println(a);
		
		// 강제 형 변환
		int b = (int)10.9;		// 소수점 아래 버림
		System.out.println(b);
		
	}
}
