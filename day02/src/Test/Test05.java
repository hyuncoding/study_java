package Test;

import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 점수를 입력하세요 >> ");
	    int korean = sc.nextInt();
	    
	    System.out.print("영어 점수를 입력하세요 >> ");
		int english = sc.nextInt();
		
		System.out.print("수학 점수를 입력하세요 >> ");
		int math = sc.nextInt();
		
		double average = (korean + english + math) / 3.0;		// 자동 형 변환 발생
		char grade = (average >= 90) ? 'A' : (average >= 80) ? 'B' : (average >= 70) ? 'C' : (average >= 60) ? 'D' : 'F';
		
		
		System.out.println("평균 점수 : " + average);
		System.out.printf("평균은 %.2f점, 학점은 %c학점이다.\n", average, grade);
		System.out.println("학점 : " + grade);
		System.out.println("국어 : " + korean);
		System.out.println("영어 : " + english);
		System.out.println("수학 : " + math);
		
		sc.close();
	}
}
