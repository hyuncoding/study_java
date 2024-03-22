package day04_array;

import java.util.Scanner;

public class Ex04_for_each {
	public static void main(String[] args) {
		
		String[] friends = {"엘리스", "제임스", "데이빗"};
		
		// 1. 일반 for 문
		for(int i = 0; i < friends.length; i++) {
			System.out.print(friends[i] + " ");
		}
		System.out.println();
		
		// 2. 향상된 for 문
		for(String friend : friends) {	// friends 배열의 모든 요소를 하나씩 String friend 변수로 옮겨서 사용
			System.out.print(friend + " ");
		}
		System.out.println();
		
		
		// 길이가 3인 hobbies 배열을 선언하고, 
		// 사용자로부터 취미를 3개 입력받아 hobbies 배열에 저장 후 출력하기
		
		Scanner sc = new Scanner(System.in);
		
		String[] hobbies = new String[3];
		
		for(int i = 0; i < 3; i++) {
			System.out.print((i+1) + "번째 취미 입력 >>> ");
			hobbies[i] = sc.next();
		}
		for(String hobby : hobbies) {
			System.out.print(hobby + " ");
		}
		System.out.println();
		
		sc.close();
		
	}
}
