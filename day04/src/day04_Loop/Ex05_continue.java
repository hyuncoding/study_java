package day04_Loop;

import java.util.Scanner;

public class Ex05_continue {
	public static void main(String[] args) {
		
		// continue : 반복에서 제외하고 싶은 데이터를 처리할 때
		
		// 1. 1 ~ 20 사이에서 3의 배수를 제외하고 출력(for문)
		for(int i = 1; i < 21; i++) {
			if(i % 3 == 0) continue;	// 3으로 나눈 나머지가 0이면 3의 배수
			System.out.println(i);
		}
		
		// 2. 1 ~ 20 사이에서 3의 배수를 제외하고 출력(while문)
		int b = 0;
		while(b < 21) {
			b++;
			if(b % 3 == 0) continue;
			System.out.println(b);
		}
		
		// 3. 애들 밥 먹이기
		// "굴" 빼고 모두 잘 먹는 아이
		// 어떤 반찬이든 5번만 먹게 처리
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		String food = "";
		
		while(cnt < 5) {
			System.out.print("어떤 반찬을 줄까? >> ");
			food = sc.next();
			if(food.equals("굴")) {
				System.out.println("굴 싫어싫어");
				continue;
			}
			System.out.println(food + " 잘 먹겠습니다.");
			System.out.println("또 주세용.");
			cnt++;
		}
		
		sc.close();
		
		
		
	}
}
