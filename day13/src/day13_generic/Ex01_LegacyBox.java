package day13_generic;

class LegacyBox{
	
	// Field
	private Object a;
	
	// Method
	public LegacyBox(Object a) { this.a = a; }
	
	public Object getA() { return a; }
	
	public void setA(Object a) { this.a = a; }
}

// 담을 물건
class Computer{
	
}

class SmartPhone{
		
}

public class Ex01_LegacyBox {
	public static void main(String[] args) {
		
		LegacyBox box = new LegacyBox(new Computer());
		Computer myCom = (Computer) box.getA();		// getA()의 리턴타입은 Object이다. Object 타입은 적절한 형변환이 필요하다.
		System.out.println(myCom);
		
		box.setA(new SmartPhone());
		SmartPhone myPhone = (SmartPhone) box.getA();
		System.out.println(myPhone);
		
		box.setA(new Computer());
		SmartPhone yourPhone = (SmartPhone) box.getA();
		System.out.println(yourPhone);
		
		// Object를 이용해서 저장하면
		// 항상 캐스팅을 해야하는데,
		// 실수로 캐스팅을 잘못해도 "자바는 모른다.(오류가 체크되지 않는다.)" : 실행을 하고나서야 36~38 줄의 코드에서 에러가 난다.
		
	}
}
