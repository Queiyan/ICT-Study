package ch07;

public class _02_Main {

	public static void main(String[] args) {
		System.out.println("=== 자율 주행하는 자동차 ===");
		_02_Car myCar = new _02_AICar();
		myCar.run();
		
		System.out.println("=== 사람이 운전하는 자동차 ===");
		_02_Car hisCar = new _02_ManualCar();
		hisCar.run();
	}

}
