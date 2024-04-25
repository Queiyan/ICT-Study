package ch06;

public class _01_Main {
	public static void main(String[] args) {
		// 객체생성
		// 클래스명 참조변수 = new 클래스();
		_01_Cat kiti = new _01_Cat();
		
		kiti.kind = "고양이";
		kiti.legs = 4;
		kiti.color = "brown";
		
		kiti.printInfo();
		
		kiti.cry();
		
		System.out.println("=========");
		
		_01_Dog pupi = new _01_Dog();
		
		pupi.setKind("강아지");
		pupi.setLegs(4);
		pupi.setColor("white");
		
		pupi.printInfo();
		
		pupi.cry();
	}
}
