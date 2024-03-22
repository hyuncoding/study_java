package day14_collection_framework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex05_HashSet {
	public static void main(String[] args) {
		
		// HashSet은 중복을 막는 게 목적
		Set<String> set = new HashSet<>();
		
		// 추가 : add
		set.add("C");
		set.add("JAVA");
		set.add("DB");
		set.add("HTML");
		set.add("CSS");
		set.add("JAVASCRIPT");
		set.add("JQUERY");
		set.add("JSP");
		set.add("SPRING");
		
		set.add("JAVA");
		set.add("JSP");
		
		
		// 인덱스가 없기 때문에,
		// 반복자(Iterator)를 통해서 순회한다.
		Iterator<String> itr = set.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		// 순서대로 나오지 않음, 중복된 값은 나오지 않음.
	}
}
