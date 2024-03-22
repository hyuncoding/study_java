package day04_Loop;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ex02_do_while {
	public static void main(String[] args) {
		
		// while 문 vs do while 문
		// while 문은 한번도 실행되지 않을 수 있으나,
		// do while 문은 반드시 한 번은 실행된다.
		
		// 1. 1 ~ 10
		int a = 1;
		do {
			System.out.println(a);
			a++;
		} while (a < 1);
		
		// 2. 10 ~ 1
		int b = 10;
		do {
			System.out.println(b);
			b--;
		} while (b > 0);
		
		// 3. 'a' ~ 'z'
		char ch = 'a';
		
		do {
			System.out.println(ch);
			ch++;
		} while(ch <= 'z');
		
		// 4. 0 이상의 정수를 입력받기
		// 0 미만의 정수가 입력되면 재입력하기
		
		Scanner sc = new Scanner(System.in);
		int c;
		
		do {
			System.out.print("0 이상의 정수를 입력하시오. >>");
			c = sc.nextInt();	// int를 여기서 붙여서 선언하게 되면 반복할 때마다 공간 생성
			
			if(c < 0) {
				System.out.println("0보다 작습니다. 0 이상의 정수를 입력하시오.");
			}
		} while(c < 0);
		
		sc.close();
		
		// 5. 수도 맞추기
		// 대한민국의 수도를 맞출 때까지 묻기
		// 몇 번만에 맞췄는지 함께 출력
		String sudo = "";
		int cnt = 0;
		
		do {
			sudo = JOptionPane.showInputDialog("대한민국의 수도는 어디입니까?");
			cnt++;
			if(!sudo.equals("서울") && !sudo.equalsIgnoreCase("seoul")) {
				JOptionPane.showMessageDialog(null, "틀렸습니다. 다시 맞추시오.");
			}
		} while(!sudo.equals("서울") && !sudo.equalsIgnoreCase("seoul"));
		JOptionPane.showMessageDialog(null, cnt + "번만에 맞췄습니다.");
		
	}
}
