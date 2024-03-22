package day12_api;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Ex04_big_number {
	public static void main(String[] args) {
		
		// primitive type의 최대값
		
		// int 형 최대값
		System.out.println(Integer.MAX_VALUE);
		
		// double 형 최대값
		System.out.println(Double.MAX_VALUE);
		
		// BigInteger 클래스를 활용해서 long 타입 이상(이하)의 값을 저장한다.
		// int와 long보다 큰 값을 저장시킬 때는 int와 long이 다 담지 못하기 때문에 문자열로 저장
		BigInteger a = new BigInteger("12345678901234567890");
		BigInteger b = new BigInteger("123456789012345678901234567890");
		
		System.out.println(a);
		System.out.println(b);
		
		// BigInteger 클래스의 필드 값
		System.out.println(BigInteger.ZERO);
		System.out.println(BigInteger.ONE);
		System.out.println(BigInteger.TEN);
		
		// 사칙 연산
		System.out.println(a.add(b));			// +
		System.out.println(a.subtract(b));		// -
		System.out.println(a.multiply(b));		// *
		System.out.println(a.divide(b));		// /
		
		// BigDecimal 클래스를 이용해 실수의 소수 자릿수를 손실 없이 사용할 수 있다.
		double c = 1.1234567890123456789;
		BigDecimal d = new BigDecimal("1.123456789012345678901234567890");
		
		System.out.println(c);
		System.out.println(d);
		
	}
}
