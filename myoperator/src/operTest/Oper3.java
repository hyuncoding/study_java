package operTest;

import java.util.Scanner;

public class Oper3 {
	public static void main(String[] args) {
//		�ɸ� �׽�Ʈ
	      /*
	       * Q. ����� �����ϴ� ���� �����ϼ���.
	       * 1. ������
	       * 2. �����
	       * 3. ������
	       * 4. ���
	       * 
	       * ������ : �Ұ��� �������̰� �������̴�.
	       * ����� : �߶��ϰ� ��� �Ϳ��� �����ְ� ���ϴ�.
	       * ������ : �����ϰ� ����ϰ� ��ö�ϰ� ������.
	       * ��� : õ�簰�� ����ϰ� ������ �����ϰ� ������� ����.
	       * 
	       */
		Scanner sc = new Scanner(System.in);
		int inputColor = 0;
		String inputMessage = "Q. ����� �����ϴ� ���� �����ϼ���.\n1. ������\n2. �����\n3. ������\n4. ���";
		String exampleMessage = "��)3";
		String redMessage = "������ : �Ұ��� �������̰� �������̴�.";
		String yellowMessage = "����� : �߶��ϰ� ��� �Ϳ��� �����ְ� ���ϴ�.";
		String blackMessage = "������ : �����ϰ� ����ϰ� ��ö�ϰ� ������.";
		String whiteMessage = "��� : õ�簰�� ����ϰ� ������ �����ϰ� ������� ����.";
		String errorMessage = "1���� 4������ ������ �Է����ּ���.";
		String result = null;
		
		System.out.println(inputMessage);
		System.out.println(exampleMessage);
		inputColor = sc.nextInt();
		
		result = inputColor == 1 ? redMessage
				: inputColor == 2 ? yellowMessage
						: inputColor == 3 ? blackMessage
								: inputColor == 4 ? whiteMessage
										: errorMessage;
		
		System.out.println(result);
	}
}
