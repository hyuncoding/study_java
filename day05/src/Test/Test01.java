package Test;

public class Test01 {
	public static void main(String[] args) {
		
		String[] friends = {"왕우영", "명성호", "김동욱", "윤동혁"};
		
		int randomIdx = (int)(Math.random()*4);
		
		System.out.println("술래는 " + friends[randomIdx] + "입니다!");
		
		
	}
}
