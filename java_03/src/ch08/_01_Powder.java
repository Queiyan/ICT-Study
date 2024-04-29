package ch08;

// p292
public class _01_Powder { // extends Object // 생략
	public void doPrinting() {
		System.out.println("powder 재료로 출력합니다.");
	}
	
	// Object의 toString() 메서드는 재정의를 안하면 주소값이 출력된다.
	@Override // 생략
	public String toString() {
		return "재료는 powder 입니다.";
	}
}
