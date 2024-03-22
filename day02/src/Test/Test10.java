package Test;

import javax.swing.JOptionPane;

public class Test10 {
	public static void main(String[] args) {
		
		String strWeight = JOptionPane.showInputDialog("몸무게를 입력하시오.");
		String strHeight = JOptionPane.showInputDialog("키를 입력하시오.");
		
		double weight = Double.parseDouble(strWeight);
		double height = Double.parseDouble(strHeight);
		
		height /= 100;
		
		double bmi = weight / (height * height);
		
		String obesityLevel = (bmi >= 25) ? "과체중" : (bmi >= 20) ? "정상" : "저체중";
		JOptionPane.showMessageDialog(null, obesityLevel);
	}
}
