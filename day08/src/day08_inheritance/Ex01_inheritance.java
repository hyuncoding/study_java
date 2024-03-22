package day08_inheritance;

// 부모클래스 ( = 슈퍼클래스)
class Parent{
	
	// Field
	int parentNum;
	
	// Method
	void parentMethod() { System.out.println("parentMethod()를 호출한다."); }
	
}

// 자식클래스 ( = 서브클래스)
class Child extends Parent{
	
	// Field
	int childNum;
	
	// Method
	void childMethod() { System.out.println("childMethod()를 호출한다."); }

}	

// 자식은 부모를 확장(extends)한 클래스이므로, 
// 자식은 부모의 필드 및 메소드를 사용할 수 있다.

public class Ex01_inheritance {
	public static void main(String[] args) {
		
		// 상속 확인은 "자식클래스"를 생성 및 사용한다.
		
		Child child = new Child();
		
		// 필드 사용
		child.parentNum = 100;	// 부모클래스의 필드를 사용할 수 있다.
		child.childNum = 10;
		
		System.out.println(child.parentNum + ", " + child.childNum);
		
		// 메소드 사용
		child.parentMethod();	// 부모클래스의 메소드를 사용할 수 있다.
		child.childMethod();
	}
}
