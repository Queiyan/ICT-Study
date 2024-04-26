package ch07;

public class _08_InterfaceEx {
	public static void main(String[] args) {
//		A08 b08 = new B08();
//		b08.autoPlay(new B08());
//		A08 c08 = new C08();
//		c08.autoPlay(new B08());
		
		A08 ply = new A08();
		ply.autoPlay(new B08());
		ply.autoPlay(new C08());
	}
}

// 부모클래스
class A08 {
	public void autoPlay(I08 i08) { // 다형성 적용
		i08.play();
	}
}

interface I08 {
	public void play(); // 추상메서드
}

// 자식클래스 -i08 인터페이스 구현
class B08 implements I08 {

	@Override
	public void play() {
		System.out.println("B08 클래스 - play() 호출");
	}
	
}

// 자식클래스 -i08 인터페이스 구현
class C08 implements I08 {

	@Override
	public void play() {
		System.out.println("C08 클래스 - play() 호출");
	}
	
}