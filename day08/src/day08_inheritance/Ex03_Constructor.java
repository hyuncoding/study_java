package day08_inheritance;

// super
class Father{
	// Constructor
	Father(){ System.out.println("아빠가 태어났다."); }
}

// sub
class Son extends Father{
	// Constructor
	Son(){ 
		// Father() 생성자의 호출이 "자동"으로 "먼저" 진행된다.
		
		// Father() 생성자를 수동으로 호출
		// Father();	틀린방법
		
		// super();		: 부모클래스를 의미
		// 1. super.멤버	: super.필드, super.메소드()
		// 2. super()   : 부모클래스의 생성자 호출
		
		super();	// 생략가능
		System.out.println("아들이 태어났다."); 
	}
}

// 자식클래스의 생성자(Constructor)는 부모클래스의 생성자를 먼저 호출한다.
// 자식이 만들어지려면 반드시 부모가 먼저 만들어져야 한다.

public class Ex03_Constructor {
	public static void main(String[] args) {
		
		Son son = new Son();
		
	}
}
