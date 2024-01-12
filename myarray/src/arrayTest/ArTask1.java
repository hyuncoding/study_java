package arrayTest;

import java.util.Scanner;

public class ArTask1 {
	public static void main(String[] args) {
//      �����
//      1~10���� �迭�� ��� ���
		int[] arData1 = new int[10];
		
		for (int i = 0; i < arData1.length; i++) {
			arData1[i] = i + 1;
		}
		
		for (int i = 0; i < arData1.length; i++) {
			System.out.println(arData1[i]);
		}
		
//      10~1���� �� ¦���� �迭�� ��� ���
		int[] arData2 = new int[5];
		
		for (int i = 0; i < 5; i++) {
			arData2[i] = (5 - i) * 2;
		}
		
		for (int i = 0; i < arData2.length; i++) {
			System.out.println(arData2[i]);
		}
		
//      1~100���� �迭�� ���� �� Ȧ���� ���
		int[] arData3 = new int[100];
		
		for (int i = 0; i < arData3.length; i++) {
			arData3[i] = i + 1;
		}
		
		for (int i = 0; i < arData3.length; i++) {
			if(i % 2 != 0) {continue;}
			System.out.println(arData3[i]);
		}
      
//      �ǹ�
//      1~100���� �迭�� ���� �� ¦���� �� ���
		int[] arData4 = new int[100];
		
		int evenSum = 0;
		
		for (int i = 0; i < arData4.length; i++) {
			arData4[i] = i + 1;
		}
		
		for (int i = 0; i < arData4.length; i++) {
			if(i % 2 != 0) {
				evenSum += arData4[i];
			}
		}
		
		System.out.println(evenSum);
		
//      A~F���� �迭�� ��� ���
		char[] arData5 = new char[6];
		
		for (int i = 0; i < arData5.length; i++) {
			arData5[i] = (char)(i + 65);
		}
		
		for (int i = 0; i < arData5.length; i++) {
			System.out.println(arData5[i]);
		}
		
//      A~F���� �� C�����ϰ� �迭�� ���� �� ���
		char[] arData6 = new char[5];
		
		for (int i = 0; i < arData6.length; i++) {
			arData6[i] = (char)(i > 1 ? i + 66 : i + 65);
		}
		
		for (int i = 0; i < arData6.length; i++) {
			System.out.println(arData6[i]);
		}
      
//      ���
//      5���� ������ �Է¹ް� �迭�� ���� �� �ִ밪�� �ּҰ� ���
		Scanner sc = new Scanner(System.in);
		int maxNum = 0, minNum = 0, inputNum = 0;
		int[] arData7 = new int[5];
		
		String message1 = "���� 5���� �Է��ϼ���.";
		String exampleMessage1 = "��)1 2 3 4 5";
		
		System.out.println(message1);
		System.out.println(exampleMessage1);
		
		for (int i = 0; i < arData7.length; i++) {
			inputNum = sc.nextInt();
			arData7[i] = inputNum;
		}
		
		maxNum = arData7[0];
		minNum = arData7[0];
		
		for (int i = 1; i < arData7.length; i++) {
			if(arData7[i] > maxNum) {maxNum = arData7[i];}
			if(arData7[i] < minNum) {minNum = arData7[i];}
		}
		
		System.out.println("�ִ밪 : " + maxNum);
		System.out.println("�ּҰ� : " + minNum);
		
//      ���̾�
//      ����ڰ� �Է��� ������ ������ŭ �迭�� ���� �� ������ �Է¹ް� ��� ���ϱ�
		int count = 0, sum = 0;
		double average = 0.0;
		int[] arData8 = null;
		String[] arOrdinal = {"ù", "��", "��", "��", "�ټ�"};
		String message2 = "�Է��ϰ� ���� ������ ������ �Է��ϼ��� : ";
		String message3 = "��° ����: ";
		
		System.out.print(message2);
		count = sc.nextInt();
		arData8 = new int[count];
		
		for (int i = 0; i < count; i++) {
			System.out.print(arOrdinal[i] + message3);
			arData8[i] = sc.nextInt();
		}
		
		for (int i = 0; i < count; i++) {
			sum += arData8[i];
		}
		
		average = sum / (double)count;
		
		System.out.print("[");
		for (int i = 0; i < count; i++) {
			System.out.print(arData8[i]);
			if(i != count -1) {
				System.out.print(" ");
			}
		}
		System.out.println("]");
		
		System.out.println("��� : " + average);
		
		
	}
}
