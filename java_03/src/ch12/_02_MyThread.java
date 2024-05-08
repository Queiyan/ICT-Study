package ch12;

// (2) Runnable 인터페이스를 구현하기 = run() 메서드를 오버라이드.
public class _02_MyThread implements Runnable{

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}
	}
	
}
