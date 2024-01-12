package inputTest;

import java.util.Scanner;

public class InputTask1 {
	public static void main(String[] args) {
//		두 정수를 입력한 뒤 덧셈 결과 출력
//		단, next()만 사용한다.
		Scanner sc = new Scanner(System.in);
		int number1 = 0, number2 = 0, result = 0;
		String message1 = "첫 번째 정수 : ", message2 = "두 번째 정수 : ";
		String format = "%d + %d = %d\n";
		
		System.out.print(message1);
		number1 = Integer.parseInt(sc.next());
		
		System.out.print(message2);
		number2 = Integer.parseInt(sc.next());
		
		result = number1 + number2;
		
		System.out.printf(format, number1, number2, result);
		
	}
}
