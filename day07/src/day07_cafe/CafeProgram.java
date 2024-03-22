package day07_cafe;

import java.util.Scanner;

class Cafe{
	
	// Field
	Scanner sc = new Scanner(System.in);	// Scanner
	String[] menuarr = {"아메리카노", "카페라떼", "카라멜 마끼아또", "콜드브루"};	// 메뉴 배열
	int[] pricearr = {4500, 5000, 5900, 4900};	// 가격 배열
	String[] customerarr = new String[5];		// 고객한테 주문받은 배열
	String name;	// 카페 이름
	int cnt = 0;	// customerarr의 인덱스로 사용
	int totalPrice = 0;
	int payAmount;
	
	// Constructor
	Cafe(String n){
		name = n;
	}
	
	// Method
	void printHello() {
		customerarr = new String[5];
		cnt = 0;
		totalPrice = 0;
		System.out.println("안녕하세요, " + name + "입니다.\n메뉴를 선택해 주세요.\n");
	}
	
	void printMenu() {
		// 메뉴 출력
		System.out.println("---------MENU---------");
		System.out.println("1. 아메리카노\t4,500원");
		System.out.println("2. 카페라떼\t\t5,000원");
		System.out.println("3. 카라멜 마끼아또\t5,900원");
		System.out.println("4. 콜드브루\t\t4,900원");	// \t를 하나만 쓰면 왠지 모르겠지만 칸이 안 맞는다. 2, 4번 모두.
		System.out.println("----------------------");
	}
	
	int getOrder() {
		System.out.print(">> ");
		int choice = sc.nextInt();
		return --choice;
	}
	
	void printOrder(int choice) {
		System.out.println(menuarr[choice] + "을(를) 주문하셨습니다.");
		System.out.println("가격은 " + pricearr[choice] + "원 입니다.");
	}
	
	void saveOrder(int choice) {
		customerarr[cnt] = menuarr[choice];
		cnt++;
	}
	
	boolean order() {
		// 주문 받기
		int choice = getOrder();
		// 주문 출력
		printOrder(choice);
		// 주문 저장
		saveOrder(choice);
		
		// 주문/결제 옵션 출력
		System.out.println("다음 옵션 중 하나를 선택하세요.");
		System.out.println("1. 주문하기");
		System.out.println("2. 결제하기");
		System.out.print(">> ");
		// 옵션 입력
		int optionChoice = sc.nextInt();
		
		// 경우에 따른 다음 동작 방식 결정
		// 1. 주문 가능 수량 초과 --> 결제하기로 이동
		// 2. optionChoice == 1 --> 재주문하러 이동
		// 3. optionChoice == 0 -- > 결제하러 이동
		if(cnt == 5) {
			System.out.println("주문 가능 수량을 초과하셨습니다.");
			System.out.println("결제하기로 이동합니다.\n");
			return false;
		} else if (optionChoice == 1) {
			System.out.println("주문하기로 이동합니다.\n");
			return true;
		} else {
			System.out.println("결제하기로 이동합니다.\n");
			return false;
		}
	}
	
	void printOrderList() {
		// 주문내역 출력
		System.out.println("현재 주문내역입니다.");
		
		// 총액 계산
		for(String cm : customerarr) {
			if(cm == null) break;
			System.out.print(cm + "\t");	// 메뉴명 출력
			for(int i = 0; i < menuarr.length; i++) {
				if(cm.equals(menuarr[i])) {
					System.out.println(pricearr[i] + "원");	// 메뉴가격 출력
					totalPrice += pricearr[i];	// 총액 계산(누적연산)
			    }
			}
	    }
		System.out.println("\n총 " + totalPrice + "원 입니다.");
	}
	
	void payment() {
		// 지불할 금액 입력받기
		System.out.println("결제 금액을 입력하시오.");
		System.out.print(">> ");
		payAmount = sc.nextInt();
		
		// 지불할 금액량에 따른 처리
		// 1. 주문 총액 == 지붏할 금액 --> 결제 정상 처리
		// 2. 주문 총액 > 지불할 금액 --> 결제 미처리 및 프로그램 종료
		// 3. 주문 총액 < 지불할 금액 --> 결제 정상 처리 및 거스름돈 반환
		if(totalPrice == payAmount) {
			System.out.println("결제가 완료되었습니다.");
		} else if(totalPrice > payAmount) {
			System.out.println("잔액이 부족합니다.\n결제를 종료합니다.");
		} else {
			System.out.println("결제가 완료되었습니다.");
			System.out.println("거스름돈은 " + (payAmount - totalPrice) + "원 입니다.");
		}
		System.out.println();
		System.out.println();
		System.out.println("------------------");
		System.out.println();
		System.out.println();
		
	}
	
}
public class CafeProgram {
	public static void main(String[] args) {
		
		/*
		 *  Cafe 키오스크
		 *  
		 *  1. 주문받기
		 *     1) 메뉴출력
		 *     2) 메뉴입력받기
		 *     3) 추가주문 or 결제
		 *     4-1) 추가주문받기
		 *     4-2) 결제 이동
		 *  
		 *  2. 결제하기
		 *     1) 주문한 메뉴 및 총액출력
		 *     2) 결제방식 입력받기(X)
		 *     3) 결제진행
		 *     4) 잔액부족여부확인
		 *     5-1) 잔액부족일 경우 --> 결제종료 및 프로그램 종료
		 *     5-2) 잔액충분일 경우 --> 결제진행
		 *     6) 결제 성공 및 프로그램 종료 
		 *     
		 */
		
		// 변수 선언
		boolean flag = true;
		
		Cafe cafe = new Cafe("양카페");

		while(true) {
			// 주문받기
			cafe.printHello();
			flag = true;
			
			while(flag) {
				// 메뉴 출력
				cafe.printMenu();
				
				// 주문하기
				flag = cafe.order();
			}
			
			// 결제하기
			cafe.printOrderList();
			
			// 지불할 금액 입력받기
			cafe.payment();
		}
		
	}	
}
