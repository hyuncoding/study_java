package day11_exception;

// 예외 클래스 만들기
// Exception 클래스를 상속 받아서 만든다.
class MyException extends Exception{
	// Constructor
	public MyException(String message) {
		super(message);	// Exception(String message){ } 호출 -> Throwable(String message) { } 호출
	}
}

public class Ex11_Exception_class {
	public static void main(String[] args) {
		
		try {
			// MyException 던지기
			throw new MyException("내가 만든 예외 메세지");
		} catch(Exception e) {
			System.out.println("MyException이 발생했다.");
			System.out.println("사용자 정의 예외 메세지 : " + e.getMessage());
		}
		
	}
}
