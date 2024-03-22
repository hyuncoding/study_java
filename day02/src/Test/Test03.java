package Test;

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("매출액 입력 >>>");
		int sales = sc.nextInt();
		
		System.out.print("등급 입력 >>>");
		String grade = sc.next();
		
		double vipSales = sales * 0.8;
		double normalSales = sales * 0.95;
		
		System.out.println(grade.equalsIgnoreCase("VIP") ? vipSales : normalSales);
		
		sc.close();
	}
}
