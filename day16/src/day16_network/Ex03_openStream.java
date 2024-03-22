package day16_network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class Ex03_openStream {
	public static void main(String[] args) {
		
		String host = "https://m.stock.naver.com";
		
		URL url = null;
		BufferedReader br = null;
	    StringBuffer readBuffer = new StringBuffer();
	    String lineContent = "";		// 한줄 읽어오고, readBuffer로 보내기
	    
	    try {
	    	url = new URL(host);
	    	
	    	br = new BufferedReader(new InputStreamReader(url.openStream()));
	    	while((lineContent = br.readLine()) != null) {
	    		readBuffer.append(lineContent + "\n");
	    	}
	    	System.out.println(readBuffer);
	    } catch(MalformedURLException e) {
	    	
	    } catch(IOException e) {
	    	
	    }
	}
}
