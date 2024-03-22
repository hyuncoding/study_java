package day11_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex04_finally {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		try {
			// 코드 작성
				
			System.out.print("a 입력 >> ");
			int a = sc.nextInt();
				
			System.out.print("b 입력 >> ");
			int b = sc.nextInt();
				
			System.out.println(a + " + " + b + " = " + (a + b));
			System.out.println(a + " - " + b + " = " + (a - b));
			System.out.println(a + " * " + b + " = " + (a * b));
			System.out.println(a + " / " + b + " = " + (a / b));	
			
		} catch(InputMismatchException e) {
			System.out.println("입력은 정수 타입만 가능합니다.");
		} catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		} catch(Exception e) {	// 모든 예외를 처리할 수 있는 Exception은 마지막 catch블록에 배치한다.
			System.out.println("문제가 발생하여 처리할 수 없습니다.");
		} finally {
			if(sc != null) sc.close();
		}
		
	}
}
