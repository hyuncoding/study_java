package Test;

import javax.swing.JOptionPane;

public class Test06 {
	public static void main(String[] args) {
		
		String strKorean = JOptionPane.showInputDialog("국어 점수를 입력하세요.");
		String strEnglish = JOptionPane.showInputDialog("영어 점수를 입력하세요.");
		String strMath = JOptionPane.showInputDialog("수학 점수를 입력하세요.");
		
		int korean = Integer.parseInt(strKorean);
		int english = Integer.parseInt(strEnglish);
		int math = Integer.parseInt(strMath);
		
		double average = (korean + english + math) / 3.0;	// double average = (double)(korean + english + math)/3;
		
		char grade = (average >= 90) ? 'A' : (average >= 80) ? 'B' : (average >= 70) ? 'C' : (average >= 60) ? 'D' : 'F';
		
		String message = "평균 점수 : " + average + ", 학점 : " + grade + ", 국어 : " + korean + ", 영어 : " + english + ", 수학 : " + math;
		
		
		
		JOptionPane.showMessageDialog(null, message);
	}
}
