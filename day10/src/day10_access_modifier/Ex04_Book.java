package day10_access_modifier;

// 정보 은닉 : Field는 private 하여 다른 클래스에서는 메소드를 거쳐 필드를 사용할 수 있게함.

class Book{
	
	// Field
	private String title;
	private String writer;
	private int price;
	private int salesVolume;
	private boolean isBestSeller;
	
	// Method
	
	// setter : 필드에 데이터 저장
	public void setTitle(String title) { this.title = title; }
	public void setWriter(String writer) { this.writer = writer; }
	public void setPrice(int price) { this.price = price; }
	public void setSalesVolume(int salesVolume) {
		this.salesVolume = salesVolume;
		if(salesVolume >= 1000) {
			setBestSeller(true);
		}
	}
	private void setBestSeller(boolean isBestSeller) { this.isBestSeller = isBestSeller; }
	
	// getter
	public String getTitle() { return title; }
	public String getWriter() { return writer; }
	public int getPrice() { return price; }
	public int getSalesVolume() { return salesVolume; }
	public boolean isBestSeller() { return isBestSeller; }
}

public class Ex04_Book {
	public static void main(String[] args) {
		
		Book book = new Book();
		
		// book 객체의 필드값에 저장을 위한 메소드를 호출한다.
		// setter
		book.setTitle("콩쥐팥쥐");
		book.setWriter("한국출판사 연구소");
		book.setPrice(10000);
		book.setSalesVolume(1000);
		
		// book 객체의 필드값을 확인하기 위한 메소드를 호출한다
		// getter
		System.out.println("제목 : " + book.getTitle());
		System.out.println("저자 : " + book.getWriter());
		System.out.println("가격 : " + book.getPrice());
		System.out.println("판매량 : " + book.getSalesVolume());
		System.out.println(book.isBestSeller() ? "베스트셀러" : "일반서적");

		
	}
}
