package test;

public class _06_SungjukMain {
	public static void main(String[] args) {
		// 국영수 점수, 합계, 평균, 학점 출력

		_06_Sungjuk js = new _06_Sungjuk();

		System.out.println("-- [ 방법1. 디폴트 생성자 호출 -> setter ] --");
		
		js.setKor(90);
		js.setEng(80);
		js.setMath(70);
		
		js.printInfo();

		System.out.println("-----------------------");
		
		_06_Sungjuk js2 = new _06_Sungjuk(70, 60, 50);
		System.out.println("-- [ 방법2. 매개변수 생성자로 값 전달 ] --");
		js2.printInfo();
	}
}
