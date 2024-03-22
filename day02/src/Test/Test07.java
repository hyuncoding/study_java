package Test;

import java.util.Scanner;

public class Test07 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민등록번호(11자리 숫자만) 입력 >>>");
		String strRegNum = sc.next();
		
		char gender = strRegNum.charAt(6);
		
		boolean isMale = (gender == '1') || (gender == '3');
		
		System.out.println(isMale ? "남자" : "여자");
		
		sc.close();
	}
}
