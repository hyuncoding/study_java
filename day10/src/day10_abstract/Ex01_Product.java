package day10_abstract;

abstract class Product{				// 2. 추상 클래스가 된다.
	// Method
	abstract public void info();	// 1. 본문이 없는 추상 메소드를 추가하면
}

// 자식 - 1
class Computer extends Product{

	@Override
	public void info() {
		System.out.println("Computer");
	}
}

// 자식 - 2
class TV extends Product{

	@Override
	public void info() {
		System.out.println("TV");
	}
}


public class Ex01_Product {
	public static void main(String[] args) {
		// 여기는 매장이다.
		// Computer 10대, TV 5대
		Computer[] computers = new Computer[10];
		TV[] tvs = new TV[5];
		
		// 만약 100개의 제품을 관리하기 위해서 100개의 배열을 관리하는 것은 "어렵다."
		
		// 해결책으로 "업캐스팅"을 활용한다.
		// 부모(Product) 타입은 자식(Computer, TV)를 저장할 수 있다. (자동 타입 변환)
		Product[] products = new Product[15];
		
		products[0] = new Computer();	// 업캐스팅
		products[1] = new TV();			// 업캐스팅
//		products[2] = new Product();	// 추상 클래스는 객체 생성을 할 수 없다.
		
		for(Product product : products) {
			if(product != null) product.info(); // 같은 코드 + 다른 동작 (다형성)
		}
	}
}
