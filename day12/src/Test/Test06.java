package Test;

class User{
	// Field
	private String id;
	private String password;
	
	// Constructor
	public User(String id, String password) {
		this.id = id;
		this.password = password;
	}

	// Method
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(obj instanceof User) {
			User userObj = (User)obj;
			if(id.equals(userObj.id)) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		String idToPrint = id;
		if(id.length() < 3) {
			idToPrint = id;
		} else {
			for(int i = 2; i < id.length(); i++) {
				idToPrint = idToPrint.replace(idToPrint.charAt(i), '*');
			}
		}
		String pwToPrint = password;
		for(int i = 0; i < password.length(); i++) {
			pwToPrint = pwToPrint.replace(pwToPrint.charAt(i), '*');
		}
		return "아이디 : " + idToPrint + ", 비밀번호 : " + pwToPrint; 
	}
}


public class Test06 {
//	Test06.java
//	User 클래스		필드 : String id, password
//					메소드 : Constructor, toString(), equals()
//					
//	toString() : 아이디 : ad***, 비밀번호 : ****   (아이디가 "admin", 비밀번호가 "1234"인 회원인 경우)
//	equals() : 아이디가 일치하면 true, 아니면 false
	public static void main(String[] args) {
		
		User user1 = new User("admin", "1234");
		User user2 = new User("admin", "5678");
		
		if(user1.equals(user2)) {
			System.out.println("같은 유저입니다.");
		} else {
			System.out.println("다른 유저입니다.");
		}
		
		System.out.println(user1.toString());
		System.out.println(user2.toString());
	}
}
