package controlStatementTest;

import java.util.Scanner;

public class ForTask {
	public static void main(String[] args) {
		
//		�����----
		Scanner sc = new Scanner(System.in);
		int silverSum1 = 0, silverInput = 0, silverSum2 = 0;
		String message = null;
		
//		�����----
//		1��
		for (int i = 1; i <= 100; i++) {
			System.out.println(i);
		}
//		2��
		for (int i = 100; i > 0; i--) {
			System.out.println(i);
		}
//		3��
		for (int i = 2; i <= 50; i+=2) {
			System.out.println(i);
		}
		
//		�ǹ�----
//		1��
		for (int i = 1; i <= 10; i++) {
			silverSum1 += i;
		}
		System.out.println(silverSum1);
		
//		2��
		message = "n �Է� : ";
		System.out.print(message);
		silverInput = sc.nextInt();
		
		for (int i = 1; i <= silverInput; i++) {
			silverSum2 += i;
		}
		System.out.println("1���� " + silverInput + "������ ���� " + silverSum2 + "�Դϴ�.");
		
//		���----
//		1��
		for (int i = 65; i < 71; i++) {
			System.out.println((char)i);
		}
		
//		2��
		for (int i = 65; i < 71; i++) {
			System.out.println((char)(i > 66 ? i + 1 : i));
		}
		
//		���̾�----
//		1��
		for (int i = 0; i < 15; i++) {
			System.out.print(i % 5);
		}
		
//		2��
		for (int i = 65; i <= 90; i++) {
			if(i % 2 == 1) {
				System.out.print((char)(i + 32));
			} else {
				System.out.print((char)i);
			}
		}
		
	}
}
