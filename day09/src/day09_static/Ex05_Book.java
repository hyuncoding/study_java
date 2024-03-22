package day09_static;

// data class : Book
class Book{
	// Field
	
	// static 필드
	static int cnt = 0;		// new Book()이 호출될 때마다 1씩 증가되는 변수
	
	// 인스턴스 필드 (non-static) : 인스턴스마다(book1, book2, book3) 개별적으로 가지는 값
	// 모든 인스턴스의 serialNo의 초기화는 0이다.
	int serialNo;
	
	// 방법1.
	// Constructor
//	Book(){
//		cnt++;				// 책의 개수
//		serialNo = cnt;
//	}
	
	// 방법2.
	// Instance Block (인스턴스 블록) : 인스턴스(객체)가 생성될 때마다 실행되는 블록
	{
		cnt++;
		serialNo = cnt;
	}
}

public class Ex05_Book {
	public static void main(String[] args) {
		
		Book book1 = new Book();	// 고유번호 : 1
		Book book2 = new Book();	// 고유번호 : 2
		Book book3 = new Book();	// 고유번호 : 3
		
		System.out.println("book1의 고유번호는 : " + book1.serialNo + "이다.");
		System.out.println("book2의 고유번호는 : " + book2.serialNo + "이다.");
		System.out.println("book3의 고유번호는 : " + book3.serialNo + "이다.");
	}
}
