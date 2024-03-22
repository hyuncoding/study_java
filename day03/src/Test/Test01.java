package Test;

import javax.swing.JOptionPane;

public class Test01 {
	public static void main(String[] args) {
		/*
		 * 정수를 입력 받아 "짝수", "홀수"를 구분해서 출력하기
		 * 단, 3의 배수는 "3의 배수"로 출력하기
		 */
		
		int num = Integer.parseInt(JOptionPane.showInputDialog("정수를 입력하세요."));
		
		if(num % 3 == 0) {
			JOptionPane.showMessageDialog(null, "3의 배수");
		} else if(num % 2 == 0) {
			JOptionPane.showMessageDialog(null, "짝수");
		} else {
			JOptionPane.showMessageDialog(null, "홀수");
		}
		
	}
}
