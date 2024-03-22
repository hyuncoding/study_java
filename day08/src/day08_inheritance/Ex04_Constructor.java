package day08_inheritance;

// super
class Mother{
	// Field
	String motherName;
	
	// Constructor
	Mother(String motherName){ this.motherName = motherName; }
}

// sub
class Daughter extends Mother{
	// Field
	String daughterName;
	
	// Constructor
	Daughter(String daughterName, String motherName){
		// super();			// 디폴트 호출 : 매개변수가 없는 Mother 생성자
		// super("사만다");	// 해결책 1 (하드코딩이므로 쓰지 말자)
		super(motherName);	// 해결책 2 -> 일반적
		this.daughterName = daughterName;
	}
}

public class Ex04_Constructor {
	public static void main(String[] args) {
		
		Daughter girl = new Daughter("엘리스", "사만다");
		
		System.out.println("엄마 이름 : " + girl.motherName);
		System.out.println("딸 이름 : " + girl.daughterName);
		
	}

}
