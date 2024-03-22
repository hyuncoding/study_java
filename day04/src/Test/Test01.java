package Test;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		// 평점을 정수(1~5)로 입력받아 별(*, **, ***, ****, *****) 출력하기
		// 잘못된 평점이 입력되면 다시 입력 받고, 
		// System.out.print("*")를 평점만큼 반복해서 사용할 것
		
		Scanner sc = new Scanner(System.in);
		int score;
		do {
			System.out.print("평점을 입력하세요. >> ");
			score = sc.nextInt();
			if(score < 1 || score > 5) {
				System.out.println("1 이상 5 이하의 정수를 다시 입력하세요.");
			}
		} while(score < 1 || score > 5);
		
		while(score > 0) {
			System.out.print("*");
			score--;
		}
		sc.close();
	}
}
