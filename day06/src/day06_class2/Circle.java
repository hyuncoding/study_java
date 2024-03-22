package day06_class2;

public class Circle {
	// Field
	String name;
	double radius;
	
	// Method
	void setCircle(String n, double r) {
		name = n;
		radius = r;
	}
	
	double calcArea() { return Math.PI * Math.pow(radius, 2); }
	
	void printCircle() {
		System.out.println("이름 = " + name);
		System.out.println("반지름 = " + radius);
		System.out.println("크기 = " + calcArea());
	}
}
