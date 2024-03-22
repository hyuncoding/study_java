package Test;

import java.util.Scanner;

public class Test10 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("월 입력 >> ");
		int month = sc.nextInt();
		
		if(month < 1 || month > 12) {
			System.out.println("없는 월이다.");
			System.exit(0);		// 정상 종료
			// System.exit(1);		// 비정상 종료 (0 이외의 값 전달)
		}
		
		switch (month) {
		case 2 :
			System.out.println("2월은 28일까지 있습니다.");
			break;
		case 1 :
		case 3 :
		case 5 :
		case 7 :
		case 8 :
		case 10 :
		case 12 :
			System.out.println(month + "월은 31일까지 있습니다.");
			break;
		default :
			System.out.println(month+"월은 30일까지 있습니다.");
		}
		sc.close();
	}
}
