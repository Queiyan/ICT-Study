package ch11;

public class _10_WrapperClass {
	public static void main(String[] args) {
		// p375 Wrapper 클래스
		
		// 언박싱 : Integer 객체 -> int 자료형
		Integer iVal = new Integer(100);
		
		// 참조변수.intValue()
		int myValue = iVal.intValue();
		
		// 오토박싱 : int 기본형 -> Integer 객체
		// Integer.valueOf(값)
		Integer num1 = Integer.valueOf("100");
		Integer num2 = Integer.valueOf(100);
		
		// 문자 -> 숫자
		// Integer.parseInt("숫자"); => 중요
		int num = Integer.parseInt("400");
		System.out.println("num : " + num);
	}
}
