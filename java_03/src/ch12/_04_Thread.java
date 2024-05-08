package ch12;

public class _04_Thread {
	public static void main(String[] args) {
		System.out.print("현재 사용되고 있는 쓰레드명 : "); //main
		System.out.println(Thread.currentThread().getName());
		System.out.print("쓰레드의 최소 우선순위 값 : "); // 1
		System.out.println(Thread.MIN_PRIORITY);
		System.out.print("쓰레드의 최소 우선순위 값 : "); // 10
		System.out.println(Thread.MAX_PRIORITY);
		System.out.print("쓰레드의 최소 우선순위 값 : "); // 5
		System.out.println(Thread.NORM_PRIORITY);
		System.out.print("현재 수행되고 있는 쓰레드의 우선 순위 값 : "); //5
		System.out.println(Thread.currentThread().getPriority());
	}
}
