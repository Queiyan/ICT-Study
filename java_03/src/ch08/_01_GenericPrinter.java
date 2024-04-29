package ch08;

// 제네릭 클래스
public class _01_GenericPrinter<T> {
	// 멤버변수
	private T material; // T는 자료형(Type), material은 참조변수
	
	// 멤버메서드
	public void setMaterial(T material) {
		this.material = material;
	}
	
	public T getMaterial() {
		return material;
	}
	
	public String toString() {
		return material.toString();
	}
}
