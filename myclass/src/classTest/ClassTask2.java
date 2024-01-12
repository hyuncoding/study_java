package classTest;

class Student {

	int number;
	int koreanScore;
	int englishScore;
	int mathScore;
	int scoreSum;
	double average;
	
	
	public Student() { ; }
	
	public Student(int number, int koreanScore, int englishScore, int mathScore) {
		this.number = number;
		this.koreanScore = koreanScore;
		this.englishScore = englishScore;
		this.mathScore = mathScore;
		this.scoreSum = koreanScore + englishScore + mathScore;
		this.average = Double.parseDouble(String.format("%.3f", scoreSum / 3.0));
	}
	
	int getSum() {
		return scoreSum;
	}
	
	double getAverage() {
		return average;
	}	
}

public class ClassTask2 {
	public static void main(String[] args) {
		
		Student student1 = new Student(1, 90, 80, 68);
		System.out.println("��ȣ : " + student1.number);
		System.out.println("���� ���� : " + student1.koreanScore);
		System.out.println("���� ���� : " + student1.englishScore);
		System.out.println("���� ���� : " + student1.mathScore);
		
		System.out.println("���� : " + student1.getSum());
		System.out.println("��� : " + student1.getAverage());
		
	}
}
