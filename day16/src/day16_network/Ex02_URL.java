package day16_network;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;

public class Ex02_URL {
	public static void main(String[] args) {
		
		String host = "https://filesamples.com/samples/document/txt/sample3.txt";
		
		URL url = null;
		
		try {
			url = new URL(host);
			
			System.out.println(url.getAuthority());
			System.out.println(url.getContent());
			System.out.println(url.getDefaultPort());
			System.out.println(url.getPort());
			
			System.out.println(url.getPath());
			System.out.println(url.getFile());
			
			System.out.println(url.getProtocol());
			System.out.println(url.getHost());
			
			
		} catch(MalformedURLException e) {
			System.out.println("없는 host이다.");
		} catch(IOException e) {
			System.out.println("연결이 불가능하다.");
		}
	}
}
