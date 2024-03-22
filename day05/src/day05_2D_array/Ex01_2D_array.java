package day05_2D_array;

import java.util.Arrays;
import java.util.Scanner;

public class Ex01_2D_array {
	public static void main(String[] args) {
		
		/*
		 *  고정형 2차원 배열
		 *  	1. 행과 열이 고정된 2차원 배열
		 *  	2. 선언 방법
		 *  		int[][] arr = new int[3][2];	// 3행 2열
		 *  	3. 초기화 방법
		 *  		1) int[][] arr = new int[][]{ {1, 2}, {3, 4}, {5, 6} };
		 *  		2) int[][] arr = { {1, 2}, {3, 4}, {5, 6} };	// 추천
		 */
		
		int[][] arr = {
				{1,2},
				{3,4},
				{5,6}
		};
		
		System.out.println("arr의 행수 = " + arr.length);
		System.out.println("arr[0]의 열수 = " + arr[0].length);
		System.out.println("arr[1]의 열수 = " + arr[0].length);
		System.out.println("arr[2]의 열수 = " + arr[0].length);
		
		
		// 행 인덱스 : i
		// 열 인덱스 : j
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		
		// 2행 3열 배열을 생성하고, 
		// 사용자로부터 데이터를 입력받아 저장하고 출력하기
		Scanner sc = new Scanner(System.in);
		
		int[][] arr1 = new int[2][3];
		
		for(int i = 0; i < arr1.length; i++) {
			for(int j = 0; j < arr1[i].length; j++) {
				System.out.print(i + "행 " + j + "열 입력 >> ");
				arr1[i][j] = sc.nextInt();
			}
		}
		
		for(int i = 0; i < arr1.length; i++) {
			System.out.println(Arrays.toString(arr1[i]));
		}
		
		sc.close();
	}
}
