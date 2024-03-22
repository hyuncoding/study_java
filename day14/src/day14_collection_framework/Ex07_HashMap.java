package day14_collection_framework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Ex07_HashMap {
	public static void main(String[] args) {
		
		// name, age, height 정보를 입력 받아 (Scanner)
		// HashMap에 저장하고 저장된 entry(요소)들을 확인하는 코드
		
		// key		value
		// name		이름
		// age		나이
		// height	키
		
		Scanner sc = new Scanner(System.in);
		
		Map<String, Object> person = new HashMap<>();
		
		System.out.print("이름 >> ");
		person.put("name", sc.next());
		
		System.out.print("나이 >> ");
		person.put("age", sc.nextInt());
		
		System.out.print("키 >> ");
		person.put("height", sc.nextDouble());
		
		Set<String> set = person.keySet();
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {
			String key = itr.next();
			Object value = person.get(key);
			System.out.println(key + " : " + value);
			
		}
	}
}
