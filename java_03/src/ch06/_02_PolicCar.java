package ch06;

public class _02_PolicCar extends _02_Car {
	// 디폴트 생성자
	public _02_PolicCar() {

	}
	
	public _02_PolicCar(String kind, int speed) {
		this.kind = kind;
		this.speed = speed;
	}

	public void siren() {
		System.out.println("사이렌을 울리다. ~~");
	}
}
