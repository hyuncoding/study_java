package Test;

import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하시오. >> ");
		int score = sc.nextInt();
		
		char grade;
		char point;
		
		// point
		switch(score % 10) {
		case 0:
		case 1:
		case 2:
		case 3:
			point = '-';
			break;
		case 4:
		case 5:
		case 6:
			point = '0';
			break;
		default:
			point = '+';
		}
		
		// grade
		switch(score / 10) {
		case 10: grade = 'S'; point = ' '; break;
		case 9: grade = 'A'; break;
		case 8: grade = 'B'; break;
		case 7: grade = 'C'; break;
		default: grade = 'F'; point = ' ';
		}
		
		System.out.println("학점 = " + grade + point);
		
		sc.close();
		
	}
}
