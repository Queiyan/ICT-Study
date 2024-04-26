package ch07;

public class _07_InterfaceEx {
	public static void main(String[] args) {
		First f = new First();
		f.method1(new Second());
		
	}
}

class First {
	public void method1(Second second) { // 클래스명 참조변수
		System.out.println("First 클래스 - method1()");
		second.method2(new Third());
	}
}

class Second {
	public void method2(Third third) {
		System.out.println("Second 클래스 - method2()");
		third.method3();
	}
}

class Third {
	public void method3() {
		System.out.println("Third 클래스 - method3()");
	}
}

/*
 * First 클래스 - method1() Second 클래스 - method2() Third 클래스 - method3()
 */
