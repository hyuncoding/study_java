package synchronizedTest;

public class CU {
	public static void main(String[] args) {
		ATM atm = new ATM();
		
		Thread mom = new Thread(atm, "¾ö¸¶");
		Thread daughter = new Thread(atm, "µþ");
		
		mom.start();
		daughter.start();
	}
}
