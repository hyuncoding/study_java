package day15_Thread;

// Maker
class Maker2{
	
	private String message;
	
	private boolean isMade = false;
	
	// Method
	public String getMessage() {
		// 메세지가 없는 상태라면 wait() 처리
		if(!isMade) {
			try{
				// 동기화 블록 처리(일부만 동기화 처리)
				synchronized (this) {
					wait();
				} 
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		return message;
	}
	
	public synchronized void setMessage(String message) {		// 메세지 저장의 안전한 완성은 setMessage() 메소드가 끝날 때까지 터치하지 않는 것이다. : synchronized
		this.message = message;
		this.isMade = true;
		notify();
	}
}

// Sender
class Sender2 extends Thread{
	
	// Field
	private Maker2 maker;
	
	// Constructor
	public Sender2(Maker2 maker) { this.maker = maker; }

	// Method
	@Override
	public void run() {
		try {
			sleep(1000);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		maker.setMessage("보고싶다");
		System.out.println("전송완료");
	}
}

// Reader
class Reader2 extends Thread{
	// Field
	private Maker2 maker;
	
	// Constructor
	public Reader2(Maker2 maker) { this.maker = maker; }

	// Method
	@Override
	public void run() {
		System.out.println(maker.getMessage());
		System.out.println("수신완료");
	}
}

public class Ex11_synchronized {
	public static void main(String[] args) {
		
		Maker2 maker = new Maker2();
		
		Sender2 sender = new Sender2(maker);
		Reader2 reader = new Reader2(maker);
		
		sender.start();
		reader.start();
		
	}
}
