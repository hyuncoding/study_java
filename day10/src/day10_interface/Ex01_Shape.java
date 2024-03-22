package day10_interface;

// 인터페이스 (작업지시서)
interface Shape{
	// Method
	double calcArea();		// 인터페이스는 자동으로 public abstract double calcArea(); 처리된다.
	String getName();		// 인터페이스는 자동으로 public abstract String getName(); 처리된다.
}

// 구현 클래스 - 1 (작업지시서를 보고 만든 클래스)
class Rect implements Shape{
	// Field
	private int width;
	private int height;
	
	// Constructor
	public Rect(int width, int height) {
		super();				// Shape의 디폴트 생성자
		this.width = width;
		this.height = height;
	}

	// Method
	@Override
	public double calcArea() {
		return width * height;
	}

	@Override
	public String getName() {
		return "사각형";
	}
}

// 구현 클래스 - 2
class Circle implements Shape{
	// Field
	private double radius;

	// Constructor
	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	// Method
	@Override
	public double calcArea() {
		return Math.PI * Math.pow(radius, 2);
	}

	@Override
	public String getName() {
		return "원";
	}
}

// 구현 클래스 - 3
class Triangle implements Shape{
	// Field
	private int width;
	private int height;
	
	// Constructor
	public Triangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	// Method
	@Override
	public double calcArea() {
		return width * height / 2.0;
	}

	@Override
	public String getName() {
		return "삼각형";
	}
}

public class Ex01_Shape {
	public static void main(String[] args) {
		// Rect, Circle, Triangle 을 모두 저장할 수 있는 타입은 Shape이다.
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
