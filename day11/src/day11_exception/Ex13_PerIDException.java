package day11_exception;

import java.util.Scanner;

class Human{
	private String perID;
	
	public void setPerID(String perID) throws PerIDException{
		if(perID.length() != 14) {
			throw new PerIDException("하이픈(-)을 포함한 14자리를 입력하셔야 합니다.");
		}
		if(perID.charAt(6) != '-') {
			throw new PerIDException("7번째 자리에는 하이픈(-)이 들어가야 합니다.");
		}
		this.perID = perID;
	}
	
	public String getPerID() { return perID; }
}

class PerIDException extends Exception{
	public PerIDException(String message) { super(message); }
}


public class Ex13_PerIDException {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			Human h = new Human();
			
			System.out.print("하이픈(-)을 포함하여 주민등록번호 입력 >> ");
			h.setPerID(sc.next());
			System.out.println("주민등록번호 : " + h.getPerID());
		} catch(PerIDException e) {
			System.out.println("사용자 정의 메세지 : " + e.getMessage());
		} catch(Exception e) {
			e.getMessage();
		} finally {
			sc.close();
		}
		
		
	}
}
