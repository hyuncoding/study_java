package day16_io;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex03_BufferedOutputStream {
	public static void main(String[] args) {
		
		// BufferedOutputStream
		// 1. 보조 스트림이다.
		// 2. 주 스트림(FileOutputStream)에 부착하는 형태로 사용한다.
		// 3. Buffer(버퍼)가 사용되기 때문에 속도가 빠르다.
		
		BufferedOutputStream bos = null;
		
		try {
			bos = new BufferedOutputStream(new FileOutputStream("second.txt"));
			
			String message = "안녕하세요. 반갑습니다. \n나는 대한민국에서 온 김땡땡이라고 합니다.\n";
			bos.write(message.getBytes());
			
			System.out.println("second.txt 파일이 생성되었다.");
		} catch(FileNotFoundException e) {
			
		} catch(IOException e) {
			
		} catch(Exception e) {
			
		} finally {
			try {
				if(bos != null) {
					bos.close();
				}
			} catch(Exception e) {
				
			}
		}
		
	}
}
