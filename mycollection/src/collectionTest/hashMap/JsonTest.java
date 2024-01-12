package collectionTest.hashMap;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;

public class JsonTest {
	public static void main(String[] args) {
		User user1 = new User(1, "한동석", 20, "강사");
		User user2 = new User(2, "홍길동", 20, "검객");
		User user3 = new User(3, "이순신", 20, "장수");
		User user4 = new User(4, "박세은", 20, "여신");
		User user5 = new User(5, "양현", 20, "개발자");
				
		JSONArray usersJSON = new JSONArray();
		
		ArrayList<User> users = new ArrayList<User>();
		users.add(user1);
		users.add(user2);
		users.add(user3);
		users.add(user4);
		users.add(user5);
		
		users.stream().map(user -> new JSONObject(user)).forEach(usersJSON::put);
		
		System.out.println(usersJSON.toString());
	}
}
