package day14_hash;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Member{
	
	private int memberIdx;		// 순번 (가입에 따라 순차적인 순번을 갖는다.)
	private String memberPw;
	private String memberName;
	
	public Member(int memberIdx, String memberPw, String memberName) {
		this.memberIdx = memberIdx;
		this.memberPw = memberPw;
		this.memberName = memberName;
	}

	// Member 객체를 hash기반의 hashSet, hashMap에 저장하려면
	// 1. hashCode() 메소드를 오버라이드 하고, (자동으로 처리)
	// 2. equals() 메소드를 오버라이드 해야 한다. (개발자가 직접)
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + memberIdx;
		result = prime * result + ((memberName == null) ? 0 : memberName.hashCode());
		result = prime * result + ((memberPw == null) ? 0 : memberPw.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if(obj instanceof Member) {
			Member memberObj = (Member)obj;
			return memberIdx == memberObj.memberIdx;
		}
		return false;
	}

	@Override
	public String toString() {
		return memberName;
	}
}

public class Ex03_HashSet {
	public static void main(String[] args) {
		
		Set<Member> pool = new HashSet<>();
		
		pool.add(new Member(1, "1234", "엘리스"));
		pool.add(new Member(2, "1234", "제임스"));
		pool.add(new Member(3, "1234", "데이빗"));
		
		pool.add(new Member(1, "1234", "엘리스"));		// 중복 저장 시도
		
		Iterator<Member> itr = pool.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());		// itr.next() -> toString() 호출
		}
		
		
	}
}
