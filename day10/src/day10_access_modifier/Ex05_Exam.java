package day10_access_modifier;

class Exam{
	
	// Field
	private String examName;
	private int kor, eng, math;
	private double average;
	private char grade;
	
	// Constructor
	// Source 메뉴로 자동생성
	public Exam(String examName, int kor, int eng, int math) {
		super();					// java.lang.Object 클래스를 의미한다(생략가능)
		this.examName = examName;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		setAverage(kor, eng, math);
		setGrade();
	}

	// Method(Getters and Setters)
	public double getAverage() {
		setAverage(kor, eng, math);
		return average;
	}

	private void setAverage(int kor, int eng, int math) {
		this.average = (kor + eng + math) / 3.0;
	}

	public char getGrade() {
		return grade;
	}

	private void setGrade() {
		if(this.average >= 90) grade = 'A';
		else if(this.average >= 80) grade = 'B';
		else if(this.average >= 70) grade = 'C';
		else if(this.average >= 60) grade = 'D';
		else grade = 'F';
	}
	
}

public class Ex05_Exam {
	public static void main(String[] args) {
		
		Exam exam = new Exam("중간고사", 60, 61, 62);
		
		System.out.println("평균 : " + exam.getAverage() + "점");
		System.out.println("학점 : " + exam.getGrade() + "학점");
		
		
	}
}
