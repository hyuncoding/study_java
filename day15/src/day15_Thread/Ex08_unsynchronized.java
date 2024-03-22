package day15_Thread;

class USB{
	// Field
	private int memorySize;
	
	// Constructor
	public USB(int memorySize) { this.memorySize = memorySize; }
	
	// Method
	public int getMemory() { return memorySize; }
	public void setMemory(int memorySize) {
		try {
			Thread.sleep(3000);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		this.memorySize = memorySize;
		System.out.println(Thread.currentThread().getName() + ", memorySize = " + this.memorySize);
	}
}

class Computer1 extends Thread{
	private USB usb;
	
	public void plugUSB(USB usb) {
		this.usb = usb;
	}

	@Override
	public void run() {
		usb.setMemory(10);
	}
}

class Computer2 extends Thread{
	private USB usb;
	
	public void plugUSB(USB usb) {
		this.usb = usb;
	}

	@Override
	public void run() {
		usb.setMemory(20);
	}
}

public class Ex08_unsynchronized {
	public static void main(String[] args) {
		
		USB usb = new USB(1);
		
		Computer1 com1 = new Computer1();
		com1.plugUSB(usb);
		com1.start();
		
		// com1 이 사용하는 usb는 com1이 메모리를 점유하고 있다.
		// com2 가 접근할 수 없는 상황이다.
		
		Computer2 com2 = new Computer2();
		com2.plugUSB(usb);
		com2.start();
		
		
	}
}
