package day08_inheritance2;

// super
class Person{
	
	// Field
	String name;
	int age;
	
	// Constructor
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	// Method
	void printPerson() { System.out.println("이름 : " + name + ", 나이 : " + age + "살"); }
}

// sub - 1
class Student extends Person{
	
	// Field
	String school;
	
	// Constructor
	Student(String school, String name, int age){
		super(name, age);
		this.school = school;
	}
	
	// Method
	void printStudent() {
		printPerson();
		System.out.println("학교 : " + school);
		System.out.println("---------------------");
	}
}

// sub - 2
class Worker extends Person{
	
	// Field
	String job;
	
	// Constructor
	Worker(String job, String name, int age){
		super(name, age);
		this.job = job;
	}
	
	// Method
	void printWorker() {
		printPerson();
		System.out.println("직업 : " + job);
	}
}


public class Ex02_Person {
	public static void main(String[] args) {
		
		Student student = new Student("이대", "엘리스", 21);
		Worker worker = new Worker("변호사", "사만다", 25);
		
		student.printStudent();
		worker.printWorker();
		
	}
}
