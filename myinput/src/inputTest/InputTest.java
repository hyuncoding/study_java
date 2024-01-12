package inputTest;

import java.util.Scanner;

public class InputTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = null, firstName = null, lastName = null;
		
		System.out.print("이름: ");
//		name = sc.next();
//		lastName = sc.next();
//		firstName = sc.next();
//		name = lastName + firstName;
		name = sc.nextLine();
		
		System.out.println(name + "님 환영합니다");
	}
}
