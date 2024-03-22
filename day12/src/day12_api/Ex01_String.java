package day12_api;

public class Ex01_String {
	public static void main(String[] args) {
		
		// 1. 문자열 리터럴은 자바에 의해 최적화 가능
		// 같은 문자열을 또 사용하면 기존 문자열 사용
		String n = new String("hello");
		String a = "apple";
		String b = "apple";
		System.out.println(a == b ? "apple1개" : "apple2개");		// a와 b의 해시코드 값이 같니? 를 비교함.
		System.out.println("a의 해시코드 : " + a.hashCode());
		System.out.println("b의 해시코드 : " + b.hashCode());
		
		// 2. new 는 언제나 새로운 문자열을 생성
		String c = new String("Banana");
		String d = new String("Banana");
		System.out.println(c == d ? "Banana1개" : "Banana2개");
		System.out.println("c의 해시코드 : " + c.hashCode());
		System.out.println("d의 해시코드 : " + d.hashCode());
		
		// 3. equals(), equalsIgnoreCase()
		
		// 4. length()
		
		// 5. charAt()
		
		// 6. indexOf() : 저장한 문자의 인덱스를 반환
		String perID = "123456-1234567";
		System.out.println(perID.indexOf("-"));
		System.out.println(perID.indexOf('-'));		// String, char 둘다 가능
		
		// 7. lastIndexOf() : 지정한 문자의 마지막 인덱스를 반환
		String today = "2023.02.26";
		System.out.println(today.lastIndexOf("."));
		System.out.println(today.lastIndexOf('.'));	// 얘도 String, char 둘다 가능
		
		// 8. substring() : 문자열의 일부를 추출
		// 		1) substring(시작) : 시작 포함 ~ 끝까지 추출
		//		2) substring(시작, 종료) : 시작 포함 ~ 종료 불포함(종료 전까지) 추출
		String phone = "010-1234-5678";
		String p1 = phone.substring(0, 3);		// 0, 1, 2 번 인덱스 : 시작 + 추출할 글자 수 = 종료
		String p2 = phone.substring(4, 8);
		String p3 = phone.substring(9, 13);
		System.out.println(p1 + ", " + p2 + ", " + p3);
		
		// 9. replace : 기존의 텍스트를 다른 텍스트로 교체/대체
		String str = "hello";
		System.out.println(str.replace("he", "she"));
		
		
		// 문제
		// "Ex01_String.java" 를 파일명과 확장자명으로 분리하여
		// "파일명, 확장자명" 과 같은 형태로 출력하시오.
		String fullName = "Ex01_String.java";
		// System.out.println(fullName.substring(0, 11) + ", " + fullName.substring(12));
		String fileName = fullName.substring(0, fullName.indexOf("."));
		String extName = fullName.substring(fullName.indexOf(".") + 1);
		System.out.println(fileName + ", " + extName);
		
		// 주민번호 2개 이상이 저장된 배열을 생성한 후
		// 주민번호 뒷 6자리를 "******"로 대체하여 출력하시오.
		String[] perIDs = new String[2];
		perIDs[0] = "990101-1234567";
		perIDs[1] = "000101-4567123";
		// String[] perIDs = {"990101-1234567", "000101-4567123"};
		
		for(String ID : perIDs) {
			System.out.println(ID.replace(ID.substring(8), "******"));
		}
//		for(String ID : perIDs) {
//			System.out.println(ID.replace(ID.substring(ID.indexOf("-") + 2), "******"));
//		}
		
		
	}
}















