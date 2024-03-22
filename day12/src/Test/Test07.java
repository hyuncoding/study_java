package Test;

class Coordinate{
	// Field
	private int x;
	private int y;
	
	// Constructor
	public Coordinate(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// Method
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(obj instanceof Coordinate) {
			Coordinate coObj = (Coordinate)obj;
			if(x == coObj.x && y == coObj.y) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "중심좌표 [" + x + ", " + y + "], ";
	}
}

class Circle{
	// Field
	private Coordinate center;
	private double radius;
	
	// Constructor
	public Circle(int x, int y, double radius) {
		this.center = new Coordinate(x, y);
		this.radius = radius;
	}
	
	public Circle(Coordinate center, double radius) {
		this.center = center;
		this.radius = radius;
	}

	@Override
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if(obj instanceof Circle) {
		    Circle circObj = (Circle)obj;
		    if(center.equals(circObj.center) && radius == circObj.radius) return true;
		    else return false;
		}
		return false;
	}

	@Override
	public String toString() {
	    return center.toString() + "반지름 : " + radius;
	}
}

public class Test07 {
//	Test07.java
//	Coordinate 클래스	필드 : int x, y
//						메소드 : Constructor, toString(), equals()
//	Circle 클래스		필드 : Coordinate center, double radius
//						메소드 : Constructor, toString(), equals()
//
//	toString() : 중심좌표 [0, 0], 반지름 : 1.5
//	equals() : 중심좌표와 반지름이 모두 같으면 true, 아니면 false
	public static void main(String[] args) {
		Circle circle1 = new Circle(new Coordinate(2, 3), 1.5);
		Circle circle2 = new Circle(2, 3, 1.5);
		Circle circle3 = new Circle(new Coordinate(3, 2), 1.5);
		Circle circle4 = new Circle(2, 3, 1.8);
		
		System.out.println(circle1.toString());
		System.out.println(circle2.toString());
		System.out.println(circle1.equals(circle2) ? "같은 원입니다" : "다른 원입니다");
		System.out.println(circle3.toString());
		System.out.println(circle4.toString());
		System.out.println(circle1.equals(circle3) ? "같은 원입니다" : "다른 원입니다");
		System.out.println(circle2.equals(circle4) ? "같은 원입니다" : "다른 원입니다");
		
		
	}
	
}
