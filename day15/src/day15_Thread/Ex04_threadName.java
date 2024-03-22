package day15_Thread;

class ThreadA extends Thread{
	public ThreadA() { setName("스레드A"); }

	@Override
	public void run() {
		System.out.println("ThreadA의 이름 : " + getName());
	}
}

class ThreadB extends Thread{

	@Override
	public void run() {
		System.out.println("ThreadB의 이름 : " + getName());
	}
}

public class Ex04_threadName {
	public static void main(String[] args) {
		
		Thread a = new ThreadA();
		Thread b = new ThreadB();
		
		a.start();
		b.start();
		
		Thread main = Thread.currentThread();	// 현재 스레드 저장
		System.out.println("main 스레드 이름 : " + main.getName());
		
	}
}
