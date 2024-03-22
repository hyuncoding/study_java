package Test;

import java.util.Scanner;

public class Test08 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력할 온도의 종류를 선택하세요.(섭씨 또는 화씨) >> ");
		String degreeType = sc.next();
		
		switch (degreeType) {
		case "섭씨" :
			System.out.print("섭씨 입력 >> ");
			double celsius = sc.nextDouble();
			double fahren = celsius * 1.8 + 32;
			System.out.println("변환된 화씨는 "+fahren+"°F 입니다.");
			break;
		default :
			System.out.print("화씨 입력 >> ");
			double fahren2 = sc.nextDouble();
			double celsius2 = (fahren2 - 32) / 1.8;
			System.out.println("변환된 섭씨는 "+celsius2+"°C 입니다.");
		}
		sc.close();
	}
}
