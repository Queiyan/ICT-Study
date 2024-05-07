package ch11;

// p367
public class _07_Circle implements Cloneable{ // 마커 인터페이스
	// 멤버변수
	_07_Point point;
	int radius; // 20
	
	// 생성자
	public _07_Circle() {

	}

	public _07_Circle(int x, int y, int radius) {
		point = new _07_Point(x, y);
		this.radius = radius;
	}
	
	@Override
	public String toString() {
		return "원점은 " + point.toString() + ", 반지름은 = " + radius;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
