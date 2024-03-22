package day06_Constructor;

// Computer
class Computer{
	
	// Field
	String model;
	String manufacturer;
	int price;
	
	// Constructor
	Computer(String _model, String _manufacturer, int _price){	// 필드 값으로 전달
		System.out.println("Computer 객체가 생성되었다.");
		model = _model;
		manufacturer = _manufacturer;
		price = _price;
	}
	
	// Method
	void printComputer() {
		System.out.println("모델 = " + model);
		System.out.println("제조사 = " + manufacturer);
		System.out.println("가격 = " + price);
	}

}

public class Ex01_Computer {
	public static void main(String[] args) {
		
		// Computer 클래스를 이용한 myCom 객체 생성
		Computer myCom = new Computer("GRAM", "LG", 200);
		myCom.printComputer();
		
	}
}
