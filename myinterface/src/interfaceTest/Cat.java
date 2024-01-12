package interfaceTest;

public class Cat implements Pet{
	@Override
	public void sitDown() {
		System.out.println("앉지 않는다.");
	}
	
	@Override
	public void waitNow() {
		System.out.println("안 기다린다.");
	}
	
	@Override
	public void poop() {
		System.out.println("말 안해도 잘 한다.");
	}
}
