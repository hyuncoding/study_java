package Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//Test03.java
//Set을 이용하여 로또 발생기를 구현하시오.
//당첨 번호 6개만 구현하시오.

public class Test03_ans {
	public static void main(String[] args) {
		
		// 1 ~ 45 사이 난수를 발생시켜 Set에 저장한다.
		// 몇 번 돌릴지 결정은 Set의 size()를 확인해서 처리한다.
		
		Set<Integer> set = new HashSet<>();
		
		while(true) {
			set.add((int)(Math.random() * 45) + 1);
			if(set.size() == 6) break;
		}
		
		System.out.println(set);
		
		// 번외
		int[] lotto = new int[6];
		int i = 0;
		Iterator<Integer> itr = set.iterator();
		while(itr.hasNext()) {
			lotto[i] = itr.next();
			i++;
		}
		
		System.out.println(Arrays.toString(lotto));
	}
}
