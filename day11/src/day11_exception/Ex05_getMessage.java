package day11_exception;

public class Ex05_getMessage {
	public static void main(String[] args) {
		
		try {
			System.out.println(2 / 0);	// ArithmeticException 발생
		} catch(Exception e) {
			System.out.println("기본 예외 메시지 : " + e.getMessage());		
		}
		
		// e.getMessage() : 예외에 따라 자바가 저장하고 있는 기본 메세지
	}
}
