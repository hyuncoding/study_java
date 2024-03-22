package Test;

import java.util.ArrayList;
import java.util.List;

//Test02.java
//Container 제네릭 클래스를 정의하시오.
//한 가지 타입의 객체를 여러 개 저장할 수 있는 ArrayList 를 이용하시오.

class Container<T> {
	
	private List<T> list;
	
	public Container() { list = new ArrayList<T>(); }
	
	public void add(T item) { list.add(item); }
	
	public T get(int index) { return list.get(index); }
	
	public int size() { return list.size(); }
	
	public T remove(int index) { return list.remove(index); }
	
}

class Gun{
	
	private String model;
	
	private int tang;
	
	public Gun(String model, int tang) {
		this.model = model;
		this.tang = tang;
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append(model + "(" + tang + "발)" + "\t");
		return sb.toString();
	}
}

public class Test02 {
	public static void main(String[] args) {
		
		Container<Gun> gunLocker = new Container<>();
		
		gunLocker.add(new Gun("베레타", 6));
		gunLocker.add(new Gun("콜트", 6));
		gunLocker.add(new Gun("K2", 15));
		
	    gunLocker.remove(1);
	    
	    for(int i = 0; i < gunLocker.size(); i++) {
	    	System.out.println(gunLocker.get(i));
	    }
		
	}
}
