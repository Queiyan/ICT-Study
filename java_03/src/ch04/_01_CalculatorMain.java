package ch04;

import java.util.Scanner;

public class _01_CalculatorMain {
	public static void main(String[] args) {
		// 객체생성 : 클래스명 참조변수 = new 클래스명();

		Scanner sc = new Scanner(System.in);

		_01_Calculator cal = new _01_Calculator();
		
		System.out.println("숫자를 입력하세요 : ");
		double i = sc.nextDouble();
		System.out.println("다음 숫자를 입력하세요 : ");
		double j = sc.nextDouble();
		
		System.out.println("덧셈 : " + cal.add(i, j));
		System.out.println("뺄셈 : " + cal.sub(i, j));
		System.out.println("곱셈 : " + cal.mul(i, j));
		System.out.println("나눗셈 : " + cal.div(i, j));
		sc.close();
	}
}
