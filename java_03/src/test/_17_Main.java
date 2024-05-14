package test;

public class _17_Main {
	public static void main(String[] args){

		System.out.println("-- [ 방법1. 디폴트 생성자 호출 -> setter -> 매개변수 -> ] -- ");

		_17_Sungjuk lee = new _17_Sungjuk();

		lee.setKor(90);
		lee.setEng(80);
		lee.setMath(70);

		System.out.println("-- [ 방법2. 매개변수 생성자로 값전달 ] --");

		_17_Sungjuk kim = new _17_Sungjuk(90, 80, 70);

		System.out.println(lee);
		System.out.println();
		System.out.println(kim);
	}
}