package arrayTest;

public class ArTest1 {
	public static void main(String[] args) {
		int[] arData = {1, 3, 2, 6, 8};
//		System.out.println(arData);
//		System.out.println(arData.length);
		
		for (int i = 0; i < arData.length; i++) {
			System.out.println(arData[i]);
		}
		
//		arData에 5, 4, 3, 2, 1을 순서대로 담은 후 출력
		int[] arData1 = new int[5];
		for (int i = 0; i < arData1.length; i++) {
			arData1[i] = 5 - i;
		}
		
		for (int i = 0; i < arData1.length; i++) {
			System.out.println(arData1[i]);
		}
	}
}
