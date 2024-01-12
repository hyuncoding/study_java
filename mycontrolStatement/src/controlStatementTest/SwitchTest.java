package controlStatementTest;

import java.util.Scanner;

public class SwitchTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inputColor = 0;
		String inputMessage = "Q. 당신이 좋아하는 색을 선택하세요.\n1. 빨간색\n2. 노란색\n3. 검은색\n4. 흰색";
		String exampleMessage = "예)3";
		String redMessage = "빨간색 : 불같고 열정적이고 적극적이다.";
		String yellowMessage = "노란색 : 발랄하고 밝고 귀엽고 개성있고 착하다.";
		String blackMessage = "검은색 : 묵묵하고 든든하고 냉철하고 멋지다.";
		String whiteMessage = "흰색 : 천사같고 깔끔하고 정리를 좋아하고 배려심이 많다.";
		String errorMessage = "1부터 4까지의 정수를 입력해주세요.";
		String result = null;
		
		System.out.println(inputMessage);
		System.out.println(exampleMessage);
		inputColor = sc.nextInt();
		
		switch(inputColor) {
		case 1:
			result = redMessage;
			break;
		case 2:
			result = yellowMessage;
			break;
		case 3:
			result = blackMessage;
			break;
		case 4:
			result = whiteMessage;
			break;
		default:
			result = errorMessage;
			break;
		}
		System.out.println(result);
	}
}
