package Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

//Test04.java
//Set을 이용하여 5X5 Bingo 배열을 생성하시오.

public class Test04 {
	public static void main(String[] args) {
		
		final int SIZE = 5;
		
//		Set<Integer> set = new HashSet<>();			// set에서 순서대로 데이터가 가져와 지지 않는다.
		Set<Integer> set = new LinkedHashSet<>();	// set에 저장된 순서대로 데이터를 가져온다.
		
		while(set.size() != 25) {
			set.add((int)(Math.random() * 25) + 1);
		}
		
		// set -> bingo 2차원 배열로 이동 및 출력
		
		Iterator<Integer> itr = set.iterator();
		
		int[][] bingo = new int[SIZE][SIZE];
		
		for(int i = 0; i < SIZE; i++) {
			for(int j = 0; j < SIZE; j++) {
				bingo[i][j] = itr.next();
				System.out.print(bingo[i][j] + "\t");
			}
			System.out.println();
		}
		
		
		
		
		
	}
}
