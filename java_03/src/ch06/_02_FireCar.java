package ch06;

public class _02_FireCar extends _02_Car {

	// 디폴트 생성자
	public _02_FireCar() {

	}
	
	public _02_FireCar(String kind, int speed) {
		this.kind = kind;
		this.speed = speed;
	}
	
	// 멤버메서드
	public void water() {
		System.out.println("물을 뿌리다. ~~");
	}

}
