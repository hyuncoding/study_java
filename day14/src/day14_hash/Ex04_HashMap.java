package day14_hash;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class Car{
	
	private String carNo;
	private String owner;
	
	public Car(String carNo, String owner) {
		this.carNo = carNo;
		this.owner = owner;
	}

	// 중복된 Car의 객체 체크를 하려면
	// hashCode() + equals() 메소드를 모두 오버라이드 해야한다.
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((carNo == null) ? 0 : carNo.hashCode());
		result = prime * result + ((owner == null) ? 0 : owner.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if(obj instanceof Car) {
			Car carObj = (Car)obj;
			return carNo.equals(carObj.carNo);
		}
		return false;
	}

	@Override
	public String toString() {
		return carNo + " ( " + owner + " ) ";
	}
}

public class Ex04_HashMap {
	public static void main(String[] args) {
		
		// 주차장 상황
		// key : Car	(중복 발생 금지)
		// value : fee	(요금은 중복 상관 없음)
		
		Map<Car, Integer> parkingLot = new HashMap<>();
		
		parkingLot.put(new Car("20가 1234", "길동"), 3000);
		parkingLot.put(new Car("20가 1234", "길동"), 5000);	// 길동의 요금이 5000원으로 갱신되었다.
		
		Set<Car> set = parkingLot.keySet();
		Iterator<Car> itr = set.iterator();
		
		while(itr.hasNext()) {
			Car car = itr.next();
			Integer fee = parkingLot.get(car);
			System.out.println(car + "의 요금 : " + fee + "원");
		}
	}
}
