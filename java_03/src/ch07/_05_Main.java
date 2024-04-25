package ch07;

public class _05_Main {

	public static void main(String[] args) {

		System.out.println("<< 방법1. 다형성 적용, 부모는 인터페이스 >>");

		System.out.println("<_06_MP3 타입 선언시>");

		_05_MP3 mp3 = new _05_SmartPhone();
		
		_05_SmartPhone mp3Phone = (_05_SmartPhone) mp3;
		
		mp3.play();
		mp3.stop();
		mp3Phone.sendSMS();
		mp3Phone.receiveSMS();
		System.out.println("cal : " + ((_05_SmartPhone) mp3).calculate(32, 4));

		System.out.println("<_06_Mobile 타입 선언시>");

		_05_Mobile mobile = new _05_SmartPhone();
		
		_05_SmartPhone Mphone = (_05_SmartPhone) mobile;

		mobile.sendSMS();
		mobile.receiveSMS();
		Mphone.play();
		Mphone.stop();
		System.out.println("cal : " + ((_05_SmartPhone) mobile).calculate(12, 6));

		System.out.println("<< 방법2. 다형성 적용, 부모는 클래스 >>");

		_05_PDA pda = new _05_SmartPhone();
		
		_05_SmartPhone galaxy = (_05_SmartPhone) pda;

		galaxy.sendSMS();
		galaxy.receiveSMS();
		galaxy.play();
		galaxy.stop();
		System.out.println("cal : " + galaxy.calculate(25, 5));

	}

}
