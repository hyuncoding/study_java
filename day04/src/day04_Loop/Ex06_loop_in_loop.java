package day04_Loop;

public class Ex06_loop_in_loop {
	public static void main(String[] args) {
		
		// 구구단 출력
		
		// fix(고정)값을 바깥쪽 loop에 배치
		
		// 1. 세로로 출력
		for(int dan = 2; dan < 10; dan++) {
			for(int num = 1; num < 10; num++) {
				System.out.println(dan + "x" + num + "=" + (dan*num));
			}
		}
		
		// 2. 가로로 출력
		for(int dan = 1; dan < 10; dan++) {
			for(int num = 1; num < 10; num++) {
				System.out.print(num + "x" + dan + "=" + (dan * num) + "\t");
			}
			System.out.print("\n");
		}
	}
}
