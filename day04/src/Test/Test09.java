package Test;

import javax.swing.JOptionPane;

public class Test09 {
	public static void main(String[] args) {
		
		String gugudan = "";
		for(int i = 2; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				gugudan += i + "x" + j + "=" + (i*j) + "\t";
			}
			gugudan += "\n";
		}
		
		JOptionPane.showMessageDialog(null, gugudan);
		
	}
}
