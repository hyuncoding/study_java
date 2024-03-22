package day06_class;

import java.util.Date;

// 데이터 클래스 User
class User{
	// Field
	String userId;
	String userPw;
	String userName;
	Date registerDate;
	
	// Method
	
	// 1. 필드 값을 저장하는 메소드
	void setUser(String id, String pw, String name) {
		userId = id;
		userPw = pw;
		userName = name;
		registerDate = new Date();
	}
	
	void printUser(){
		System.out.println("아이디 = " + userId);
		System.out.println("비밀번호 = " + userPw);
		System.out.println("이름 = " + userName);
		System.out.println("가입일 = " + registerDate);
	}
	
	
}



public class Ex04_User {
	public static void main(String[] args) {
		
		User user1 = new User();
		user1.setUser("admin", "123456", "관리자");
		
//		System.out.println(user1.userId);
//		System.out.println(user1.userPw);
//		System.out.println(user1.userName);
//		System.out.println(user1.registerDate);
		
		user1.printUser();
		
		System.out.println("================================");
		
		User user2 = new User();
		user2.setUser("racoon", "654321", "김라쿤");
		user2.printUser();
		
		
		
	}
}
