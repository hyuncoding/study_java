package lambdaTask;

public class PrintNameTest {
	public static void main(String[] args) {
//		�ܺο��� ���޹��� ����, �̸��� �޾Ƽ� ��ü �̸��� �����Ѵ�.
//		PrintName printName = new PrintName() {
//			
//			@Override
//			public String getFullName(String lastName, String firstName) {
//				return lastName + firstName;
//			}
//		};
		PrintName printName = (lastName, firstName) -> lastName + firstName;
		System.out.println(printName.getFullName("��", "��"));
	}
}
