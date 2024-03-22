package day15_Thread;

// SumThread()
class SumThread extends Thread{
	
	private int sum;
	private int startNum;
	private int stopNum;
	
	public SumThread(String name, int startNum, int stopNum) {
		setName(name);
		this.startNum = startNum;
		this.stopNum = stopNum;
	}
	
	public int getSum() {
		return sum;
	}
	
	public void addNum(int n) {
		sum += n;
	}

	@Override
	public void run() {
		for(int i = startNum; i < stopNum + 1; i++) {
			try {
				sleep(1000);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
			addNum(i);
		}
	}
}

public class Ex06_join {
	public static void main(String[] args) {
		
		SumThread adder1 = new SumThread("adder1", 1, 10);		// sum : 55
		SumThread adder2 = new SumThread("adder2", 11, 100);	// sum : 4995
		
		adder1.start();
		adder2.start();
		
		// adder1이 종료될 때까지 adder2에게 기다리라 하면 된다.
		// main도 adder2가 종료될 때까지 기다려야 한다.
		// join() : 기다려라.
		try {
			adder1.join();		// adder1 종료까지 기다리라.
			adder2.join();		// adder2 종료까지 기다리라.
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(adder1.getName() + "의 합 : " + adder1.getSum());
		System.out.println(adder2.getName() + "의 합 : " + adder2.getSum());
		
	}
}
