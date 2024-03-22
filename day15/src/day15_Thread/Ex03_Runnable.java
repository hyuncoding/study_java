package day15_Thread;

// 더 자주 사용되는 방법

// Runnable 인터페이스 구현클래스 -> 스레드
class RunnableTask implements Runnable{
	
	// Field
	private String taskName;
	
	// Constructor
	public RunnableTask(String taskName) { this.taskName = taskName; }

	// Method
	@Override
	public void run() {
		try {
			Thread.sleep(500);	// 0.5초 (500ms) (Thread의 sleep()메소드) 
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(taskName + "실행");
	}
}

public class Ex03_Runnable {
	public static void main(String[] args) {
		
		Runnable task = new RunnableTask("작업");
		Thread threadTask = new Thread(task);
		
		threadTask.start();
		
		System.out.println("main 종료");
	}
}
