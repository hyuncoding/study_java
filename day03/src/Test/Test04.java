package Test;

import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수 입력 >> ");
		int score = sc.nextInt();
		
		char grade;
		char point;
		
		int gradeNum = score / 10;
		int pointNum = score % 10;
		
		if(pointNum >=0 && pointNum <= 3) {
			point = '-';
		} else if(pointNum > 3 && pointNum <= 6) {
			point = '0';
		} else {
			point = '+';
		}
		
		if(gradeNum == 10) {
			grade = 'S'; point = ' ';
		} else if(gradeNum == 9) {
			grade = 'A';
		} else if(gradeNum == 8) {
			grade = 'B';
		} else if(gradeNum == 7) {
			grade = 'C';
		} else {
			grade = 'F'; point = ' ';
		}
		
		System.out.println("학점은 " + grade + point + "입니다.");
		
		sc.close();
		
	}
}
