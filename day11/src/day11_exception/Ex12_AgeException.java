package day11_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

class Person2{
	private int age;
	public void setAge(int age) throws AgeException{
		if(age < 0 || age > 120) {
			throw new AgeException("0 ~ 120 사이의 나이만 입력 가능하다.");
		}
		this.age = age;
	}
	public int getAge() { return age; }
}

class AgeException extends Exception{
	public AgeException(String message) { super(message); }
}

public class Ex12_AgeException {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("나이를 입력하시오. >> ");
			int age = sc.nextInt();
			
			Person2 p = new Person2();
			p.setAge(age);		// AgeException 발생 가능
			
			System.out.println("나이 : " + p.getAge() + "살");
		} catch(InputMismatchException e) {
			System.out.println("입력은 정수타입만 가능합니다.");
		} catch(AgeException e) {
			System.out.println("사용자 정의 메세지 : " + e.getMessage());
		} catch(Exception e) {
			System.out.println("예외 메세지 : " + e.getMessage());
		} finally {
			sc.close();
		}
	}
}
