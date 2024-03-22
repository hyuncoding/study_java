package day12_object;

class Computer{
	
	// Field
	private String model;
	private int price;
	
	// Constructor
	public Computer(String model, int price) {
		this.model = model;
		this.price = price;
	}
	
	// Method
	public void printComputer() {
		System.out.println("모델명 : " + model);
		System.out.println("가격 : " + price);
	}
}

public class Ex01_object {
	public static void main(String[] args) {
	
		// Object 타입 : 모든 객체(변수)를 저장할 수 있는 타입
		
		Object obj = new Object();
		
		// 1. 변수 저장
		obj = 10;
		System.out.println(obj);
		
		obj = 1.5;
		System.out.println(obj);
		
		// 2. 객체 저장
		Computer myCom = new Computer("Gram", 200);
		myCom.printComputer();
		
		// yourCom의 view는 Object(Object 메소드만 호출할 수 있다.) 
		Object yourCom = new Computer("SENS", 200);
		// 자식 타입인 Computer 메소드를 호출하려면,
		// 자식 타입으로 형변환(다운 캐스팅)이 필요하다.
		((Computer)yourCom).printComputer();
	}
}
