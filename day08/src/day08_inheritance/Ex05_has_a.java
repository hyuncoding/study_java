package day08_inheritance;

// super
class Coordinate{
	
	// Field
	int xPos;
	int yPos;
	
	// Constructor
	Coordinate(int xPos, int yPos){
		this.xPos = xPos;
		this.yPos = yPos;
	}
	
	// Method
	void printCoordinate() { System.out.println("좌표 [" + xPos + ", " + yPos + "]"); }
}

// sub
class Circle extends Coordinate{
	
	// Field
	double radius;
	
	// Constructor
	Circle(double radius, int xPos, int yPos){
		super(xPos, yPos);
		this.radius = radius;
	}
	
	// Method
	double calcArea() { return Math.PI * Math.pow(radius, 2); }
	
	void printCircle() {
		printCoordinate();	// super.printCoordinate(); 라고 해도 됨.
		System.out.println("반지름 : " + radius + ", 크기 : " + calcArea());
	}
}
public class Ex05_has_a {
	public static void main(String[] args) {
		
		Circle circle = new Circle(1.5, 2, 3);
		circle.printCircle();
	}
}
