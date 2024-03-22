package day10_access_modifier;

public class Parent {
	// Field
	private String wallet;		// 클래스 Parent 내부에서만 접근이 가능하다.
	String album;				// default 접근권한 : 패키지 day10_access_modifier 내부에서는 접근이 가능하다.
	protected String cosmetic;	// protected 접근권한 : 같은 패키지 내부 + 다른 패키지에 있는 자식 클래스
	public String name;			// 누구나 접근 가능
}