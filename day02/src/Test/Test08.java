package Test;

import java.util.Scanner;

public class Test08 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("섭씨 온도 입력 >>>");
		double celcius = sc.nextDouble();
		
		double fahren = celcius * 1.8 + 32;
		
		System.out.println("변환된 화씨 온도는 화씨 " + fahren + "도 입니다.");
		
		sc.close();
		
	}
}
