package Test;
//Test01.java
//게시물을 저장하는 Board 클래스를 정의하고,
//ArrayList를 이용하여 3개의 게시물을 저장하시오.
//1~3 게시물 번호 중 하나를 입력 받아 해당 게시물을 삭제하시오.
//
//class Board {
//	private String title;
//	private String content;
//	private Date registerDate;		// 현재 날짜 자동 삽입
//}

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

class Board{
	private String title;
	private String content;
	private Date registerDate;
	
	public Board(String title, String content) {
		this.title = title;
		this.content = content;
		this.registerDate = new Date();
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		sb.append("제목 : ").append(title).append("\n");
		sb.append("내용 : ").append(content).append("\n");
		sb.append("날짜 : ").append(sdf.format(registerDate)).append("\n");
		return sb.toString();
	}
}

public class Test01 {
	public static void main(String[] args) {
		
		List<Board> list = new ArrayList<>(3);
		list.add(new Board("가", "가마니"));
		list.add(new Board("나", "나비야"));
		list.add(new Board("다", "다리미"));
		
		Scanner sc = new Scanner(System.in);
		System.out.println("----현재 게시판----");
		for(int i = 0; i < list.size(); i++) {
			System.out.println((i+1) + "번 게시물 ------------" + "\n" + list.get(i));
		}
		System.out.println("----------------");
		System.out.print("삭제할 게시물 번호 입력(1~3) >> ");
		int removeIdx = sc.nextInt() - 1;
		
		list.remove(removeIdx);
		System.out.println("----삭제 후 게시판----");
		for(int i = 0; i < list.size(); i++) {
			System.out.println((i+1) + "번 게시물 ------------" + "\n" + list.get(i));
		}
		
				
		
	}
}
