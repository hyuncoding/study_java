package day06_class;

// 데이터 클래스 Rect
class Rect{
	// Field
	int width;
	int height;
	boolean isSquare;
	
	// Method
	void setRect(int w, int h) {
		width = w;
		height = h;
		isSquare = w == h;
	}
	
	void setRect(int n) {
		width = n;
		height = n;
		isSquare = true;
	}
	
	int calcArea() { return width * height; }
	
	void printRect() {
		System.out.println("너비 = " + width);
		System.out.println("높이 = " + height);
		System.out.println("크기 = " + calcArea());
		System.out.println(isSquare ? "정사각형" : "직사각형");
	}
}


public class Ex06_Rect {
	public static void main(String[] args) {
		
		Rect r1 = new Rect();
		Rect r2 = new Rect();
		
		r1.setRect(5, 3);
		r2.setRect(6);
		
		r1.printRect();
		System.out.println("===============");
		r2.printRect();
		
	}
}
