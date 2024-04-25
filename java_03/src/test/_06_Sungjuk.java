package test;

public class _06_Sungjuk {

	private int kor;
	private int eng;
	private int math;
	
	// 생성자 오버로드 => 메서드나 생성자의 매개변수 갯수가 다르거나, 
	//	매개변수 타입이 다른 경우를 말하며,리턴타입은 무관한다.
	// 디폴트 생성자
	public _06_Sungjuk() {

	}

	// 매개변수 생성자
	public _06_Sungjuk(int kor, int eng, int math) {
		System.out.println("-----매개변수 생성자-----");
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

	// 합계, 평균, 학점

	public int getTotal() {
		return kor + eng + math;
	}

	public int getAvg() {
		return (kor + eng + math) / 3;
	}

	public char getGrade() {
		char result;
		
		if(getAvg()>100 || getAvg()<0) {
			result = 'w';
			System.out.println("잘못된 점수 입니다.");
			return result;
		}else
		result = (getAvg() >= 90) ? 'A'
				: (getAvg() >= 80) ? 'B' : (getAvg() >= 70) ? 'C' : (getAvg() >= 50) ? 'D' : 'F';
		return result;

	}

	public void printInfo() {
		System.out.println("국어 : " + getKor());
		System.out.println("영어 : " + getEng());
		System.out.println("수학 : " + getMath());
		System.out.println("합계 : " + getTotal());
		System.out.println("평균 : " + getAvg());
		System.out.println("학점 : " + getGrade());
	}
}