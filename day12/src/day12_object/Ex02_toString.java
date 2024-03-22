package day12_object;

// toString() : 객체(인스턴스)를 String으로 변환하는 메소드

// 데이터 클래스
class Person{
	// Field
	private String name;
	private int age;
	
	// Constructor
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// Method
	public void printPerson() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age + "살");
	}
}

public class Ex02_toString {
	public static void main(String[] args) {
		
		Person p = new Person("엘리스", 23);
		
		String message = p.toString();
		
		System.out.println("객체 p의 String 변환 : " + message);
		// toString()의 기본 동작 (Object클래스의 toString()에 정의된 내용)
		// day12_object.Person@6f2b958e
		// getClass().getName() @hashCode()
		
		// 지금까지의 객체 정보 확인 방법
		p.printPerson();
		
		// 앞으로 다음과 같이 객체 정보를 확인하고자 한다면,
		// 어떤 작업이 필요할까?
		
		System.out.println(p);
		// = System.out.println(p.toString());
		// StringBuffer를 String으로 변환하는 이유는 Object에 있는 equals 말고 String에 있는 equals를 사용하기 위해서.
	}
}
