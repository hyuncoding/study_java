package arrayTest;

import java.util.Scanner;

public class ArTask2 {
	public static void main(String[] args) {
		
//		사용자에게 입력받은 문자열 중 소문자는 모두 대문자로,
//		대문자는 모두 소문자로 변경한다.
//		null과 ""
//		null : 아래에서 대입연산자를 사용할 때, 다른 값으로 대체할 때
//		"" : 아래에서 다른 문자열과 연결할 때, 다른 값이 누적 연결될 때
		
//		Scanner sc = new Scanner(System.in);
//		String data = null, data2 = "", message = "문자열 입력 : ";
//		
//		System.out.print(message);
//		data = sc.nextLine();
//		
//		for (int i = 0; i < data.length(); i++) {
//			char c = data.charAt(i);
//			if(c >= 65 && c <= 90) { // 대문자
//				data2 += (char)(c + 32);
//			} else if(c >= 97 && c <= 122){ // 소문자
//				data2 += (char)(c - 32);
//			} else {
//				data2 += c;
//			}
//		}
//		
//		System.out.println(data2);
		
//		정수를 한글로 변경
//		입력 예) 1024
//		출력 예) 일공이사
		Scanner sc = new Scanner(System.in);
		String hangeul = "공일이삼사오육칠팔구", input = null;
		String message = "정수 : ", result = "";
		
		System.out.print(message);
		input = sc.next();
		
		for (int i = 0; i < input.length(); i++) {
			result += hangeul.charAt(input.charAt(i) - 48);
		}
		
		System.out.println(result);
		
		
		
		
	}
}
