package day05_2D_array;

import java.util.Scanner;

public class Ex02_2D_array {
	public static void main(String[] args) {
		
		/*
		 *  가변형 2차원 배열
		 *  1. 각 행의 열 개수가 서로 다른 배열
		 *  2. 선언 방법
		 *  	int[][] arr = new int[3][];		// 3행 n열
		 *  	arr[0] = new int[2];			// 0행은 2열
		 *  	arr[1] = new int[3];			// 1행은 3열
		 *  	arr[2] = new int[4];			// 2행은 4열
		 */
		
		int[][] arr = new int[3][];
		
		arr[0] = new int[2];
		arr[1] = new int[3];
		arr[2] = new int[4];
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		
		/*
		 * 1번 손님 몇 좌석을 예약할까요? >> 3
		 * 2번 손님 몇 좌석을 예약할까요? >> 2
		 * 3번 손님 몇 좌석을 예약할까요? >> 5
		 * 
		 * 예약현황
		 * 1번 : 000
		 * 2번 : 00
		 * 3번 : 00000
		 */
		
        Scanner sc = new Scanner(System.in);
        
        int[][] seat = new int[3][];
        
        for(int i = 0; i < seat.length; i++) {
        	System.out.print((i+1) + "번 손님 몇 좌석을 예약할까요? >> ");
        	int p = sc.nextInt();
        	seat[i] = new int[p];
        }
		
        System.out.println("예약현황");
        for(int i = 0; i < seat.length; i++) {
        	System.out.print((i+1) + "번 : ");
        	for(int j = 0; j < seat[i].length; j++) {
        		System.out.print(seat[i][j] + " ");
        	}
        	System.out.println();
        }
        
        sc.close();
	}
}













