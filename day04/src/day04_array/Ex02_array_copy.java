package day04_array;

public class Ex02_array_copy {
	public static void main(String[] args) {
		
		/*
		 *  배열의 길이
		 *   1. 배열의 길이는 length 필드 값을 확인한다.
		 *   2. 배열 선언 시 배열의 길이는 변수로 처리할 수 있다.
		 *   3. 한 번 생성된 배열의 길이는 변경할 수 없다.
		 *   	-> 기존 배열의 크기를 변경할 수 없다.
		 *   4. 기존 배열의 크기를 늘리려면 큰 배열을 새로 만들고, 기존 배열을 복사한다.
		 */
		
		int[] arr = {10, 20, 30, 40, 50};
		int[] tmp = new int[arr.length * 2];
		
		System.out.println("변경 전 arr의 길이 = " + arr.length);
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		// 1. arr -> tmp 복사
		for(int i = 0; i < arr.length; i++) {
			tmp[i] = arr[i];
		}
		
		// 2. tmp의 정보를 arr이 가져가야 함(주소 정보)! 인덱스 없이 배열 이름을 쓰면 메모리주소값을 사용한다.
		arr = tmp;		// tmp의 주소값을 arr이 가져감. 기존의 arr주소에 있는 값은 메모리 누수(gc 스스로 처리)
		
		System.out.println("변경 후 arr의 길이 = " + arr.length);
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
