package Test;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수 입력 >> ");
		int a = sc.nextInt();
		
		System.out.print("두 번째 정수 입력 >> ");
		int b = sc.nextInt();
		
		System.out.println("입력한 a 값 : " + a + ", 바뀐 b 값 : " + b);
		
		int c = a;		// int temp = a;
		a = b;
	    b = c;			// b = temp;
	    
	    System.out.println("바뀐 a 값 : " + a + ", 바뀐 b 값 : " + b);
		
		sc.close();
	}
}
