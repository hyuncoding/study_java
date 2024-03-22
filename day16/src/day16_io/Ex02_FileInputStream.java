package day16_io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex02_FileInputStream {
	public static void main(String[] args) {
		
		FileInputStream fis = null;
		
		// 읽어들인 데이터를 저장할 변수 및 배열 선언
		StringBuffer readBuffer = new StringBuffer();	// byteArray의 데이터를 계속해서 읽어들여 누적할 변수
		int state = 0;									// 더 읽을 데이터가 남아있는지 상태 확인
		
		try {
			fis = new FileInputStream("first.txt");
			while(true) {
				byte[] byteArray = new byte[10];
				
				state = fis.read(byteArray);
				if(state == -1) {
					// read() 메소드가 -1 리턴하면 파일이 종료되었다는 의미
					break;
				}
				
				// byteArray -> readBuffer
				readBuffer.append(new String(byteArray));
			}
			System.out.println(readBuffer);
		} catch(FileNotFoundException e) {
			
		} catch(IOException e) {
			
		} catch(Exception e) {
			
		} finally {
			try {
				if(fis != null) {
					fis.close();
				}
			} catch(Exception e) {
				
			}
		}
	}
}
