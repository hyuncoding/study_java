package lambdaExpert;

import java.util.Scanner;

public class MyMath {
//	연산자 1개를 전달받아서 알맞게 연산하도록 람다식 구현
	public static Calc calculator(String oper) {
		Calc calc = null;
		
		switch(oper) {
		case "+":
			calc = (n1, n2) -> n1 + n2;
			break;
		case "-":
			calc = (n1, n2) -> n1 - n2;
			break;
		}
		
		return calc;
	}
	
	public static void main(String[] args) {
//		사용자가 수식 입력
		
//		전체 수식에서 연산자만 분리하는 메소드 구현
		OperCheck operCheck = expression -> {
			String temp = "";
			for (int i = 0; i < expression.length(); i++) {
				char c = expression.charAt(i);
				if(c == '+' || c == '-') {
					temp += c;
				}
			}
			return temp.split("");
			
		};
		
		String message = "정수의 덧셈, 뺄셈에 대한 식을 입력하세요.";
		String exampleMessage = "예)9+7-5";
		String expression = null;
		String[] numbers = null, opers = null;
		Scanner sc = new Scanner(System.in);
		int number1 = 0, number2 = 0;
		
		System.out.println(message);
		System.out.println(exampleMessage);
		
		expression = sc.nextLine();
		expression = expression.trim();
		expression = expression.replaceAll(" ", "");
		
		numbers = expression.split("\\+|\\-");
		opers = operCheck.getOpers(expression);
		
		number1 = Integer.parseInt(numbers[0].equals("") ? opers[0] + numbers[1] : numbers[0]);
		for (int i = 0; i < opers.length; i++) {
			if(i == 0 && number1 < 0) {continue;}
			number2 = Integer.parseInt(numbers[i + 1]);
			number1 = MyMath.calculator(opers[i]).calc(number1, number2);
		}
		
		System.out.println(number1);
	}
}
