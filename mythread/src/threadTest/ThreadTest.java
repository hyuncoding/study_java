package threadTest;

public class ThreadTest {
	public static void main(String[] args) {
		
		Thread2 target1 = new Thread2();
		Thread2 target2 = new Thread2();
		
		Thread thread1 = new Thread(target1, "♥");
		Thread thread2 = new Thread(target2, "★");
		
		thread1.start();
		thread2.start();
		
//		여기에 작성하면 main 쓰레드는 join()보다 먼저 start()된다.
//		System.out.println("메인 쓰레드 종료");
		
		try {
//			먼저 하고 싶은 쓰레드에 사용하고, 나머지는 모두 wait 상태
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {;}
		
//		만약 join()보다 먼저 start()를 하면, join()은 무시된다.
//		메인 쓰레드는 코드 한 줄 작성하는 순간 start() 발동
		System.out.println("메인 쓰레드 종료");
		
//		Thread1 thread1 = new Thread1("?");
//		Thread1 thread2 = new Thread1("!");
//		
//		thread1.start();
//		thread2.start();
		
//		thread1.run();
//		thread2.run();
	}
}
