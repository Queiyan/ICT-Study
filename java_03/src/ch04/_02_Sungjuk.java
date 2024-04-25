package ch04;

public class _02_Sungjuk {
	private int kor;
	private int eng;
	private int math;

	// 디폴트 생성자
	public _02_Sungjuk() {

	}
	// 매개변수 생성자
	public _02_Sungjuk(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	// getter, setter
	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}
	
	public int getTotal() {
		return kor + eng + math;
	}
	
	public double getAverage() {
		return (kor + eng + math)/3;
	}
	
	public void printInfo() {
		System.out.println("국어 점수 : "+getKor());
		System.out.println("영어 점수 : "+getEng());
		System.out.println("수학 점수 : "+getMath());
		System.out.println("합계 점수 : "+getTotal());
		System.out.println("평균 점수 : "+getAverage());
	}
}
