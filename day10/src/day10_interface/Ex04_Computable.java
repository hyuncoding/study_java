package day10_interface;

// 작업지시서
interface Computable{
	void playApp();
	void connectInternet();
}

// 부모(슈퍼)
class Phone{
	// Field
	private String owner;
	
	// Constructor
	public Phone(String owner) {
		this.owner = owner;
	}
	
	// Method
	public void sendCall() { System.out.println(owner + "의 전화 걸기"); }
	public void receiveCall() { System.out.println(owner + "의 전화 받기"); }	
}

// 상속과 구현을 동시에 진행
// 상속 먼저, 구현 나중

// 자식 + 구현 클래스
class SmartPhone extends Phone implements Computable{
	// Constructor
	public SmartPhone(String owner) { super(owner); }

	// Method
	@Override
	public void playApp() {
		System.out.println("앱 실행");
	}

	@Override
	public void connectInternet() {
		System.out.println("인터넷 접속");
	}
}

public class Ex04_Computable {
	public static void main(String[] args) {
		
		// 1. Phone 타입
		Phone phone1 = new SmartPhone("홍길동");
		phone1.sendCall();
		phone1.receiveCall();
		((Computable)phone1).playApp();
		((Computable)phone1).connectInternet();
		
		// 2. Computable 타입
		Computable phone2 = new SmartPhone("김길동");
		phone2.playApp();
		phone2.connectInternet();
		((Phone)phone2).sendCall();
		((Phone)phone2).receiveCall();
		
		// 3. SmartPhone 타입
		SmartPhone phone3 = new SmartPhone("나길동");
		phone3.sendCall();
		phone3.receiveCall();
		phone3.playApp();
		phone3.connectInternet();
	}
}
