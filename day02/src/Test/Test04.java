package Test;

import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 >>> ");
		int genderInt = sc.nextInt();
		
		System.out.println((genderInt % 2 == 1) ? "남자" : "여자");
		
		sc.close();
	}
}
