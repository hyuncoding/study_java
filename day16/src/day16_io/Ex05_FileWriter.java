package day16_io;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Ex05_FileWriter {
	public static void main(String[] args) {
		
		// FileWriter
		// 1. 문자 기반 스트림
		// 2. byte[] 배열 대신, char[], String을 사용한다.
		// 3. 나머지 특성은 FileOutputStream과 동일하다.
		
		FileWriter fw = null;
		
		try {
			fw = new FileWriter("text.txt");
			fw.write("안녕하세요. 반갑습니다.");
			fw.write('\n');
			fw.write("Nice to meet you.");
			System.out.println("text.txt 파일이 생성되었다.");
		} catch(FileNotFoundException e) {
			
		} catch(IOException e) {
			
		} catch(Exception e) {
			
		} finally {
			try {
				if(fw != null) {
					fw.close();
				}
			} catch(Exception e) {
				
			}
		}
		
	}
}
