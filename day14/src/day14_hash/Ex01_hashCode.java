package day14_hash;

class Person{
	private String name;
	public Person(String name) { this.name = name; }
}

public class Ex01_hashCode {
	public static void main(String[] args) {
		
		Person p = new Person("길동");
		
		System.out.println("객체 p의 출력 : " + p);
		System.out.printf("객체 p의 참조(주소) : %x \n", p.hashCode());		// 객체 주소값
		
		Person q = new Person("길동");
		
		System.out.println("객체 q의 출력 : " + q);
		System.out.printf("객체 q의 참조(주소) : %x \n", q.hashCode());		// 객체 주소값
		
		// 자바 입장 : 객체 p, q는 다른 객체이다. (다른 곳에서 저장되어 있으므로)
		// Set에 객체 p, q가 모두 저장될 수 있다.
		
		// 사용자 입장 : 객체 p, q는 같은 객체이다. (이름이 같으니까)
		// Set에 객체 p, q가 중복 저장되지 않기를 기대한다.
		
	}
}
