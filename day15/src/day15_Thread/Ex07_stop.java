package day15_Thread;

class RunnableImpl implements Runnable{

	@Override
	public void run() {
		while(true) {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class Ex07_stop {
	public static void main(String[] args) {
		
		Runnable run = new RunnableImpl();
		
		Thread thread1 = new Thread(run, "엘리스");
		Thread thread2 = new Thread(run, "제임스");
		
		thread1.start();
		thread2.start();
		
		try {
			Thread.sleep(5000);
			thread1.stop();
			thread2.stop();
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
