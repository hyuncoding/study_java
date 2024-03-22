package day08_inheritance2;

// super
class Computer{
	// Field
	String model;
	int price;
	
	// Constructor
	Computer(String model, int price){
		this.model = model;
		this.price = price;
	}
	
	// Method
	void printComputer() {
		System.out.println("모델 : " + model);
		System.out.println("가격 : " + price);
	}
}

// sub - 1 (자식)
class Laptop extends Computer{
	// Field
	int battery;
	
	// Constructor
	Laptop(int battery, String model, int price){
		super(model, price);
		this.battery = battery;
	}
	
	// Method
	@Override
	void printComputer() {
		super.printComputer();
		System.out.println("배터리 용량 : " + battery);
	}	
}

// sub - 2 (자손)
class Tablet extends Laptop{
	// Field
	String pen;
	
	// Constructor
	Tablet(String pen, int battery, String model, int price){
		super(battery, model, price);
		this.pen = pen;
	}
	
	// Method
	@Override
	void printComputer() {
		super.printComputer();
		System.out.println("펜 : " + pen);
	}
}

public class Ex04_Computer {
	public static void main(String[] args) {
		
		Tablet tablet = new Tablet("애플펜슬", 3000, "iPad Pro", 200);
		tablet.printComputer();
		
	}
}
