package day11_exception;

import java.util.Scanner;

class Calculator{
	
	// Field
	private int count;
	
	// Method
	public void calculate(String a, String b) throws NumberFormatException, ArithmeticException{
		count++;
		int n1 = Integer.parseInt(a);	// NumberFormatException 발생 가능
		int n2 = Integer.parseInt(b);
		
		System.out.println(a + " + " + b + " = " + (n1 + n2));
		System.out.println(a + " - " + b + " = " + (n1 - n2));
		System.out.println(a + " * " + b + " = " + (n1 * n2));
		System.out.println(a + " / " + b + " = " + (n1 / n2));	// ArithmeticException 발생 가능
	}
	
	public void countInfo() { System.out.println("계산기 사용 횟수 : " + count + "회"); }
	
}

public class Ex09_throws {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// Calculator 클래스를 이용해 myCalculator 객체 생성
		Calculator myCalculator = new Calculator();
		
		// 정수 입력 (String 이용)
		System.out.print("정수 a 입력 >> ");
		String a = sc.next();
		
		System.out.print("정수 b 입력 >> ");
		String b = sc.next();
		
		try {
			myCalculator.calculate(a, b);
			myCalculator.countInfo();
		} catch(NumberFormatException e) {
			System.out.println("예외 메세지 : " + e.getMessage());
			e.printStackTrace();
		} catch(ArithmeticException e) {
			System.out.println("예외 메세지 : " + e.getMessage());
			e.printStackTrace();
		} catch(Exception e) {
			System.out.println("예외 메세지 : " + e.getMessage());
			e.printStackTrace();
		}
		
		sc.close();
		
	}
}
