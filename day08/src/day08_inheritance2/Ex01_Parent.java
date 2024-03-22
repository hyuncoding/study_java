package day08_inheritance2;

// super
class Parent{
	
	// Field
	String parentName;
	
	// Constructor
	Parent(){ parentName = "알 수 없음"; }
	
	Parent(String parentName){ this.parentName = parentName; }
	
	// Method
	void printParent() { System.out.println("부모 : " + parentName); }
}

// sub
class Child extends Parent{
	
	// Field
	String childName;
	
	// Constructor
	Child(String childName){
		super();		// Parent(){ this.parentName = "알 수 없음"; }
		this.childName = childName;
	}
	
	Child(String childName, String parentName){
		super(parentName);	// Parent(String parentname){ this.parentName = parentName; }
		this.childName = childName;
	}
	
	// Method
	void printChild() {
		printParent();
		// super.printParent(); 해도 됨(지금은 굳이 필요 없음)
		System.out.println("자식 이름 : " + childName);
	}
}

public class Ex01_Parent {
	public static void main(String[] args) {
		
		Child child1 = new Child("홍길동");
		Child child2 = new Child("제임스", "스미스");
		
		child1.printChild();
		child2.printChild();
		
	}
}
