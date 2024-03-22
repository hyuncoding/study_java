package day15_Thread;

// Cleaner
class Cleaner{
	
	// synchronized
	// 임계 영역 : Critical Section
	// 공유 리소스(Cleaner)를 다루는 영역 중에서 한번에 한 스레드만 접근해야 하는 영역
	// 동기화 메소드(동기화 블록)로 처리한다.
	// 동기화 처리 : 한 스레드가 사용하는 중에는 다른 스레드의 접근을 막는 처리
	// 메소드 앞에 synchronized 추가
	
	public synchronized void diningRoomCleaning() {
		try {
			System.out.println("다이닝룸 청소 중...");
			Thread.sleep(1000);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("다이닝룸 청소 완료!");
		notify();
		try {
			System.out.println("거실 청소 완료까지 기다리겠다.");
			wait();
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public synchronized void livingRoomCleaning() {
		try {
			System.out.println("거실 청소 중...");
			Thread.sleep(1000);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("거실 청소 완료!");
		notify();
		try {
			System.out.println("다이닝룸 청소 완료까지 기다리겠다.");
			wait();
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class Papa extends Thread{
	private Cleaner cleaner;
	
	public void setCleaner(Cleaner cleaner) { this.cleaner = cleaner; }

	@Override
	public void run() {
		for(int i = 0; i < 5; i++) {
			cleaner.livingRoomCleaning();
		}
	}
}

class Mama extends Thread{
	private Cleaner cleaner;
	
	public void setCleaner(Cleaner cleaner) { this.cleaner = cleaner; }

	@Override
	public void run() {
		for(int i = 0; i < 5; i++) {
			cleaner.diningRoomCleaning();
		}
	}
}

public class Ex09_synchronized {
	public static void main(String[] args) {
		
		Cleaner cleaner = new Cleaner();
		
		Papa papa = new Papa();		// papa : 스레드
		Mama mama = new Mama();		// mama : 스레드
		
		papa.setCleaner(cleaner);
		mama.setCleaner(cleaner);
		
		papa.start();
		mama.start();
		
	}
}
