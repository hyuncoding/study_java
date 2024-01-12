package methodTest;

public class MethodTask {
//	1~10���� println()���� ����ϴ� �޼ҵ�
	void printFrom1To10() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i + 1);
		}
	}

//	"ȫ�浿"�� n�� println()���� ����ϴ� �޼ҵ�
	void printHong(int count) {
		for (int i = 0; i < count; i++) {
			System.out.println("ȫ�浿");
		}
	}

//	�̸��� n�� println()���� ����ϴ� �޼ҵ�
	void printName(String name, int count) {
		for (int i = 0; i < count; i++) {
			System.out.println(name);
		}
	}

//	�� ������ �������ִ� �޼ҵ�
	int sub(int a, int b, int c) {
		return a - b - c;
	}

//	�� ������ ������ �� ��� ������ �� ���� ���ϴ� �޼ҵ�
	int[] getResultByDivision(int number1, int number2) {
		return new int[] { number1 / number2, number1 % number2 };
	}

//	1~n������ ���� �����ִ� �޼ҵ�
	int getTotalFrom1(int end) {
		int result = 0;
		for (int i = 0; i < end; i++) {
			result += i + 1;
		}
		return result;
	}

//	Ȧ���� ¦����, ¦���� Ȧ���� �ٲ��ִ� �޼ҵ�
	int change(int number) {
		return ++number;
	}

//	���ڿ��� �Է¹ް� �ҹ��ڴ� �빮�ڷ�, �빮�ڴ� �ҹ��ڷ� �ٲ��ִ� �޼ҵ�
	String changeToUpperCaseOrLowerCase(String content) {
		String result = "";
		for (int i = 0; i < content.length(); i++) {
			char letter = content.charAt(i);
			if (letter >= 65 && letter <= 90) {
				result += (char) (letter + 32);
			} else if (letter >= 97 && letter <= 122) {
				result += (char) (letter - 32);
			} else {
				result += letter;
			}
		}
		return result;
	}

//	���ڿ��� �Է¹ް� ���ϴ� ���ڸ� ������ �����ִ� �޼ҵ�
	int getCountOfCharacterInContent(String content, char character) {
		int count = 0;
		for (int i = 0; i < content.length(); i++) {
			if (content.charAt(i) == character) {
				count++;
			}
		}
		return count;
	}

//	5���� ������ �Է¹��� �� ���ϴ� �ε����� ���� �����ִ� �޼ҵ�
	int getValueInArray(int[] arData, int index) {
		return arData[index];
	}

//	�ѱ��� ������ �ٲ��ִ� �޼ҵ�(�ϰ��̻� -> 1024)
	int changeToInteger(String data) {
		String hangeul = "�����̻�����ĥ�ȱ�";
		String result = "";

		for (int i = 0; i < data.length(); i++) {
			result += hangeul.indexOf(data.charAt(i));
		}

		return Integer.parseInt(result);
	}

//	5���� ������ �Է¹ް� �ִ񰪰� �ּڰ��� �����ִ� �޼ҵ�
//	int[] getMaxAndMin(int[] arData) {
//		int[] arResult = {arData[0], arData[0]};
//		for (int i = 1; i < arData.length; i++) {
//			if (arData[i] > arResult[0]) {
//				arResult[0] = arData[i];
//			}
//			if (arData[i] < arResult[1]) {
//				arResult[1] = arData[i];
//			}
//		}
//		return arResult;
//	}

//	5���� ������ �Է¹ް� �ִ񰪰� �ּڰ��� �����ִ� �޼ҵ�(void)
	void getMaxAndMin(int[] arData, int[] arResult) {
		for (int i = 1; i < arData.length; i++) {
			if (arData[i] > arResult[0]) {
				arResult[0] = arData[i];
			}
			if (arData[i] < arResult[1]) {
				arResult[1] = arData[i];
			}
		}
	}

//	String Ŭ������ indexOf()�޼ҵ� �����, ���ڿ� ��ü�� �˻��� ���ڸ� ���޹޴´�.
	int indexOf(String content, char c) {
		for (int i = 0; i < content.length(); i++) {
			if (c == content.charAt(i)) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		MethodTask methodTask = new MethodTask();
	
	}
}
