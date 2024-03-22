package day06_class;

// 한 자바파일에 클래스가 두 개 이상인 경우
// 자바파일의 이름과 같은 이름의 클래스가 public 처리된다.


// 데이터 클래스 Person
class Person{
	// Field
	char gender;
	int age;
	double height;
	String name;
	boolean isAdult;
}

// 메인 클래스
public class Ex03_Person {
	public static void main(String[] args) {
		
		Person p = new Person();
		
		System.out.println("성별 = " + p.gender);			// '\0' (널 문자 : 보이지 않는다.)
		System.out.println("나이 = " + p.age);			// 0
		System.out.println("키 = " + p.height);			// 0.0
		System.out.println("이름 = " + p.name);			// null
		System.out.println("성인여부 = " + p.isAdult);		// false
		
		
	}
}
