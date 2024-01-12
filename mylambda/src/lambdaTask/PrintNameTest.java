package lambdaTask;

public class PrintNameTest {
	public static void main(String[] args) {
//		외부에서 전달받은 성씨, 이름을 받아서 전체 이름을 제작한다.
//		PrintName printName = new PrintName() {
//			
//			@Override
//			public String getFullName(String lastName, String firstName) {
//				return lastName + firstName;
//			}
//		};
		PrintName printName = (lastName, firstName) -> lastName + firstName;
		System.out.println(printName.getFullName("양", "현"));
	}
}
