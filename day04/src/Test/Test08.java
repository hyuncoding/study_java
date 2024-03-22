package Test;

public class Test08 {
	public static void main(String[] args) {
		
		for(int i = 1; i < 100; i++) {
			String zzak = "";
			int mode = 0;
			if((i/10) % 3 == 0 && i > 10) {
				zzak += "짝";
				mode = 1;
			}
			if((i % 10) % 3 == 0 && i % 10 != 0) {
				zzak += "짝";
				mode = 1;
			}
			
			if(mode == 1) System.out.print(zzak + "\t");
			else System.out.print(i + "\t");
			
			if(i % 10 == 0) {
				System.out.println();
			}
		}
		
	}
}
