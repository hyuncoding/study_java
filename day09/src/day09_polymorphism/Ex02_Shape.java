package day09_polymorphism;

// super
class Shape{
	double calcArea() { return 0; }
	String getName() { return "도형"; }
}

// 자식 -1
class Rect extends Shape{
	// Field
	int width;
	int height;
	
	// Constructor
	Rect(int width, int height){
		super();	// Shape의 디폴트 생성자 (생략가능)
		this.width = width;
		this.height = height;
	}

	// Method
	@Override
	double calcArea() {
		return width * height;
	}

	@Override
	String getName() {
		return "사각형";
	}
}

// 자식 -2
class Circle extends Shape{
	// Field
	double radius;
	
	// Constructor
	Circle(double radius){
		super();
		this.radius = radius;
	}

	// Method
	@Override
	double calcArea() {
		return Math.PI * Math.pow(radius, 2);
	}

	@Override
	String getName() {
		return "원";
	}
}

// 자식 -3
class Triangle extends Shape{
	// Field
	int width;
	int height;
	
	// Constructor
	Triangle(int width, int height){
		super();
		this.width = width;
		this.height = height;
	}

	// Method
	@Override
	double calcArea() {
		return width * height / 2.0;
	}

	@Override
	String getName() {
		return "삼각형";
	}
}

public class Ex02_Shape {
	public static void main(String[] args) {
		
		// Rect, Circle, Triangle을 모두 저장할 수 있는 타입은 Shape 이다.
		Shape[] shapeList = new Shape[3];
		
		// 업캐스팅
		shapeList[0] = new Rect(2, 1); 
		shapeList[1] = new Circle(1.5);
		shapeList[2] = new Triangle(3, 5);
		
		// 다형성 확인
		for(Shape shape : shapeList) {
			System.out.println(shape.getName() + "의 크기 : " + shape.calcArea());
		}
		
		
	}
}
