package day08_object_array;

class Person{
	// Field
	String name;
	int age;
	
	// Constructor
	Person(String name, int age){
		this.name = name;
		this.age = age;
		
		System.out.println("Person(String name, int age) 생성자가 호출");
	}
	
	// Method
	void printPerson() {
		System.out.println("이름 : " + name + ", " + age + "살");
	}
}

public class Ex01_Person {
	public static void main(String[] args) {
		
		Person[] people = new Person[3];
		
		// 아래와 같은 작업을 통해서 3개의 Person 을 생성한다.
		// people[0] = new Person("제임스", 20);
		// people[1] = new Person("엘리스", 25);
		// people[2] = new Person("데이빗", 30);
		String[] name = {"제임스", "엘리스", "데이빗"};
		int[] age = {20, 25, 30};
		
		// 1. 입력 (저장)
		for(int i = 0; i < people.length; i++) {
			people[i] = new Person(name[i], age[i]);
		}
		
		
		// 2. 출력
		for(int i = 0; i < people.length; i++) {
			people[i].printPerson();
		}
		
	}
}
