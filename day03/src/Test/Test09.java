package Test;

import java.util.Scanner;

public class Test09 {
	public static void main(String[] args) {
		/*
		 * switch 문 활용
		 * 수준값을 정수로 입력 받아 해당 수준의 권한을 출력하기
		 * 3수준 : 실행, 읽기, 쓰기
		 * 2수준 : 쓰기, 읽기
		 * 1수준 : 읽기
		 * 나머지 : 권한이 없습니다.
		 * 실행 예)
		 * 수준 입력 >> 3
		 * 실행, 읽기, 쓰기
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("수준 입력 >> ");
		int level = sc.nextInt();
		
		// 1
//		switch (level) {
//		case 3 : 
//			System.out.println("실행, 읽기, 쓰기");
//			break;
//		case 2 :
//			System.out.println("쓰기, 읽기");
//			break;
//		case 1 :
//			System.out.println("읽기");
//			break;
//		default : 
//			System.out.println("권한이 없습니다.");
//		}
		
		//2
		switch (level) {
		case 3 :
			System.out.print("실행, ");
		case 2 :
			System.out.print("쓰기, ");
		case 1 :
			System.out.print("읽기");
			break;
		default :
			System.out.println("권한이 없습니다.");
		}
		
		sc.close();
	}
}
