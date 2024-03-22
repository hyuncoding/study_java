package day04_Loop;

import java.util.Scanner;

public class Ex04_break {
	public static void main(String[] args) {
		
		// 1. 1 ~ 100 모든 정수의 합 구하기
		// 단, 합이 2000 이상이면 멈추고, 어디까지 더한 결과가 최초 2000 이상인지 출력하기
		int total = 0;	// 합계 변수 초기화 0 
		int i;
		for(i = 1; i < 101; i++) {
			total += i;
			if(total > 2000) break;
		}
		System.out.println("최초로 총값이 2000보다 커지는 곳은 " + i + "까지 더했을 때 입니다.");
		System.out.println(total);
		
		
		// 2. "admin" 아이디가 입력될 때 까지 계속 입력받기
		// 몇 번만에 입력되었는지 출력
		
		String userID = "admin";
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		String userInput = "";
		do {
			cnt++;
			System.out.print("ID 입력 >> ");
			userInput = sc.nextLine();
			if(userInput.equals(userID)) break;
			System.out.println("틀렸습니다. 다시 입력하세요.");
		} while(!userInput.equals(userID));
		
		System.out.println("" + cnt + "번만에 맞추셨습니다.");
		
		// 3. 비밀번호가 "1234"이면 종료 아니면 계속 입력받기
		// 최대 5번까지 시도 가능
		// "성공", "실패"
		
		int PW;
		int cnt2 = 0;
		while(true) {
			System.out.print("비밀번호 입력 >> ");
			PW = sc.nextInt();
			cnt2++;
			if(PW == 1234) {
				System.out.println("비밀번호 입력에 성공하였습니다.");
				break;
			}
			if(cnt2 == 5) {
				System.out.println("비밀번호를 5회 이상 잘못 입력하였습니다. 프로그램을 종료합니다.");
				break;
			}
			System.out.println("틀렸습니다. 다시 입력하세요. 남은 기회는 " + (5-cnt2) + "번입니다.");
		}
	
		sc.close();
		
		
	}
}
