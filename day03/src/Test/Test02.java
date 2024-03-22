package Test;

import javax.swing.JOptionPane;

public class Test02 {
	public static void main(String[] args) {
		
		double writtenScore = Double.parseDouble(JOptionPane.showInputDialog("필기 점수를 입력하세요."));
		double actScore = Double.parseDouble(JOptionPane.showInputDialog("실기 점수를 입력하세요."));
		
		double average = (writtenScore + actScore) / 2;
		
		if((average > 80) || (writtenScore >= 70 && actScore >= 70)) {
			JOptionPane.showMessageDialog(null, "합격");
		} else {
			JOptionPane.showMessageDialog(null, "불합격");
		}
	}
}
