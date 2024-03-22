package day13_generic;

public class Ex05_generic_method {
	
	// 정수 타입 / 실수 타입의 배열을 파라미터로 받아서
	// 해당 배열의 모든 숫자의 합을 구해서 리턴하는 메소드
	
	// Integer 와 Double 의 부모 타입 Number 클래스가 있다.
	// Number 타입은 Integer, Double의 저장용으로 사용할 수 있다.
	
	public static <T extends Number> double getArrayTotal(T[] arr) {
		
		// <T> : 모든 타입이 가능
		// <T extends Number> : Number 타입만 가능
		
		double total = 0;
		for(int i = 0; i < arr.length; i++) {
			total += arr[i].doubleValue();
		}
		return total;
	}
	
	public static void main(String[] args) {
		
		// String 배열
		// <T extends Number> 에 의해 Number 클래스의 자식 클래스만 전달할 수 있기 때문이다.
		// String[] a = {"가위", "바위", "보"};
		// getArrayTotal(a);	// 오류남
		
		
		// Integer 배열
		Integer[] arr1 = {1, 2, 3, 4, 5};
		double total1 = getArrayTotal(arr1);
		System.out.println("arr1의 합 : " + total1);
		
		// Double 배열
		Double[] arr2 = {1.2, 2.1};
		double total2 = getArrayTotal(arr2);
		System.out.println("arr2의 합 : " + total2);
		
		
		
	}
}
