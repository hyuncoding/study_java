package Test;

import java.util.Scanner;

public class Test01 {
//	Test01.java
//	성(lastName), 이름(firstName)을 각각 입력 받아
//	하나의 이름(fullName)을 완성하시오. StringBuffer 클래스를 이용하시오.
//	위의 방식으로 두 이름을 입력 받아 두 이름(fullName)의 동등 비교를 진행하시오.
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String lastName1;
		String firstName1;
		String lastName2;
		String firstName2;
		StringBuffer sb1 = new StringBuffer();
		StringBuffer sb2 = new StringBuffer();
		
		System.out.print("성을 입력하세요 >> ");
		lastName1 = sc.next();
		System.out.print("이름을 입력하세요 >> ");
		firstName1 = sc.next();
		
		sb1.append(lastName1);
		sb1.append(firstName1);
		
		System.out.print("성을 입력하세요 >> ");
		lastName2 = sc.next();
		System.out.print("이름을 입력하세요 >> ");
		firstName2 = sc.next();
		
		sb2.append(lastName2);
		sb2.append(firstName2);
		
		if(sb1.toString().equals(sb2.toString())) {
			System.out.println("같은 이름입니다.");
		} else {
			System.out.println("다른 이름입니다.");
		}
		
		sc.close();
	}
	
}
