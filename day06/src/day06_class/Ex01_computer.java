package day06_class;

// 데이터 클래스 Computer
class Computer{
	// 값 = 변수 = 필드
	String model;
	String manufacturer;
	int price;
}

public class Ex01_computer {
	public static void main(String[] args) {
		
		// 사용자 정의 타입 : Computer
		// 객체 : myCom
		
		
		// myCom 객체 생성 방법
		Computer myCom = new Computer();	// 이 상태에서는 각 필드에는 String은 null, int는 0이 들어가 있다.
		
		// myCom 객체의 필드 사용 방법
		// 객체.필드
		myCom.model = "GRAM";
		myCom.manufacturer = "LG";
		myCom.price = 200;
		
		// 확인
		System.out.println("모델 = " + myCom.model);
		System.out.println("제조사 = " + myCom.manufacturer);
		System.out.println("가격 = " + myCom.price);
		
		
	}
}
