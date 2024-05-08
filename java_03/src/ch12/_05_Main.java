package ch12;

public class _05_Main {
	public static void main(String[] args) {
		// 객체5개, 쓰레드 5개
		Thread local1 = new Thread(new _05_VoreThread(), "서울");
		Thread local2 = new Thread(new _05_VoreThread(), "광주");
		Thread local3 = new Thread(new _05_VoreThread(), "부산");
		Thread local4 = new Thread(new _05_VoreThread(), "제주도");
		Thread local5 = new Thread(new _05_VoreThread(), "부산");
		
		
		local1.start();
		local2.start();
		local3.start();
		local4.start();
		local5.start();
		
	}
}
