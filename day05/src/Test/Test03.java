package Test;

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] scores = new int[5];
		
		String[] names = {"강호동", "신동엽", "김용만", "유재석", "남희석"};
		int sum = 0;
		
		for(int i = 0; i < names.length; i++) {
			System.out.print(names[i] + "의 점수 입력 >> ");
			scores[i] = sc.nextInt();
			sum += scores[i];
		}
		
		int maxScore = 0;
		int maxIdx = 0;
		int minScore = 100;
		int minIdx = 0;
		
		for(int i = 0; i < names.length; i++) {
			if(maxScore < scores[i]) {
				maxScore = scores[i];
				maxIdx = i;
			}
			if(minScore > scores[i]) {
				minScore = scores[i];
				minIdx = i;
			}
		}
		
		System.out.println("최대(" + names[maxIdx] + ") : " + maxScore + "점");
		System.out.println("최소(" + names[minIdx] + ") : " + minScore + "점");
		System.out.println("평균 : " + (sum / 5) + "점");
		
		sc.close();
		
	}
}
