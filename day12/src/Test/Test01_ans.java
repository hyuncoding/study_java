package Test;

import java.util.Scanner;

public class Test01_ans {

	static Scanner sc = new Scanner(System.in);
	
	// inputFullName() Method
	public static String inputFullName() {
		
		StringBuffer sb = new StringBuffer();
		
		System.out.print("성(first name) >>> ");
		String firstName = sc.next();
		System.out.print("이름(last name) >>> ");
		String lastName = sc.next();
		
		// firstName, lastName 결합
		sb.append(firstName).append(lastName);
		
		return sb.toString();
	}
	
	
	public static void main(String[] args) {
		
		String fullName1 = inputFullName();
		String fullName2 = inputFullName();
		
		System.out.println("성명 1 : " + fullName1);
		System.out.println("성명 2 : " + fullName2);
		
		if(fullName1.equals(fullName2)) {
			System.out.println("같은 이름이다.");
		} else {
			System.out.println("다른 이름이다.");
		}
		
	}
}
