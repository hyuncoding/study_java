package day08_object_array;

import java.text.DecimalFormat;
import java.util.Arrays;

// 데이터 클래스 Student
class Student{
	
	// Field
	String name;
	String school;
	int[] score;
	double average;
	boolean isPass;
	
	// Constructor
	Student(String name, String school){
		this.name = name;
		this.school = school;
	}
	
	// Method
	void doExam() {
		score = new int[3];
		for(int i = 0; i < score.length; i++) {
			score[i] = (int)(Math.random() * 101);
		}
		average = getAverage();
		isPass = getPass();
	}
	
	boolean getPass() { return average >= 50; }
	
	double getAverage() {
		int total = 0;
		for(int i = 0; i < score.length; i++) {
			total += score[i];
		}
		return (double)(total / score.length);
	}
	
	void printStudent() {
		DecimalFormat df = new DecimalFormat("#.##");	// 0.00은 무조건 2자리 맞춤 (ex. 0.50), #으로 하면 0.5가 됨. 두 자리를 넘어갔냐의 여부만 신경 씀.
		System.out.println("학생 이름 : " + name + "(" + school + ")");
		System.out.println("성적 : " + Arrays.toString(score) + ", 평균 : " + df.format(average) + "(" + (isPass ? "합격" : "불합격") + ")");
	}
}

// 데이터 클래스 Lecture
class Lecture{
	
	// Field
	String lectureName;
	Student[] students;
	int idx;
	
	// Constructor
	Lecture(String lectureName, int count){
		this.lectureName = lectureName;
		students = new Student[count];
	}
	
	// Method
	void addStudent(Student stu) { students[idx++] = stu; }
	
	void doExam() {
		for(int i = 0; i < idx; i++) {
			students[i].doExam();
		}
	}
	
	double getLectureAverage() {
		double total = 0;
		for(int i = 0; i < idx; i++) {
			total += students[i].getAverage();
		}
		return total / idx;
	}
	
	void printLecture() {
		System.out.println("강의명 : " + lectureName);
		System.out.println("강의 평균 : " + new DecimalFormat("0.00").format(getLectureAverage()) + "점");
		System.out.println();
		for(int i = 0; i < idx; i++) {
			System.out.println((i+1) + "번 학생--------------------");
			students[i].printStudent();
			System.out.println();
		}
	}
}

// 메인 클래스
public class Ex02_Student {
	public static void main(String[] args) {
		
		final int CAPACITY = 3;
		Lecture lecture = new Lecture("자바1", CAPACITY);
		
		String[] name = {"도윤", "다윤", "동형"};
		String[] school = {"서강", "연세", "홍익"};
		
		for(int i = 0; i < CAPACITY; i++) {
			lecture.addStudent(new Student(name[i], school[i]));
		}
		
		// 학생 시험 응시
		lecture.doExam();
		
		// 강의 정보 출력
		lecture.printLecture();
		
		
	}
}
