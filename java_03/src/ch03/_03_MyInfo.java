package ch03;

public class _03_MyInfo {

	// 멤버변수(속성)
	private String name; // 이름
	private String birthday; // 생일
	private int money; // 자산
	private String address; // 주소

	//    생성자
	public _03_MyInfo() {
		System.out.println("<< 기본생성자 >>");
	}
	
	public _03_MyInfo(String name, String birthday, int money, String address ) {
		System.out.println("<< 매개변수 생성자>> ");
		this.name = name;
		this.birthday = birthday;
		this.money = money;
		this.address = address;
	}
	
	// 멤버메서드(기능)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	// 출력정보
	public void showInfo() {
		System.out.println("===== getter() =====");
		System.out.println("이름 : " +  getName());
		System.out.println("생일 : " +  getBirthday());
		System.out.println("자산 : " +  getMoney());
		System.out.println("주소 : " +  getAddress());
	}
}
