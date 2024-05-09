package ch13;

// p455
public class _03_Main {
	public static void main(String[] args) {
		_03_Outer out = new _03_Outer();
		Runnable runner = out.getRunnable(10);
		runner.run();
	}
}
