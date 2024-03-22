package day07_this;

class Computer{
	
	// Field
	String model;
	String manufacturer;
	int price;
	
	// Computer 클래스 내부에서는 Field를 아래와 같이 처리할 수 있다.
	// model == this.model 이라고 언제든지 부를 수 있다.
	
	// Constructor
	Computer(String model, String manufacturer, int price){
		this.model = model;
		this.manufacturer = manufacturer;
		this.price = price;
	}
	
	// Method
	void printComputer() {
		System.out.println("모델명 : " + model);
		System.out.println("제조사 : " + manufacturer);
		System.out.println("가격 : " + price);
	}
}

public class Ex01_Computer {
	public static void main(String[] args) {
		
		Computer myCom = new Computer("GRAM", "LG", 200);
		myCom.printComputer();
		
	}
}
