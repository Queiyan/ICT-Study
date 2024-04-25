package ch07;

public class _03_Main {
	public static void main(String[] args) {
		int num1 = 8;
		int num2 = 4;
		
		// 다형성 적용하여 인스턴스 생성
		_03_Calc cal = new _03_Calculator();
		
		// 재정의된 메서드 호출하여 출력
		System.out.println("num1 + num2 = "+cal.add(num1, num2));
		System.out.println("num1 - num2 = "+cal.substract(num1, num2));
		System.out.println("num1 * num2 = "+cal.time(num1, num2));
		System.out.println("num1 / num2 = "+cal.divide(num1, num2));
	}
}
