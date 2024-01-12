package optionalTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

public class OptionalTest {
	
	ArrayList<User> users = new ArrayList<User>(Arrays.asList(
			new User("한동석", "hds", "1234"),
			new User("홍길동", "hgd", "2314"),
			new User("이순신", "lss", "5434"),
			new User("김세환", "ksh", "2232")
			));
	
//	제발 Optional 배웠다고 다 Optional로 감싸지 말아라!
//	반드시 리턴 타입에서만 Optional을 사용하고, 단일 객체만 감싸준다.
//	예) Optional<List<User>> : 망함.
	public Optional<User> findById(Long id) {
		User user = null;
		
		for(User userInDb : users) {
			if(userInDb.getId() == id) {
				user = userInDb;
			}
		}
		
		return Optional.ofNullable(user);
	}
	
	public static void main(String[] args) {
		OptionalTest optionalTest = new OptionalTest();
//		Optional<User> foundUser = optionalTest.findById(3000L);
//		
//		if(foundUser.isPresent()) {
//			foundUser.get();
//		}
		
//		optionalTest.findById(3000L).map(User::getUserId).ifPresent(System.out::println);
//		optionalTest.findById(3000L).map(User::getUserId)
//		.ifPresentOrElse(userId -> {
//			System.out.println(userId);
//		}, () -> {
//			System.out.println("존재하지 않는 회원입니다.");
//		});
		
//		User user = optionalTest.findById(3000L);
//		
//		if(user != null) {
//			System.out.println(user.getId());
//		} else {
//			System.out.println("존재하지 않는 회원입니다.");
//		}
	}
	
	
}
