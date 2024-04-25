package ch07;

public class _04_Main {

	public static void main(String[] args) {
		
		// 다형성을 적용해 인스턴스 생성
		_04_TV sam = new _04_SansungTV();
		
		sam.turnOn();
		sam.turnOff();
		
	}

}
