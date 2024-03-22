package day13_generic;

public class Ex04_generic_method {

	// 무엇이든 배열을 출력할 수 있는 printArray() 메소드 정의
	// [1, 2, 3, 4, 5]
	// ["가위", "바위", "보"]
	
	/*
	 *  메소드 오버로딩 (같은 이름 + 다른 매개변수)으로 해결할 수 있다.
	 *  public static void printArray(int[] arr) {}
	 *  public static void printArray(double[] arr) {}
	 *  public static void printArray(String[] arr) {}
	 *  public static void printArray(long[] arr) {}
	 *  public static void printArray(char[] arr) {}
	 *  ...
	 */
	
	// generic으로 처리하기 (제네릭 메소드)
	public static <T> void printArray(T[] arr) {
		System.out.print("[");
		for(int i = 0; i < arr.length - 1; i++) {
			System.out.print(arr[i] + ", ");
		}
		System.out.println(arr[arr.length - 1] + "]");
	}
	
	public static void main(String[] args) {
		
		// int[] arr1 = {1, 2, 3, 4};
		// generic 타입은 참조타입(reference type)만 가능하다. primitive type은 불가능하다.
		Integer[] arr1 = {1, 2, 3, 4};
		printArray(arr1);
		
		String[] arr2 = {"가위", "바위", "보"};
		printArray(arr2);
		
		Double[] arr3 = {1.5, 2.3, 3.3};
		printArray(arr3);
	}
}
