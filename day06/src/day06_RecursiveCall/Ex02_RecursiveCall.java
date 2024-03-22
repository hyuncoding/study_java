package day06_RecursiveCall;

public class Ex02_RecursiveCall {

	static void recursive(int cnt) {
		if(cnt == 0) {
			return;
		} else {
			System.out.println(cnt + "번째 recursive()가 호출되었다.");
			recursive(cnt-1);
		}
	}
	
	public static void main(String[] args) {
		
		recursive(10);		// 10번 반복하고 종료
		
	}
}
