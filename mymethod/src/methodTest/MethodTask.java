package methodTest;

public class MethodTask {
//	1~10까지 println()으로 출력하는 메소드
	void printFrom1To10() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i + 1);
		}
	}

//	"홍길동"을 n번 println()으로 출력하는 메소드
	void printHong(int count) {
		for (int i = 0; i < count; i++) {
			System.out.println("홍길동");
		}
	}

//	이름을 n번 println()으로 출력하는 메소드
	void printName(String name, int count) {
		for (int i = 0; i < count; i++) {
			System.out.println(name);
		}
	}

//	세 정수를 뺄셈해주는 메소드
	int sub(int a, int b, int c) {
		return a - b - c;
	}

//	두 정수의 나눗셈 후 몫과 나머지 두 개를 구하는 메소드
	int[] getResultByDivision(int number1, int number2) {
		return new int[] { number1 / number2, number1 % number2 };
	}

//	1~n까지의 합을 구해주는 메소드
	int getTotalFrom1(int end) {
		int result = 0;
		for (int i = 0; i < end; i++) {
			result += i + 1;
		}
		return result;
	}

//	홀수를 짝수로, 짝수를 홀수로 바꿔주는 메소드
	int change(int number) {
		return ++number;
	}

//	문자열을 입력받고 소문자는 대문자로, 대문자는 소문자로 바꿔주는 메소드
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

//	문자열을 입력받고 원하는 문자를 개수를 구해주는 메소드
	int getCountOfCharacterInContent(String content, char character) {
		int count = 0;
		for (int i = 0; i < content.length(); i++) {
			if (content.charAt(i) == character) {
				count++;
			}
		}
		return count;
	}

//	5개의 정수를 입력받은 후 원하는 인덱스의 값을 구해주는 메소드
	int getValueInArray(int[] arData, int index) {
		return arData[index];
	}

//	한글을 정수로 바꿔주는 메소드(일공이사 -> 1024)
	int changeToInteger(String data) {
		String hangeul = "공일이삼사오육칠팔구";
		String result = "";

		for (int i = 0; i < data.length(); i++) {
			result += hangeul.indexOf(data.charAt(i));
		}

		return Integer.parseInt(result);
	}

//	5개의 정수를 입력받고 최댓값과 최솟값을 구해주는 메소드
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

//	5개의 정수를 입력받고 최댓값과 최솟값을 구해주는 메소드(void)
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

//	String 클래스의 indexOf()메소드 만들기, 문자열 전체와 검색할 문자를 전달받는다.
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
