package day02_Scanner;

public class Ex01_Scanner {
	public static void main(String[] args) {
		
		/*
		 * Scanner 클래스
		 * 
		 *  1. 콘솔 창을 통한 입력
		 *  2. java.util.Scanner
		 *  	1) java.util.Scanner로 그대로 사용
		 *  	2) import java.util.Scanner; 후 Scanner만 사용 (주로 사용)
		 *  		- import 대상 : java.lang 이외의 패키지에 저장된 모든 클래스
		 *  3. Scanner 클래스의 객체 생성 방법
		 *     Scanner 객체명 = new Scanner(입력스트림);
		 *  4. Scanner 클래스의 객체 소멸 방법
		 *     객체명.close();
		 *  5. Scanner 클래스의 메소드 (입력하는 데이터 타입에 따라 구분)
		 *  	1) 정수 입력
		 *  		- nextInt(), nextByte(), nextShort(), nextLong()
		 *  	2) 실수 입력
		 *  		- nextDouble(), nextFloat();
		 *  	3) 논리 입력
		 *  		- nextBoolean()
		 *  	4) 문자열 입력
		 *  		- next() : 공백 문자 전까지 입력 (공백 문자 입력 불가)
		 *  		- nextLine() : 엔터 전까지 입력 (공백 입력 가능)
		 *  	5) 문자 입력
		 *  		- 문자열 입력(next() nextLine()) 후 첫번째 글자만 빼서(charAt(0)) 사용
		 */
		
		// 1. import 없이 Scanner 클래스를 사용하기
		// 성명, 나이, 키, 성별을 입력받아서 출력하기
		
		// 1) Scanner 클래스의 scanner 객체 생성
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		// 2) 입력
		System.out.print("성명 입력 >> ");
		String name = sc.nextLine();
		
		System.out.print("나이 입력 >> ");
		int age = sc.nextInt();
		
		System.out.print("키 입력 >> ");
		double height = sc.nextDouble();
		
		System.out.print("성별 입력 >> ");
		char gender = sc.next().charAt(0);
		
		// 3) 출력
		System.out.println("성명 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("키 : " + height);
		System.out.println("성별 : " + gender);
		
		// 4) sc 객체 소멸
		sc.close();
		
		
		
		
		
		
		
		
		
		
		
	}
}
