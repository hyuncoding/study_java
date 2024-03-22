package day10_abstract;

// super
abstract class Shape{
	// Method
	abstract public double calcArea();
	abstract public String getName();
}

// sub - 1
class Rect extends Shape{
	// Field
	private int width;
	private int height;

	// Constructor
	public Rect(int width, int height) {
		super();			// Shape의 디폴트 생성자
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

// sub - 2
class Circle extends Shape{
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

// sub - 3
class Triangle extends Shape{
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


public class Ex02_Shape {
	public static void main(String[] args) {
		
		// Rect, Circle, Triangle을 모두 저장할 수 있는 타입은 Shape이다.
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
