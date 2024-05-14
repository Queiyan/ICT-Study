package test;

public class _17_Sungjuk {

	private int kor; // 90
	private int eng; // 80
	private int math; // 70

	// 생성자, getter setter, toString()
	public _17_Sungjuk() {

	}

	public _17_Sungjuk(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getKor() {
		return kor;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getEng() {
		return eng;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getMath() {
		return math;
	}

	public int getTotal() {
		int total = kor + eng + math;
		return total;
	}

	public double getAvg() {
		double avg = getTotal() / 3;
		return avg;
	}

	public char getGrade() {
		char grade;
		int avg = (int) getAvg();
		grade = (avg >= 90) ? 'A' : (avg >= 80) ? 'B' : (avg >= 70) ? 'C' : (avg >= 60) ? 'D' : 'F';
		return grade;
	}

	public String toString() {
		return "국어 : " + kor + " 영어 : " + eng + " 수학 : " + math + "\n총점 : " + getTotal() + " 평균 : " + getAvg()
				+ " 학점 : " + getGrade();
	}
}