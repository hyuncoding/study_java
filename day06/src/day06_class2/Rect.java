package day06_class2;

public class Rect {
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
	
	// 메소드 오버로딩 : 같은 이름의 메소드가 2개 이상 (매개변수가 다름)
	void setRect(int n) {
		width = n;
		height = n;
		isSquare = true;
	}
	
	int calcArea() { return width * height;	}
	
    void printRect() {
    	System.out.println("너비 = " + width);
    	System.out.println("높이 = " + height);
    	System.out.println("크기 = " + calcArea());
    	System.out.println(isSquare ? "정사각형" : "직사각형");
    }
	
}
