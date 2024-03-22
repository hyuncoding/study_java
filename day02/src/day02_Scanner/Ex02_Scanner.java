package day02_Scanner;

import java.util.Scanner;

public class Ex02_Scanner {
	public static void main(String[] args) {
		
		// import 하는 방법
		// 클래스명을 끝까지 쓰지 않고, 자동완성(Ctrl + Spacebar)을 이용한다.
		
		// 1) Scanner 클래스의 sc 객체 생성
		Scanner sc = new Scanner(System.in);
		
		// 2) 입력
		System.out.println("성명 입력 >> ");
		String name = sc.nextLine();
		System.out.println(name);
		sc.close();
		
	}
}
