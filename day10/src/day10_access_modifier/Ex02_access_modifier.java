package day10_access_modifier;

public class Ex02_access_modifier {
	public static void main(String[] args) {
		
		Parent p = new Parent();
		
		// parent.wallet;			클래스 Parent 외부에서는 접근이 불가능하다.
		p.album = "결혼앨범";		// 같은 패키지에서는 접근이 가능하다.
		p.cosmetic = "스킨";		// 같은 패키지 + 다른 패키지(자식)는 접근이 가능
		p.name = "스미스";		// 어디서든지 접근이 가능하다.
		
	}
}
