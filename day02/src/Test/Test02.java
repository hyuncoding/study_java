package Test;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이를 입력하세요 >>>");
		int age = sc.nextInt();
		
	    System.out.println((age >= 20) ? "성인" : "미성년자");
	    /*
	     * boolean isAdult = (age >= 20);
	     * System.out.println(isAdult ? "성인" : "미성년자");
	     */
	    sc.close();
		
	}
}
