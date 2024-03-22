package Test;

import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double num;
		int sum = 0;
		
		do {
			System.out.print("2 이상의 양수 입력 >>> ");
			num = sc.nextDouble();
			if(num < 2) {
				System.out.println("입력하신 수가 2보다 작습니다. 다시 입력하세요.");
			}
		} while(num < 2);
		
		for(int i = 1; i <= num; i++) {
			sum += i;
		}
		
		System.out.println("총합 : " + sum);
		sc.close();
	}
}
