package Test;

import java.util.Scanner;

public class Test07 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자 입력 >>> ");
		char userInput = sc.next().charAt(0);
		
		if(userInput >= 65 && userInput <= 90) {
			userInput += 32;
		} else if(userInput >= 97 && userInput <= 122) {
			userInput -= 32;
		}
		
		System.out.println(userInput);
		
		sc.close();
	}
}
