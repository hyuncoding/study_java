package Test;

public class Test02 {
//	Test02.java
//	1! ~ 99! 까지 전체 결과를 출력하시오.
//	1! (1 팩토리얼) = 1
//	2! (2 팩토리얼) = 1 * 2 = 2
//	3! (3 팩토리얼) = 1 * 2 * 3 = 6
//	...
//	99!
	public static void fact(int num) {
		int result = 1;
		if(num == 1) {
			System.out.println("1! (1 팩토리얼) = 1");
			return;
		}
		System.out.print(num + "! (" + num + " 팩토리얼) = 1");
		for(int i = 2; i <= num; i++) {
			System.out.print(" * " + i);
			result *= i;
		}
		System.out.println(" = " + result);
	}
	
	public static void main(String[] args) {
		for(int i = 1; i <= 99; i++) {
			fact(i);
		}
	}
}
