package Test;

public class Test09 {
	public static void main(String[] args) {
		
		final int SIZE = 5;
		int[][] bingo = new int[SIZE][SIZE];
		
		// 1. 1 ~ 25 순차 저장
		for(int i = 0; i < SIZE; i++) {
			for(int j = 0; j < SIZE; j++) {
				bingo[i][j] = (i * 5) + j + 1;
			}
		}
		
		for(int i = 0; i < SIZE; i++) {
			for(int j = 0; j < SIZE; j++) {
				System.out.print(bingo[i][j] + "\t");
			}
			System.out.println();
		}
		
		
		// 2. 섞기 (SHUFFLE)
		// x 방향 : 0 ~ SIZE - 1
		// y 방향 : 0 ~ SIZE - 1
		for(int i = 0; i < SIZE; i++) {
			for(int j = 0; j < SIZE; j++) {
				int randX = (int)(Math.random() * SIZE); 
				int randY = (int)(Math.random() * SIZE);
				int tmp = bingo[i][j];
				bingo[i][j] = bingo[randX][randY];
				bingo[randX][randY] = tmp;
			}
		}
		
		System.out.println();
		
		for(int i = 0; i < SIZE; i++) {
			for(int j = 0; j < SIZE; j++) {
				System.out.print(bingo[i][j] + "\t");
			}
			System.out.println();
		}
		
		
	}
}
