package arrayTest;

import java.util.Scanner;

public class ArTask2 {
	public static void main(String[] args) {
		
//		����ڿ��� �Է¹��� ���ڿ� �� �ҹ��ڴ� ��� �빮�ڷ�,
//		�빮�ڴ� ��� �ҹ��ڷ� �����Ѵ�.
//		null�� ""
//		null : �Ʒ����� ���Կ����ڸ� ����� ��, �ٸ� ������ ��ü�� ��
//		"" : �Ʒ����� �ٸ� ���ڿ��� ������ ��, �ٸ� ���� ���� ����� ��
		
//		Scanner sc = new Scanner(System.in);
//		String data = null, data2 = "", message = "���ڿ� �Է� : ";
//		
//		System.out.print(message);
//		data = sc.nextLine();
//		
//		for (int i = 0; i < data.length(); i++) {
//			char c = data.charAt(i);
//			if(c >= 65 && c <= 90) { // �빮��
//				data2 += (char)(c + 32);
//			} else if(c >= 97 && c <= 122){ // �ҹ���
//				data2 += (char)(c - 32);
//			} else {
//				data2 += c;
//			}
//		}
//		
//		System.out.println(data2);
		
//		������ �ѱ۷� ����
//		�Է� ��) 1024
//		��� ��) �ϰ��̻�
		Scanner sc = new Scanner(System.in);
		String hangeul = "�����̻�����ĥ�ȱ�", input = null;
		String message = "���� : ", result = "";
		
		System.out.print(message);
		input = sc.next();
		
		for (int i = 0; i < input.length(); i++) {
			result += hangeul.charAt(input.charAt(i) - 48);
		}
		
		System.out.println(result);
		
		
		
		
	}
}
