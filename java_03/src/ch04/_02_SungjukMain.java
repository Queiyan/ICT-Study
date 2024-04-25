package ch04;

public class _02_SungjukMain {
	public static void main(String[] args) {
		
		// 국영수 점수, 합계 출력
		System.out.println("방법1. 디폴트 생성자 호출 -> setter로 값 전달");
		// 1-1. 디폴트 생성자 호출 -> setter -> 매개변수 -> 멤버변수
		
		// 객체생성
		_02_Sungjuk sj = new _02_Sungjuk();
		
		// 1-2. 참조변수. 멤버메서드
		sj.setKor(90);
		sj.setEng(80);
		sj.setMath(70);
		
		// printInfo()로 출력
		sj.printInfo();
		
		System.out.println("-------------------");
		System.out.println("-- [방법2. 매개변수 생성자로 값 전달] --");
		
		// getter로 출력
		System.out.println("국어 점수 : "+sj.getKor());
		System.out.println("영어 점수 : "+sj.getEng());
		System.out.println("수학 점수 : "+sj.getMath());
		System.out.println("합계 점수 : "+sj.getTotal());
		System.out.println("평균 점수 : "+sj.getAverage());
		
	}
}
