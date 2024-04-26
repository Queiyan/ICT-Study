package ch07;

public class _09_InterfaceEx {
	public static void main(String[] args) {
		// methodA() 호출
		A09 a09 = new A09();
		a09.methodA();
	}
}

class A09 {
	public void methodA() {
		I09 i09 = InstanceManager.getInstance();
		i09.methodB();
	}
}

interface I09 {
	public void methodB();
}

class B09 implements I09{

	public B09() {
		System.out.println("B09 디폴트 생성자 호출");
	}
	
	@Override
	public void methodB() {
		System.out.println("B09 클래스 - methodB()");
	}
}

class InstanceManager {
	public static B09 getInstance() {
		return new B09();
	}
}