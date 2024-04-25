package ch01;

public class _05_VariableEx {
	public static void main(String[] arg) {
		  /*
	       * 상수 : 프로그램이 실행되는 동안, 값이 변하지 않는 수 또는 변경 불가능한 수
	       *       주로 대문자 사용(변수는 소문자)
	       *       만약 값을 변경해야 할 경우, 상수를 선언한 곳의 값만 변경하면 된다.
	       *       
	       * 문법 : final 자료형 변수명;  예) final double PI = 3.14;
	       *     1) 변수(상수) : 변수에 값 변경불가
	       *     2) 메서드 : 재정의 불가
	       *     3) 클래스 : 상속 불가     
	       */
		
		final double PI = 3.14;
		System.out.println("PI => " + PI);
		
		// PI = 2.3; // 오류 : PI는 상수이므로 변경불가
		
		double value = 0.7;
		double result = PI * value;
		System.out.println("result : " + result);
		
		System.out.println();
		// 상수(MY_NAME, MY_AGE, MY_EMAIL, MY_ADDRESS)로 내정보 출력
		
		final String MY_NAME = "김준혁";
		final int MY_AGE = 25;
		final String MY_EMAIL = "kgh8839@gmail.com";
		final String MY_ADDRESS = "인천광역시 미추홀구 주안동";
		
		System.out.println("나의 이름은 " + MY_NAME+ " 입니다.");
		System.out.println("나의 나이는 " + MY_AGE+ "살 입니다.");
		System.out.println("나의 이메일은 " + MY_EMAIL+ " 입니다.");
		System.out.println("나의 주소는 " + MY_ADDRESS+ " 입니다.");
		
	}
}
