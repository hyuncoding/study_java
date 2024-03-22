package day16_network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Ex01_inetAddress {
	public static void main(String[] args) {
		
		// 1.
		InetAddress ipAddress = null;
		String host = "www.naver.com";
		
		try {
			ipAddress = InetAddress.getByName(host);
			
			System.out.println(ipAddress);
			System.out.println(ipAddress.getHostName());
			System.out.println(ipAddress.getHostAddress());
		} catch(UnknownHostException e) {
			System.out.println("없는 Host이다.");
		}
		
		// 2. 원격 HOST 확인
		InetAddress[] ipList = null;
		try {
			ipList = InetAddress.getAllByName(host);
			for(int i = 0; i < ipList.length; i++) {
				System.out.println((i + 1) + "번 째 ip : " + ipList[i].getHostAddress());
			}
		} catch(UnknownHostException e) {
			System.out.println("없는 Host이다.");
		}
		
		// 3. 로컬 HOST 확인
		try {
			ipAddress = InetAddress.getLocalHost();
			
			System.out.println(ipAddress.getHostName());
			System.out.println(ipAddress.getHostAddress());
		} catch(UnknownHostException e) {
			System.out.println("없는 Host이다.");
		}
		
	}
}
