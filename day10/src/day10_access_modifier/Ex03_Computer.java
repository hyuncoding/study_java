package day10_access_modifier;

class Computer{
	
	// Field (private 처리)
	private String model;
	private int price;
	
	// Constructor (public 처리)
	public Computer(String model, int price) {
		this.model = model;
		this.price = price;
	}
	
	// Method (public 처리)
	public void printComputer() {
		System.out.println("모델 : " + model);
		System.out.println("가격 : " + price);
	}
}

public class Ex03_Computer {
	public static void main(String[] args) {
		
		// Computer 클래스 외부이기 때문에 
		// private 필드는 접근이 불가능하고, public 메소드(생성자 포함)만 접근이 가능하다.
		
		Computer myCom = new Computer("GRAM", 200);
		myCom.printComputer();
		
		// private 필드 직접 접근은 제한된다.
//		myCom.model = "SENS";
//		myCom.price = 300;
	}
}
