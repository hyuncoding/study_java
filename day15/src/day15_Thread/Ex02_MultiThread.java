package day15_Thread;

// Gun -> Thread 되려면 Thread 클래스를 상속한다.
class Gun extends Thread{
	
	private String model;
	private int bullet;
	
	public Gun(String model, int bullet) {
		this.model = model;
		this.bullet = bullet;
	}

	@Override
	public void run() {			// 스레드 실행하는 메소드는 run()
		for(int i = 0; i < bullet; i++) {
			System.out.println(model + " : " + (i + 1) + "발 발사");
			try {
				sleep(500);		// 0.5초 동안 잠시 멈춤 (500ms)
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class Ex02_MultiThread {
	public static void main(String[] args) {
		
		Gun gun1 = new Gun("베레타", 6);
		Gun gun2 = new Gun("콜트", 10);
		
		gun1.start();		// 스레드의 시작을 요청하는 start() 메소드
		gun2.start();		// start() 메소드가 호출되면 run() 메소드가 실행된다.
		
		System.out.println("main의 종료");
		
		
	}
}
