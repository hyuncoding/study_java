package day10_access_modifier2;

import day10_access_modifier.*;

class Child extends Parent{
	Child(){
		super.cosmetic = "스킨";		// 다른 패키지의 자식 클래스에서 접근 가능: protected
		super.name = "스미스";
	}
}

public class Ex01_access_modifier {
	public static void main(String[] args) {
		
		Parent p2 = new Parent();
		
		p2.name = "스미스";	// default album 접근 불가능(패키지가 갈림)
		
		
	}
}
