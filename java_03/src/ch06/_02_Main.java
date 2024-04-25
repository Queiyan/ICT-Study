package ch06;

public class _02_Main {

	public static void main(String[] args) {

		_02_FireCar fire = new _02_FireCar("소방차", 2000);

		fire.carInfo();

		fire.water();

		_02_PolicCar polic = new _02_PolicCar("경찰차", 3000);

		polic.carInfo();

		polic.siren();

	}

}
