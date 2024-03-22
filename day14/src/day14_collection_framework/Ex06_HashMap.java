package day14_collection_framework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ex06_HashMap {
	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		
		//  1. 추가 : put(key, value);
		// 		1) key : 중복이 불가능하다. -> key 값으로는 String 타입을 주로 사용한다.
		//		2) value : 중복이 가능하다.
		map.put("재훈", 24);
		map.put("현태", 25);
		map.put("준섭", 24);
		map.put("다윤", 26);
		map.put("동형", 24);
		map.put("건희", 23);
		map.put("건희", 22);		// 어떤 동작을 할 것이냐? 기존 key값을 찾아서 수정한다.
		
		// 2. 저장된 요소 가져오기 : get(key)
		System.out.println("건희의 나이(value) : " + map.get("건희"));
		
		// 3. 삭제 : remove(key)
		map.remove("건희");
		
		// 4. 확인 : containsKey(key)
		if(map.containsKey("동형")) {
			System.out.println("동형이가 있다.");
		}
		
		// 5. 크기 : size()
		System.out.println("map의 크기 : " + map.size());
		
		// 6. 순회
		//  1) key만 Set으로 뺀다. (keySet() 메소드)
		//  2) Set에 Iterator를 붙인다. (iterator() 메소드)
		//  3) Set 요소를 빼서 map의 key로 사용한다. (hasNext(), next(), get() 메소드)
		Set<String> set = map.keySet();
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {
			String key = itr.next();
			Integer value = map.get(key);
			System.out.println("키 : " + key + ", 값 : " + value);
		}
		System.out.println(map);
		
	}
}
