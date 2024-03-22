package Test;

import java.util.Random;

public class Test04 {
	public static void main(String[] args) {
//		로또 생성기
//		1 ~ 45 사이 정수를 배열에 저장한 뒤,
//		임의의 당첨번호 6개 + 보너스번호 1개를 빼서 다른 배열에 저장하기
//		같은 번호를 여러 번 빼는 것은 불가능
		
		Random rand = new Random();
		int[] arr1 = new int[45];
		
		for(int i = 1; i <= arr1.length; i++) {
			arr1[i] = i;
		}
		
		int[] arr2 = new int[7];
		
		
	}
}
