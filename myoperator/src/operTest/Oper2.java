package operTest;

import java.util.Scanner;

public class Oper2 {
	public static void main(String[] args) {
//		대소 비교
//		두 정수 입력받기, nextInt() 사용
		Scanner sc = new Scanner(System.in);
		int number1 = 0, number2 = 0;
		String result = null;
		
		String message = "두 정수를 입력하세요.", exampleMessage = "예)3 6";
		
		System.out.println(message);
		System.out.println(exampleMessage);
		
		number1 = sc.nextInt();
		number2 = sc.nextInt();
		
		result = number1 > number2 ? "더 큰 값: "  + number1 : number1 == number2 ? "두 수는 같습니다" : "더 큰 값: " + number2;
		
		System.out.println(result);
		
		
	}
}
