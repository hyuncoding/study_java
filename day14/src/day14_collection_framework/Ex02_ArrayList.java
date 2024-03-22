package day14_collection_framework;

import java.util.ArrayList;
import java.util.List;

public class Ex02_ArrayList {
	public static void main(String[] args) {
		
		// 1 ~ 10000 사이의 정수를 저장한 ArrayList 생성
		Integer[] intArray = new Integer[10000];
		List<Integer> list = new ArrayList<>(10000);
		
		for(int i = 0; i < intArray.length; i++) {
			intArray[i] = (i + 1);
			list.add(intArray[i]);
		}
		System.out.println(list);
		
		long start = System.nanoTime();
		
		// 맨 뒤의 데이터부터 순차적으로 삭제
//		while(true) {
//			int size = list.size() - 1;
//			list.remove(size--);
//			if(size < 0) break;
//		}
		
		// 맨 처음 데이터부터 순차적으로 삭제 -> 삭제된 인덱스에 순차적으로 채우므로 뒤부터 삭제하는 것보다 더 시간이 걸림
		int cnt = 0;
		while(true) {
			int size = 0;
			list.remove(size);
			cnt++;
			if(cnt == 10000) {
				break;
			}
		}
		
		long end = System.nanoTime();
		
		System.out.println("총 경과 시간 : " + (end - start) + "ns");
		System.out.println(list);
	}
}
