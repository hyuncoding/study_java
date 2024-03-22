package day06_class2;

public class UserMain {
	public static void main(String[] args) {
		
		User user1 = new User();
		user1.setUser("admin", "123456", "관리자");
		user1.printUser();
		
		System.out.println("=====================");
		
		User user2 = new User();
		user2.setUser("user", "654321", "사용자");
		user2.printUser();
	}
}
