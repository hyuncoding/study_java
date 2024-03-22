package day15_Thread;

// Maker
class Maker{
	
	private String message;
	
	public Maker(String message) {
		this.message = message;
	}
	
	public String getMessage() { return message; }
	
	public void setMessage(String message) { this.message = message; }
}

// Sender
class Sender extends Thread{
	private Maker maker;
	
	public Sender(Maker maker) { this.maker = maker; }

	@Override
	public void run() {
		try {
			sleep(1000);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		maker.setMessage("보고싶니");
		System.out.println("전송완료");
	}
}

// Reader
class Reader extends Thread{
	
	private Maker maker;
	
	public Reader(Maker maker) { this.maker = maker; }

	@Override
	public void run() {
		System.out.println(maker.getMessage());
		System.out.println("수신 완료");
	}
}

public class Ex10_unsynchronized {
	public static void main(String[] args) {
		
		Maker maker = new Maker("사랑하니");
		Sender sender = new Sender(maker);		// 먼저 실행되기를 기대
		Reader reader = new Reader(maker);		// 나중에 실행되기를 기대
		
		sender.start();
		reader.start();
		
		try {
			sender.join();
			reader.join();
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
