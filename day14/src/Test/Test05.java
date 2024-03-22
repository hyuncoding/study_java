package Test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//Test05.java
//HashMap을 이용하여 회원(Member)을 저장하시오.
//key : Member, value : 포인트점수
//동일한 회원은 저장될 수 없다.
//Member 클래스
//	필드 : int no, String name, String memberShip("VIP", "GOLD", "Silver")
//3명의 회원 정보를 저장하시오.
//중복 회원도 입력하시오.
class Member{
	private int no;
	private String name;
	private String memberShip;
	
	public Member(int no, String name, String memberShip) {
		this.no = no;
		this.name = name;
		this.memberShip = memberShip;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((memberShip == null) ? 0 : memberShip.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + no;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if(obj instanceof Member) {
			Member memberObj = (Member)obj;
			return name.equals(memberObj.name);
		}
		return false;
	}

	@Override
	public String toString() {
		return no + ", 이름 : " + name + ", 등급 : " + memberShip;
	}
}

public class Test05 {
	public static void main(String[] args) {
		
		Map<Member, Integer> member = new HashMap<>();
		member.put(new Member(1, "수빈", "VIP"), 50000);
		member.put(new Member(2, "영희", "GOLD"), 45000);
		member.put(new Member(3, "진수", "Silver"), 30000);
		member.put(new Member(4, "석훈", "Silver"), 50000);
		
		member.put(new Member(4, "석훈", "Silver"), 20000);
		
		Set<Member> set = member.keySet();
		Iterator<Member> itr = set.iterator();
		while(itr.hasNext()) {
			Member person = itr.next();
			Integer point = member.get(person);
			System.out.println(person + "(포인트 : " + point + ")");
		}

		
		
	}
}
