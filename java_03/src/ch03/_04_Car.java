package ch03;

public class _04_Car {
	// 멤버변수
	private String madein; // 스웨덴 한국
	private String brand;  // 볼보  제네시스
	private int price;     // 6000 100000000
	private String color;  // gray black

	// 생성자
	// 생성자 => new에 의해 호출된다. 클래스이름과 같고, 반환값이 없다.
	// 1-2. 기본생성자(디폴트생성자) => 인스턴스 생성시점에 호출 
	// => 생성자가 하나도 없을때 자바 컴파일러가 자동추가
	// 	매개변수 생성자가 존재시 컴파일러가 디폴트생성자를 자동추가하지 않으므로, 
	// 	개발자가 추가하지 않으면 컴파일 오류 발생
	
	// 디폴트 생성자
	public _04_Car() {
		
	}
	
	// 매개변수 생성자
	public _04_Car(String madein, String brand, int price, String color) {
		this.madein = madein;
		this.brand = brand;
		this.price = price;
		this.color = color;
	}
	
	// 멤버메서드 getter, setter
	public String getMadein() {
		return madein;
	}

	public void setMadein(String madein) {
		this.madein = madein;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	// printInfo()
	public void printInfo() {
		System.out.println("제조국: "+getMadein());
		System.out.println("제조사: "+getBrand());
		System.out.println("출고가: "+getPrice()+"(만원)");
		System.out.println("차량색: "+getColor());
	}

}
