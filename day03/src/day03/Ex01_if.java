package day03;

import javax.swing.JOptionPane;

public class Ex01_if {
	public static void main(String[] args) {
		
		/*
		 * 조건문 (if 문)
		 * 
		 * if(조건식){
		 * 		조건식이 true일 경우에 실행
		 * } else {
		 * 		조건식이 false일 경우에 실행
		 * }
		 * 
		 */
		
		
		int a = Integer.parseInt(JOptionPane.showInputDialog("정수를 입력하세요."));
		
		if(a > 0) {
			
			JOptionPane.showMessageDialog(null, "양수");
			
		} else if(a == 0) {
			
			JOptionPane.showMessageDialog(null, "ZERO");
				
		} else {
				
			JOptionPane.showMessageDialog(null, "음수");
				
		}
		
		
	}
}
