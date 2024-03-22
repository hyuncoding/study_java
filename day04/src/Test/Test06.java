package Test;

import java.util.Random;
import java.util.Scanner;

public class Test06 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		
		int cnt = 0;
		int num = random.nextInt(100) + 1;
		
		int userInput;
		
		do {
			System.out.print("입력 >> ");
			userInput = sc.nextInt();
			if(userInput > num) System.out.println("Down!");
			else if(userInput < num) System.out.println("Up!");
			else System.out.println("Answer!");
			cnt++;
		} while(userInput != num);
		
		System.out.println("총 " + cnt + "회만에 성공!");
		sc.close();
	}

}
