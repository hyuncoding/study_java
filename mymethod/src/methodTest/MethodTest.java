package methodTest;

public class MethodTest {
	
//	f(x) = 2x + 1
//	단, x는 정수이다.
	int f(int x){
		return 2 * x + 1;
	}
	
//	두 정수의 덧셈 메소드
	int add(int number1, int number2) {
		return number1 + number2;
	}
	
//	메소드 사용 방법
//	1. 메소드 선언 시 static을 붙여준다.
//	2. 사용하고자 하는 메소드의 소속을 알려준다.
	public static void main(String[] args) {
		MethodTest mt = new MethodTest();
		System.out.println(mt.f(10));
		int result = mt.add(10, 20);
		System.out.println("결과값: " + result);
		
	}
}
