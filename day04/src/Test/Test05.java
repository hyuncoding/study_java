package Test;

import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		int a, b;
		System.out.print("첫 번째 정수 >>> ");
		a = sc.nextInt();
		System.out.print("두 번째 정수 >>> ");
		b = sc.nextInt();
		
		if(a > b) {
			int tmp;
			tmp = a;
			a = b;
			b = tmp;
		}
		
		for(int i = a; i <= b; i++) {
			sum += i;
		}
		
		System.out.println(a + "부터 " + b + "까지 모든 정수의 합은 " + sum + "입니다.");
		sc.close();
	}
}
