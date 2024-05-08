package ch12;

public class _03_Main {
	public static void main(String[] args) {
		
		Thread ThreadA = new Thread(new _03_MyRunnable("ThreadA"));
		ThreadA.start();
		
		System.out.println();
		
		Thread threadB = new Thread(new _03_MyRunnable("threadB"));
		threadB.start();
	}
}
