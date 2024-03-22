package day14_collection_framework;

import java.util.LinkedList;
import java.util.List;

public class Ex03_LinkedList {
	public static void main(String[] args) {
		
		// ArrayList와 동일한 방식으로 사용하면 된다.
		
		List<String> list = new LinkedList<>();
		
		list.add("자바1");
		list.add("자바2");
		list.add("자바3");
		
		System.out.println("전체 list: " + list);
	
	}
}
