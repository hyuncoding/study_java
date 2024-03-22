package day11_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

class UpDown{
	
	// Field
	private int answer;		// 정답
	private int count;		// 시도 횟수
	private Scanner sc = new Scanner(System.in);	// 모든 메소드에서 sc 사용가능
	
	// Constructor
	public UpDown() {
		// 1 ~ 100 사이의 난수 발생
		answer = (int)(Math.random() * 100 + 1);
	}
	
	// Method
	public int challenge() throws NumberOutOfBoundsException, InputMismatchException{
		// 사용자가 입력한 값이 리턴
		count++;
		System.out.print("1 ~ 100 사이 정수 입력 >> ");
		int num = sc.nextInt();
		if(num < 1 || num > 100) {
			throw new NumberOutOfBoundsException("1에서 100 사이의 숫자를 입력하셔야 합니다.");
		}
		return num;
	}
	
	public void play() {
		// 모든 로직 처리
		while(true) {
			try {
				int num = challenge();
				
				if(answer < num) System.out.println("DOWN!");
				else if(answer > num) System.out.println("UP!");
				else {
					System.out.println("정답 : " + answer + ", " + count + "번째 시도만에 정답입니다!");
					break;
				}
			} catch(NumberOutOfBoundsException e) {
				System.out.println("예외 메세지 : " + e.getMessage());
			} catch(InputMismatchException e) {
				System.out.println("정수를 입력하시오.");
				clearInputBuffer();
			} catch(Exception e) {
				System.out.println("예외 메세지 : " + e.getMessage());
			}
		}
	}
	
	public void clearInputBuffer() { sc.next(); }
	
}

// 사용자가 1 ~ 100 이외의 범위 값을 입력하면
// NumberOutOfBoundsException 예외 발생
class NumberOutOfBoundsException extends Exception{
	public NumberOutOfBoundsException(String message) { super(message); }
}


public class Ex14_UpDown {
	public static void main(String[] args) {
		
		UpDown game = new UpDown();
		game.play();
		
	}
}
