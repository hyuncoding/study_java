package day09_polymorphism;

// super
class Product{
	// Method
	void info() { System.out.println("Product"); }	
}

// 자식 -1
class Computer extends Product{

	// Method Override : 부모의 메소드를 자식이 다시 만드는 것
	@Override
	void info() {
		System.out.println("Computer");
	}
}

// 자식 -2
class TV extends Product{

	@Override
	void info() {
		System.out.println("TV");
	}	
}

public class Ex01_Product {
	public static void main(String[] args) {
		// 여기는 매장이다.
		// Computer 10개, TV 5개
		Computer[] computers = new Computer[10];
		TV[] tvs = new TV[5];
		
		// 만약 100개 제품을 관리하기 위해서 100개의 배열을 관리하는 것은 "어렵다/효율이 낮다/귀찮다"
		
		// 해결책으로 "업캐스팅"을 활용한다.
		// 부모(Product) 타입은 자식(Computer, TV)을 저장할 수 있다. (자동 타입 변환)
		Product[] products = new Product[15];
		
		products[0] = new Computer();	// 업캐스팅
		products[1] = new TV();
		
		for(Product product : products) {
			if(product != null) product.info();	// 같은 코드 + 다른 동작 (다형성)
		}
		
	}
}
