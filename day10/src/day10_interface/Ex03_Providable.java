package day10_interface;

// 인터페이스
interface Providable{
	void sightseeing();		// 관광
	void leisure();			// 레저
	void food();			// 음식
}

// 구현클래스 - 1
class KoreaTour implements Providable{
	// 반드시 인터페이스 Providable의 "모든 메소드"를 KoreaTour가 "오버라이드" 해야한다.

	@Override
	public void sightseeing() {
		System.out.println("광화문 관광");
	}

	@Override
	public void leisure() {
		System.out.println("한강 유람선");
	}

	@Override
	public void food() {
		System.out.println("불고기");
	}
}

// 구현 클래스 - 2
class GuamTour implements Providable{

	@Override
	public void sightseeing() {
		System.out.println("투몬비치");
	}

	@Override
	public void leisure() {
		System.out.println("패들보트");
	}

	@Override
	public void food() {
		System.out.println("피자");
	}
}

class TourGuide{
	
	// Field
//	private KoreaTour tourguide1;	// 한국여행이 가능한 가이드
//	private GuamTour tourguide2;	// 괌여행이 가능한 가이드
	private Providable tour;		// 한국, 괌 여행이 모두 가능한 가이드
	
	// Constructor
	public TourGuide(Providable tour) {
		this.tour = tour;
	}
	
	// Method
	public void sightseeing() {
		tour.sightseeing();		// 다형성 (전달된 tour에 따라서 동작이 달라진다.)
	}
	public void leisure() {
		tour.leisure();			// 다형성
	}
	public void food() {
		tour.food();			// 다형성
	}
}

public class Ex03_Providable {
	public static void main(String[] args) {
		
		KoreaTour tour = new KoreaTour();
		TourGuide guide = new TourGuide(tour);
		
		guide.sightseeing();
		guide.leisure();
		guide.food();
		
		GuamTour tour1 = new GuamTour();
		TourGuide guide1 = new TourGuide(tour1);
		
		guide1.sightseeing();
		guide1.leisure();
		guide1.food();
		
	}
}
