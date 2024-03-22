package day02_Scanner;

import java.util.Scanner;

public class Ex03_Scanner {
	public static void main(String[] args) {
		
		// 1) Scanner 클래스의 sc 객체 생성
		Scanner sc = new Scanner(System.in);
		
		// nextInt(), nextDouble() : 숫자 뒤 \n 을 통해 숫자로 인식
		
		// 2) 입력
		System.out.print("나이 입력 >> ");		// 20\n
		int age = sc.nextInt();				// age = 20, \n은 남겨둠
		
		System.out.print("키 입력 >> ");		// \n172.5\n
		double height = sc.nextDouble();	// height = 172.5, \n은 남겨둠
		
		System.out.print("성명 입력 >> ");		
		String name = sc.nextLine();		// name = \n
		
		System.out.print("성별 입력 >> ");
		char gender = sc.next().charAt(0);
		
		// 3) 출력
		System.out.println("성명 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("키 : " + height);
		System.out.println("성별 : " + gender);
		
		sc.close();
	}
}
