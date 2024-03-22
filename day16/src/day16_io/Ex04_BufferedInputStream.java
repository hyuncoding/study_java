package day16_io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex04_BufferedInputStream {
	public static void main(String[] args) {
		
		BufferedInputStream bis = null;
		StringBuffer readbuffer = new StringBuffer();
		int state = 0;
		
		try {
			bis = new BufferedInputStream(new FileInputStream("second.txt"));
			
			while(true) {
				byte[] byteArray = new byte[16];
				
				state = bis.read(byteArray);
				if(state == -1) {
					break;
				}
				
				readbuffer.append(new String(byteArray));
			}
			
			System.out.println(readbuffer);
		} catch(FileNotFoundException e) {
			
		} catch(IOException e) {
			
		} catch(Exception e) {
			
		} finally {
			try {
				if(bis != null) {
					bis.close();
				}
			} catch(Exception e) {
				
			}
		}
		
	}
}
