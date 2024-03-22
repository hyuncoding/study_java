package day13_generic;

// 무엇이든 담을 수 있는 GenericBox
class GenericBox <T> {
	// Field
	private T obj;
	
	// Method
	public T getObj() { return obj; }
	public void setObj(T obj) { this.obj = obj; }
}

// 담을 물건
class BallPen{
	
}

class Eraser{
	
}

public class Ex02_GenericBox {
	public static void main(String[] args) {
		
		// GenericBox의 생성
		// 어떤 타입을 저장할 것인지 명시해야만 한다.
		
		GenericBox<String> box = new GenericBox<>();
		
		// 생성자가 호출되는 순간 GenericBox 클래스는 T 대신 String을 사용하게 된다.
//		class GenericBox <String> {
//			// Field
//			private String obj;
//			
//			// Method
//			public String getObj() { return obj; }
//			public void setObj(String obj) { this.obj = obj; }
		
		// 정상 처리
		box.setObj("자바");
		String obj = box.getObj();
		System.out.println(obj);
		
		// 비정상 처리
//		box.setObj(10);			// 오류
//		int a = box.getObj();	// 오류
		
		// 정상 처리
		GenericBox<BallPen> penBox = new GenericBox<>();
		penBox.setObj(new BallPen());
		BallPen pen = penBox.getObj();
		System.out.println(pen);
		
		// 비정상 처리
		GenericBox<Eraser> eraserBox = new GenericBox<>();
//		eraserBox.setObj(new BallPen());	// LegacyBox에선 가능
//		BallPen pen = eraserBox.getObj();	// LegacyBox에선 가능
	}
}
