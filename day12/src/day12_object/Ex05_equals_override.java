package day12_object;

class Rect{
	
	private int width;
	private int height;
	
	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
	}

	// 동등 비교 조건
	// 1. 너비 == 너비 and 높이 == 높이
	// 2. 너비 == 높이 and 높이 == 너비
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {	// 두 객체의 주소가 같다.
			return true;
		}
		if(obj instanceof Rect) {
			Rect recObj = (Rect) obj;
			if(width == recObj.width && height == recObj.height) {
				return true;
			} else if(width == recObj.height && height == recObj.width) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}

	@Override
	public String toString() {
	    String message = "가로 : " + width + ", 세로 : " + height;
		return message;
	}
}

public class Ex05_equals_override {
	public static void main(String[] args) {
		
		Rect nemo1 = new Rect(2, 3);
		Rect nemo2 = new Rect(3, 2);
		
		System.out.println(nemo1);
		System.out.println(nemo2);
		
		if(nemo1.equals(nemo2)) {
			System.out.println("같은 모양의 사각형이다.");
		} else {
			System.out.println("다른 모양의 사각형이다.");
		}
	}
}
