package day11_exception;

public class Ex08_throws {
	
	public static void divide(int a, int b) throws Exception	// 1. divide() 호출부인 main() 메소드로 Exception을 던진다.
	{
		System.out.println("몫 : " + (a / b));
		System.out.println("나머지 : " + (a % b));
	}
	
	public static void main(String[] args) throws Exception {
		
		// try 처리를 하지 않는다.
		// 다시 다른 곳으로 Exception을 던질 수 있다.
		divide(10, 0);		// 2. try 를 하거나, 다른 곳으로 Exception을 다시 던져야 한다.
		
	}
}
