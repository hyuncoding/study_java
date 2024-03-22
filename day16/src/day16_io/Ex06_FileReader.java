package day16_io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex06_FileReader {
	public static void main(String[] args) {
		
		// FileReader
		// 1. 문자 기반 스트림이다.
		// 2. byte[] 배열 대신 char[], String을 사용한다.
		// 3. 나머지 특성은 FileInputStream과 동일하다.
		
		FileReader fr = null;
		
		try {
			int ch = 0;
			fr = new FileReader("text.txt");
			while((ch = fr.read()) != -1) {
				System.out.print((char)ch);
			}
		} catch(FileNotFoundException e) {
			
		} catch(IOException e) {
			
		} catch(Exception e) {
			
		} finally {
			try {
				if(fr != null) {
					fr.close();
				}
			} catch(Exception e) {
				
			}
		}
		
	}
}
