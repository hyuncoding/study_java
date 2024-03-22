package day11_exception;

import java.util.Scanner;

public class Ex01_legacy_exception {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("a 입력 >> ");
		int a = sc.nextInt();
		
		System.out.print("b 입력 >> ");
		int b = sc.nextInt();
		
		// 사칙연산결과
		// 어떤 예외(문제)가 가능할지 예상해 보자
		
		// 0으로 나눌 수 없다.
		if(b == 0) {
			System.out.println("0으로 나눌 수 없다.");
		} else {
			System.out.println(a + " + " + b + " = " + (a + b));
			System.out.println(a + " - " + b + " = " + (a - b));
			System.out.println(a + " * " + b + " = " + (a * b));
			System.out.println(a + " / " + b + " = " + (a / b));
		}
		
		// 고전적인 예외 처리 방법
		// 개발자가 이미 어떤 문제가 발생할 것인지 예측 가능해야만 코드를 작성할 수 있다.
		// 개발자가 예쌍 못하는 예외는 처리가 불가능하다.
		
		sc.close();
	}
}
