package ch07;

public class _04_SansungTV implements _04_TV {

	@Override
	public void turnOn() {
		System.out.println(_04_TV.BRAND + "tv를 켜다");
	}

	@Override
	public void turnOff() {
		System.out.println(_04_TV.BRAND + "tv를 끄다");
	}

}
