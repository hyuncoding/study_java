package Test;

import java.util.Arrays;
import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		int[] arr = new int[5];
		for(int i = 0; i < 5; i++) {
			System.out.print((i + 1) + "번째 원소 입력 >> ");
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		
		System.out.println("입력한 배열: " + Arrays.toString(arr));
		System.out.println("총합 : " + sum);
		
		sc.close();
		
	}
}
