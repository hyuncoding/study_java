package classTest;

class A {
	int data;
	
	public A(int data) {
		this.data = data;
	}
	
	public A() {};
	
	void printData() {
		System.out.println(this);
		System.out.println(this.data);
	}
}

public class ClassTest {
	public static void main(String[] args) {
//		°´Ã¼È­
		A a = new A();
		A b = new A();
		
		System.out.println(a);
		System.out.println(b);
//		
//		a.data = 10;
//		
//		a.printData();
//		b.printData();
	}
}
