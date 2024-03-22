package day16_io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex01_FileOutputStream {
	public static void main(String[] args) {
		
		// FileOutputStream 객체 선언
		// 선언만 하는 이유 : 생성(new)하기 위해서는 반드시 예외처리가 필요하다.
		FileOutputStream fos = null;		// Stream == 통로를 선언
		
		// 파일에 보낼 데이터 저장
		String message = "Hello World";
		String greeting = "Nice to meet you";
		
		int ch1 = 'A';
		int ch2 = 'Z';
		
		// FileOutputStream 객체 생성은 try문이 반드시 필요하다.
		try {
			fos = new FileOutputStream("first.txt");
			
			// int 타입을 파일로 보내기
			fos.write(ch1);
			fos.write(ch2);
			fos.write('\n');
			
			// String 타입을 파일로 보내기
			// String -> byte[] : getBytes() 메소드
			fos.write(message.getBytes());
			fos.write('\n');
			fos.write(greeting.getBytes());
			
			// 완료메세지
			System.out.println("first.txt 파일이 생성되었다.");
		} catch(FileNotFoundException e) {
			System.out.println("first.txt 파일이 생성되지 않았다.");
		} catch(IOException e) {
			System.out.println("first.txt 파일에 데이터를 기록하지 못했다.");
		} catch(Exception e){
			System.out.println("알 수 없는 예외가 발생했다.");
		} finally {
			// FileOutputStream 객체를 닫을 때에도
			// 반드시 예외 처리를 해야 한다.
			// close() 메소드를 try 내부에 두라는 의미
			try {
				if(fos != null) {
					fos.close();
				}
			} catch(Exception e) {
				
			}
		}
		
	}
}
