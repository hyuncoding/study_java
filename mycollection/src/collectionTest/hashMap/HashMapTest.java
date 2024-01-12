package collectionTest.hashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

import org.json.JSONObject;

public class HashMapTest {
	public static void main(String[] args) {
		HashMap<String, Object> userMap = new HashMap<String, Object>();
		
		userMap.put("id", "hds1234");
		userMap.put("password", "1234");
		userMap.put("name", "ÇÑµ¿¼®");
		userMap.put("age", 20);
		
		JSONObject json = new JSONObject(userMap);
		System.out.println(json.toString());
		
//		System.out.println(userMap.size());
//		
//		System.out.println(userMap.get("id"));
//		
//		
//		Iterator<Entry<String, Object>> iter = userMap.entrySet().iterator();
//		
//		while(iter.hasNext()) {
//			Entry<String, Object> entry = iter.next();
//			if(entry.getKey().equals("name")) {
//				System.out.println(entry.getValue());
//			}
//		}
		
	}
}
