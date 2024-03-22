package day06_class2;

public class RectMain {
	public static void main(String[] args) {
		
		Rect r1 = new Rect();
		Rect r2 = new Rect();
		
		// 메소드 오버로딩
	    r1.setRect(5, 3);
	    r2.setRect(6);
	    
	    r1.printRect();
	    System.out.println("===============");
	    r2.printRect();
		
		
	}
}
