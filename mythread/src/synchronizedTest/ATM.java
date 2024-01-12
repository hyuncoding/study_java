package synchronizedTest;

public class ATM implements Runnable{
	
	int money = 10000;

	@Override
	public void run() {
		
		for (int i = 0; i < 5; i++) {
			withdraw(1000);
			try {Thread.sleep(1000);} catch (InterruptedException e) {;}
		}
	}
	
//	동기화를 사용하면, 하나의 쓰레드 작업 종료 후 다음 쓰레드가 시작된다.
//	자원 공유 시 연산을 건너뛰는 경우를 방지할 수 있다.
	public synchronized void withdraw(int money) {
//		synchronized (this) {
			this.money -= money;
			System.out.println(Thread.currentThread().getName() + "이(가)" + money + "원 출금");
			System.out.println("현재 잔액: " + this.money + "원");
//		}
	}
	
}
