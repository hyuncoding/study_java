package day06_class2;

import java.util.Date;

public class User {
	// Field
	String userId;
	String userPw;
	String userName;
	Date registerDate;
	
	// Method
	
	// 1. 필드값을 저장하는 메소드
	void setUser(String id, String pw, String name) {
		userId = id;
		userPw = pw;
		userName = name;
		registerDate = new Date();
	}
	
	// 2. 필드값을 출력하는 메소드
	void printUser() {
		System.out.println("아이디 = " + userId);
		System.out.println("비밀번호 = " + userPw);
		System.out.println("이름 = " + userName);
		System.out.println("가입일 = " + registerDate);
	}
	
}
