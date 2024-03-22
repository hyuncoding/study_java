package Test;

import java.math.BigInteger;

public class Test02_ans {
	
	public static BigInteger factorial(BigInteger n) {
		if(n.equals(BigInteger.ONE)) return BigInteger.ONE; 
		else return factorial(n.subtract(BigInteger.ONE)).multiply(n);
	}
	public static void main(String[] args) {
		
		for(int n = 1; n < 100; n++) {
			System.out.println(n + "! (" + "팩토리얼) = " + factorial(BigInteger.valueOf(n)));
		}
		
	}
}
