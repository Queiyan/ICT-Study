package ch06;

// 부모클래스
public class _02_Car {
	
	// 멤버변수
	protected String kind;     // 소방차   경찰차
	protected int speed;		 // 2000   3000
	
	// 디폴트 생성자
	public _02_Car() {
		
	}
	
	// 매개변수 생성자
	public _02_Car(String kind, int speed) {
		this.kind = kind;
		this.speed = speed;
	}
	
	// 멤버변수
	// getter, setter
	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	// 출력 : carInfo()
	public void carInfo() {
		System.out.println("차종 : "+kind);
		System.out.println("속도 : "+speed);
	}
}
