package exceptionTest;

// RuntimeException : �����Ϸ��� �˻����� ����(���� ���� ��Ű�� ���� �� ���)
// Exception : �����Ϸ��� �˻���(���� ���ᰡ �ƴ� �ش� ��Ȳ ó���� ���� �� ���)
public class BadWordException extends Exception {
	
	public BadWordException(String message) {
		super(message);
	}
}
