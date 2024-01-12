package arrayTest;

import java.util.Scanner;

public class ArTask1 {
	public static void main(String[] args) {
//      브론즈
//      1~10까지 배열에 담고 출력
		int[] arData1 = new int[10];
		
		for (int i = 0; i < arData1.length; i++) {
			arData1[i] = i + 1;
		}
		
		for (int i = 0; i < arData1.length; i++) {
			System.out.println(arData1[i]);
		}
		
//      10~1까지 중 짝수만 배열에 담고 출력
		int[] arData2 = new int[5];
		
		for (int i = 0; i < 5; i++) {
			arData2[i] = (5 - i) * 2;
		}
		
		for (int i = 0; i < arData2.length; i++) {
			System.out.println(arData2[i]);
		}
		
//      1~100까지 배열에 담은 후 홀수만 출력
		int[] arData3 = new int[100];
		
		for (int i = 0; i < arData3.length; i++) {
			arData3[i] = i + 1;
		}
		
		for (int i = 0; i < arData3.length; i++) {
			if(i % 2 != 0) {continue;}
			System.out.println(arData3[i]);
		}
      
//      실버
//      1~100까지 배열에 담은 후 짝수의 합 출력
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
		
//      A~F까지 배열에 담고 출력
		char[] arData5 = new char[6];
		
		for (int i = 0; i < arData5.length; i++) {
			arData5[i] = (char)(i + 65);
		}
		
		for (int i = 0; i < arData5.length; i++) {
			System.out.println(arData5[i]);
		}
		
//      A~F까지 중 C제외하고 배열에 담은 후 출력
		char[] arData6 = new char[5];
		
		for (int i = 0; i < arData6.length; i++) {
			arData6[i] = (char)(i > 1 ? i + 66 : i + 65);
		}
		
		for (int i = 0; i < arData6.length; i++) {
			System.out.println(arData6[i]);
		}
      
//      골드
//      5개의 정수를 입력받고 배열에 담은 후 최대값과 최소값 출력
		Scanner sc = new Scanner(System.in);
		int maxNum = 0, minNum = 0, inputNum = 0;
		int[] arData7 = new int[5];
		
		String message1 = "정수 5개를 입력하세요.";
		String exampleMessage1 = "예)1 2 3 4 5";
		
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
		
		System.out.println("최대값 : " + maxNum);
		System.out.println("최소값 : " + minNum);
		
//      다이아
//      사용자가 입력할 정수의 개수만큼 배열을 만든 후 정수를 입력받고 평균 구하기
		int count = 0, sum = 0;
		double average = 0.0;
		int[] arData8 = null;
		String[] arOrdinal = {"첫", "두", "세", "네", "다섯"};
		String message2 = "입력하고 싶은 정수의 개수를 입력하세요 : ";
		String message3 = "번째 정수: ";
		
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
		
		System.out.println("평균 : " + average);
		
		
	}
}
