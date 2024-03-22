package day14_hash;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// Set에 저장을 하기 위해 중복 체크하는 자바의 동작 원리
// 1. hashCode() 값을 비교하여 같으면 다음 단계로 이동, 다르면 바로 종료
// 2. equals() 결과를 통해 판단

// 개발자가 해야 할 일
// 1. 동일한 클래스로 만든 모든 객체는 같은 hashCode() 값을 가지게 만든다. (hashCode() 메소드를 오버라이드 한다.)
// 2. equals() 메소드를 오버라이드 한다.

class User{
	
	private String id;		// 중복이 없다.
	private String pw;
	
	public User(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}
	
	public String getId() { return id; }
	public void setId(String id) { this.id = id; }
	
	public String getPw() { return pw; }
	public void setPw(String pw) { this.pw = pw; }

	// 중복 체크 1단계 : 모든 User 객체의 hashCode() 통일하기
	@Override
	public int hashCode() {
		// return 1;				// 모든 User 객체는 hashCode() 값이 1이다.
		// return id.length();		// 아이디의 길이가 같은 회원은 같은 분류로 묶겠다.
		return id.charAt(0);		// 아이디의 첫 글자가 같은 회원들은 같은 분류로 묶겠다.
	}

	@Override
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if(obj instanceof User) {
		    User userObj = (User)obj;
		    return id.equals(userObj.id);
		}
		return false;
	}
}

public class Ex02_HashSet {
	public static void main(String[] args) {
		
		// 동일한 User를 2개 만들고, Set에 저장하기
		User user1 = new User("admin", "123456");
		User user2 = new User("admin", "123456");
		
		// 1. hashCode(), equals() 메소드의 오버라이드 전 상황
		
		// 개발자의 기대
		// 동일한 User 이므로 한 명만 저장되기를 기대한다.
		
		// 자바의 입장
		// 동일한 User가 아니므로 -> 다른 곳에 저장된 데이터이다. (user1 과 user2의 hashCode() 값이 다르다.)
		
		// 2. hashCode(), equals() 메소드의 오버라이드 후 상황
		
		// 자바의 입장
		// user1과 user2의 hashCode() 가 모두 1이다. (둘은 같을 수 있다.)
		// user1과 user2의 equals() 메소드 결과가 true이다. (최종 둘은 같다라고 결론)
		
		Set<User> set = new HashSet<>();
		set.add(user1);
		set.add(user2);
		
		Iterator<User> itr = set.iterator();
		while(itr.hasNext()) {
			User user = itr.next();
			System.out.println("아이디 : " + user.getId() + ", 비밀번호 : " + user.getPw());
		}
		
	}
}
