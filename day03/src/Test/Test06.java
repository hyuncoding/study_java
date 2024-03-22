package Test;

import java.util.Scanner;

public class Test06 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("임의의 문자 하나를 입력하세요. >>> ");
		char userInput = sc.next().charAt(0);
		
		String result = "";
		
		if(userInput >= 48 && userInput <= 57) {
			result = "아라비아 숫자";
		} else if(userInput >= 65 && userInput <= 90) {
			result = "대문자";
		} else if(userInput >= 97 && userInput <= 122) {
			result = "소문자";
		} else {
			result = "일반 문자";
		}
		
		System.out.println(result);
		
		sc.close();
		
	}
}
