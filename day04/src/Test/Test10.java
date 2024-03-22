package Test;

import java.util.Random;

public class Test10 {
	public static void main(String[] args) {
		
		Random rand = new Random();
		int money = 10000;
		
		System.out.println("현재 10000원이 있습니다.");
		while(true) {
			int charge = rand.nextInt(money) + 1;		// 1 ~ 10000 (x), 1 ~ money (o)
			money -= charge;
			
			System.out.println(charge + "원 사용합니다. 남은 돈은 " + money + "원 입니다.");
			if(money <= 0) break;
		}
		
	}
}
