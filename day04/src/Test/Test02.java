package Test;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("2이상 9이하의 정수 입력 >>> ");
		int num = sc.nextInt();
		
		for(int i = 1; i <= 9; i++) {
			System.out.println(num + " x " + i + " = " + (num*i));
		}
		
		sc.close();
		
	}
}
