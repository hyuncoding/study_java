package day08_inheritance;

// super
class Espresso{
	
	// Field
	String beanOrigin;
	int water;
	
	// Constructor
	Espresso(String beanOrigin, int water){
		this.beanOrigin = beanOrigin;
		this.water = water;
	}
	
	// Method
	void taste() { System.out.println("쓰다."); }
}

// sub
class Latte extends Espresso{
	
	// Field
	int milk;
	
	// Constructor
	Latte(int milk, String beanOrigin, int water){
		super(beanOrigin, water);
		this.milk = milk;
	}
	
	// Method
	
	// 오버라이드 하는 메소드는 @Override 에너테이션을 붙이는 것이 좋다.
	
	@Override
	void taste() { System.out.println("부드럽다."); }
}

public class Ex06_method_override {
	public static void main(String[] args) {
		
		Latte latte = new Latte(200, "브라질 세하도", 50);
		
		latte.taste();
		
	}
}
