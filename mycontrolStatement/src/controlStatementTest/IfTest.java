package controlStatementTest;

import java.util.Scanner;

public class IfTest {
	public static void main(String[] args) {
		
//		��� ��
//		�� ���� �Է¹ޱ�, nextInt() ���
		Scanner sc = new Scanner(System.in);
		int number1 = 0, number2 = 0;
		
		String message = "�� ������ �Է��ϼ���.", exampleMessage = "��)3 6";
		
		System.out.println(message);
		System.out.println(exampleMessage);
		
		number1 = sc.nextInt();
		number2 = sc.nextInt();
		
		if(number1 > number2) {
			System.out.println("�� ū ��: " + number1);
		}else if(number1 < number2) {
			System.out.println("�� ū ��: " + number2);
		}else {
			System.out.println("�� ���� �����ϴ�.");
		}
		
	}
}
