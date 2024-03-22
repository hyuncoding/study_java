package Test;

import java.util.Scanner;

public class Test09 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("몸무게 입력 >>> ");
		double weight = sc.nextDouble();
		
		System.out.print("키 입력 >>> ");
		double height = sc.nextDouble();
		height /= 100;
		
		double bmi = weight / (height * height);
		
		System.out.println("BMI 지수 : " + bmi);
		
		String result = (bmi >= 25) ? "과체중" : (bmi >= 20) ? "정상" : "저체중";
		System.out.println(result);
		
		sc.close();

	}
	
}
