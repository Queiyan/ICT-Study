package ch06;


// 부모클래스(공통)
public class _01_Animal {
	
	// 멤버변수
	protected String kind;   // 종류  고양이 	 강아지
	protected int legs;	   // 다리  4    	 4	
	protected String color;  // 털색  brown	 white
	
	// 디폴트 생성자
	public _01_Animal() {
		System.out.println("<<< 부모클래스 디폴트 생성자 >>>");
	}
	
	// 멤버메서드
	// getter, setter
	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	// printInfo()
	
	public void printInfo() {
		System.out.println("종류 : " + getKind());
		System.out.println("다리 : " + getLegs()+ "개");
		System.out.println("종류 : " + getColor());
	}
}
