package ch13;

// p458 익명 내부클래스

class Outer2 {
	
	// 방법1. 메서드 내부에서 인터페이스 구현
	 Runnable getRunnable(int i) {
		 int num = 100;
		 
		 return new Runnable() {
			 @Override
			 public void run() {
				 System.out.println(i);
				 System.out.println(num);
			 }
		 };
	 }
	// 방법2. 익명내부클래스를 생성해서 변수에 대입
	 Runnable runner = new Runnable() {
		@Override
		public void run() {
			System.out.println("Runnable이 구현된 익명 클래스 변수");
		}
	 };
}

public class _04_Outer2{
	public static void main(String[] args) {
		Outer2 out = new Outer2();
		Runnable runnerble = out.getRunnable(10);
		runnerble.run();
		out.runner.run();
		
	}
}