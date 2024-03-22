package Test;

import java.util.HashSet;
import java.util.Set;

//Test03.java
//Set을 이용하여 로또 발생기를 구현하시오.
//당첨 번호 6개만 구현하시오.

public class Test03 {
	public static void main(String[] args) {
		
		Set<Integer> set = new HashSet<>();
		while(true) {
			if(set.size() == 6) break;
			set.add((int)(Math.random()*45 + 1));
		}
		
		System.out.println(set.toString());
	}
}
