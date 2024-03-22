package day12_api;

public class Ex02_StringBuffer {
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer();
		System.out.println("기본 버퍼 크기 : " + sb.capacity());
		
		// 문자열 추가
		sb.append("hello");
		sb.append(" java world!!!!!!!");
		
		System.out.println("변경된 버퍼 크기 : " + sb.capacity());
		
		System.out.println(sb);
		
		// String 변환
		String str = sb.toString();
		System.out.println(str);
		
		/*
		 * String getString(){
		 * 		StringBuffer sb = new StringBuffer();
		 * 		return sb;	-> 스트링 버퍼는 리턴 안 됨. -> sb.toString();으로 문자열로 바꾼 후 내뱉어줘야됨.
		 * }
		 */
		
	}
}
