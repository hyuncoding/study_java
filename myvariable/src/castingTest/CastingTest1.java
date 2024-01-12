package castingTest;

public class CastingTest1 {
	public static void main(String[] args) {
		double number1 = 8.43, number2 = 2.59;
//		초기값
//		정수: 0
//		실수: 0.0
//		문자: ' '
//		문자열: null, ""
		int result = 0;
		
//		자동 형변환
		System.out.println(5 / 2);
		System.out.println(5 / 2.0);
		
//		강제 형변환
		System.out.println(5 / (double)2);
		System.out.println((int)8.43 + 2.59);
		System.out.println((int)(8.43 + 2.59));
		
//		8.43 + 2.59 = 10
		result = (int)number1 + (int)number2;
		System.out.println(result);
	}
}
