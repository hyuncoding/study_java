package day07_this;

class Circle{
	// Field
	int xPos;
	int yPos;
	double radius;
	
	// Constructor
	Circle(){
		this(0, 0, 1);
	}
	Circle(double radius){
		this(0, 0, radius);
	}
	Circle(int xPos, int yPos, double radius){
		this.xPos = xPos;
		this.yPos = yPos;
		this.radius = radius;
	}
	
	// Method
	double calcArea() { return Math.PI * Math.pow(radius, 2); }
	
	void printCircle() {
		System.out.println("중심좌표 [" + xPos + ", " + yPos + "]");
		System.out.println("반지름 : " + radius);
		System.out.println("크기 : " + calcArea());
		System.out.println("------------------");
	}
	
}


public class Ex03_Circle {
	public static void main(String[] args) {
		
		Circle circle1 = new Circle();
		Circle circle2 = new Circle(1.5);
		Circle circle3 = new Circle(2, 3, 1.5);
		
		circle1.printCircle();
		circle2.printCircle();
		circle3.printCircle();
		
	}
}
