package controlStatementTest;

import java.util.Scanner;

public class WhileTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inputColor = 0;
		String inputMessage = "Q. ����� �����ϴ� ���� �����ϼ���.\n1. ������\n2. �����\n3. ������\n4. ���\n5. ������";
		String exampleMessage = "��)3";
		String redMessage = "������ : �Ұ��� �������̰� �������̴�.";
		String yellowMessage = "����� : �߶��ϰ� ��� �Ϳ��� �����ְ� ���ϴ�.";
		String blackMessage = "������ : �����ϰ� ����ϰ� ��ö�ϰ� ������.";
		String whiteMessage = "��� : õ�簰�� ����ϰ� ������ �����ϰ� ������� ����.";
		String errorMessage = "1���� 4������ ������ �Է����ּ���.";
		String result = null;
		
		while(true) {
		System.out.println(inputMessage);
		System.out.println(exampleMessage);
		inputColor = sc.nextInt();
		
		if(inputColor == 5) {break;}
		
		switch(inputColor) {
		case 1:
			result = redMessage;
			break;
		case 2:
			result = yellowMessage;
			break;
		case 3:
			result = blackMessage;
			break;
		case 4:
			result = whiteMessage;
			break;
		default:
			result = errorMessage;
			break;
		}
		
		System.out.println(result);
		}
		
//		�̸� 10�� ��� : �߸��� �������� while�� ���
//		int count = 0;
//		while(count != 10) {
//			System.out.println(count + ".����");
//			count++;
//		}
	}
}
