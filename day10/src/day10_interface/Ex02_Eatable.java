package day10_interface;

// 인터페이스명 : ~할 수 있는
interface Eatable{
	void eat();
	void calorieInfo();
}

// 구현클래스 : 반드시 인터페이스의 모든 "추상메소드"를 오버라이드 해야 한다.
class Apple implements Eatable{

	@Override
	public void eat() {
		System.out.println("아침에 먹는 사과가 좋다.");
	}

	@Override
	public void calorieInfo() {
		System.out.println("칼로리 : 100kcal");
	}
}


public class Ex02_Eatable {
	public static void main(String[] args) {
		
		Eatable food = new Apple();		// Eatable 타입으로 모든 구현클래스를 저장할 수 있다.
		food.eat();
		food.calorieInfo();
		
	}
}
