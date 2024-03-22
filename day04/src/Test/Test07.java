package Test;

import javax.swing.JOptionPane;

public class Test07 {
	public static void main(String[] args) {
		
		String ID = "admin";
		String PW = "1234";
		String userInputID = "";
		String userInputPW = "";
		
		do {
			userInputID = JOptionPane.showInputDialog("아이디를 입력하세요.");
		} while(!userInputID.equals(ID));
		
		int cnt = 0;
		
		do {
			if(cnt == 5) {
				JOptionPane.showMessageDialog(null, "비밀번호 입력 횟수 초과");
				break;
			}
			userInputPW = JOptionPane.showInputDialog("비밀번호를 입력하세요.");
			cnt++;
			if(userInputPW.equals(PW)) JOptionPane.showMessageDialog(null, "로그인 성공");
		} while(!userInputPW.equals(PW));
		
		/*
		 * String id = "admin";
		 * String pw = "1234";
		 * final int MAX_COUNT = 5;		// 최대 횟수 "상수" (상수는 대문자로 명명)
		 * 
		 * while(true){
		 *     String idMy = JOptionPane.showInputDialog("아이디 : ");
		 *     if(id.equals(idMy)) {
		 *         int cnt = 0;
		 *         while(cnt < MAX_COUNT) {
		 *             String passwordMy = JOptionPane.showInputDialog("비밀번호 : ");
		 *             cnt++;
		 *             if(pw.equals(passwordMy) {
		 *                 JOptionPane.showMessageDialog(null, "로그인 성공");
		 *                 break;
		 *             } else JOptionPane.showMessageDialog(null, "비밀번호가 틀렸습니다.");
		 *             if(cnt == MAX_COUNT) {
		 *                 JOptionPane.showMessageDialog(null, "비밀번호 입력 횟수 초과");
		 *             }
		 *         }
		 *         break;
		 *     }
		 *     JOptionPane.showMessageDialog(null, "아이디가 틀렸습니다.");
		 * }
		 */
	}
}
