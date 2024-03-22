package day14_collection_framework;

import java.util.ArrayList;
import java.util.List;

public class Ex01_ArrayList {
	public static void main(String[] args) {
		
		/*
		 *  1. List의 VIEW를 가진다.
		 *  2. 다형성을 가질 수 있다.
		 *  
		 *  List<Integer> list = new ArrayList<Integer>();			// 부모의 메소드만 사용가능 (다운 캐스팅 해야함)
		 *  List<Integer> list = new ArrayList<>();
		 *  
		 *  1. ArrayList의 VIEW를 가진다.
		 *  2. ArrayList로 타입이 제한된다.
		 *  
		 *  ArrayList<Integer> list = new ArrayList<Integer>();		// 부모와 자신의 메소드를 모두 사용할 수 있음
		 *  ArrayList<Integer> list = new ArrayList<>();
		 */
		
		List<Integer> list = new ArrayList<>();
		
		// 1. 저장 : add()
		list.add(new Integer(10));
		list.add(new Integer(20));
		list.add(30);		// Auto Boxing (int -> Integer)
		list.add(40);
		list.add(50);
		
		// 2. 저장된 요소 가져오기 : get(인덱스)
		System.out.println("첫번째 요소 : " + list.get(0));
		System.out.println("마지막 요소 : " + list.get(4));
		
		// 3. 크기 : size()
		System.out.println("list의 크기 : " + list.size());
		// 1) 크기를 활용해 마지막 요소 출력 : 마지막 인덱스 = 크기 - 1
		System.out.println("마지막 요소 : " + list.get(list.size() - 1));
		// 2) 전체 요소 순회
		for(int i = 0; i < list.size(); i++) {		// list.size()는 메소드로, 여러 번 반복하는 것은 좋지 않은 코드
			System.out.println(i + "번째 요소 : " + list.get(i));
		}
		// 3) 개선된 전체 요소 순회 (일반 for문)
		for(int i = 0, size = list.size(); i < size; i++) {
			System.out.println(i + "번째 요소 : " + list.get(i));
		}
		
		// 4. 삭제 : remove(인덱스)
		// 첫 번째 데이터 삭제하기
		list.remove(0);
		System.out.println("삭제된 자리의 데이터 : " + list.get(0));
		// 삭제된 요소를 비워두지 않고, 뒤에서 순차적으로 채운다.
		// 선입선출 구조인 큐 같은 경우에는 ArrayList를 사용하지 않는다.
		// 초~중반에 저장된 데이터가 자주 삭제되는 구조는 ArrayList가 부적절하다. (매우 느림)
		
		// 5. 삭제 : remove(객체)
		// 50을 찾아서 삭제하기
		list.remove(new Integer(50));
		System.out.println(list.get(2));

		// 6. 확인 : 저장 유무 확인 -> contains(객체)
		// 저장된 50이 있는지 확인하는 코드
		boolean isHere = false;		// 여기 없다로 시작
		if(list.contains(new Integer(50))) {
			isHere = true;			// 여기 있다로 변경
		}
		System.out.println(isHere ? "50이 있다." : "50이 없다.");
		
		// 7. 출력 (컬렉션은 그냥 출력해도 된다.)
		System.out.println("list 전체 출력 : " + list);
		
		// 8. 초기화
		list.clear();
		System.out.println("list 전체 출력 : " + list);
		
	}
}
