package Test;

class Score{
	// Field
	private int kor;
	private int eng;
	private int mat;
	
	// Constructor
	public Score(int kor, int eng, int mat) {
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}

	// Method
	@Override
	public String toString() {
		return "국어 : " + kor + ", 영어 : " + eng + ", 수학 : " + mat;
	}

	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(obj instanceof Score) {
			Score scoreObj = (Score)obj;
			if(kor == scoreObj.kor && eng == scoreObj.eng && mat == scoreObj.mat) {
				return true;
			} else {
				return false;
			}
			// -> return kor == scoreObj.kor && eng == scoreObj.eng && mat == scoreObj.mat;
		}
		return false;
	}
}


public class Test05 {
//	Test05.java
//	Score 클래스	필드 : int kor, eng, mat
//					메소드 : toString(), equals()
//	Score 인스턴스를 2개 생성하고, 동등 비교(세 과목이 모두 같으면 동등) 결과 출력
//	각 인스턴스 정보는 toString 메소드를 통해 출력
	public static void main(String[] args) {
		
		Score score1 = new Score(50, 30, 80);
		Score score2 = new Score(50, 30, 80);
		
		if(score1.equals(score2)) {
			System.out.println("같은 점수입니다.");
		} else {
			System.out.println("다른 점수입니다.");
		}
		System.out.println("첫 번째 학생의 점수 : " + score1.toString());
		System.out.println("두 번째 학생의 점수 : " + score2.toString());
	}
}
