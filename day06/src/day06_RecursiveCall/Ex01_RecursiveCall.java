package day06_RecursiveCall;

public class Ex01_RecursiveCall {
	
	// static 메소드 (클래스 메소드) 내에서는
	// static 필드와 static 메소드만 호출할 수 있다.
	
	// Field
	static int cnt = 0;	// 몇 번 호출되었는지 카운트 할 목적
	
	// Method
	static void recursive() {
		System.out.println(++cnt + "번째 recursive()가 호출되었다.");
		if(cnt == 10) {
			return;		// recursive() 메소드 종료 (return 타입이 void인 경우, return; 문은 메소드를 종료하는 문으로 사용)
		}
		recursive();	// recursive() 메소드 호출
	}
	
	public static void main(String[] args) {
		
		recursive();
		
	}
}
