package ch06;

public class _04_Customer {

	// 멤버변수
	private int id; // 고객ID : 1001
	private String name; // 고객명 : 김태희
	private String grade; // 고객등급 : VIP
	private int money;

	// 디폴트 생성자
	public _04_Customer() {

	}

	// 매개변수 생성자
	public _04_Customer(int id, String name, String grade, int money) {
		this.id = id;
		this.name = name;
		this.grade = grade;
		this.money = money;
	}

	// 멤버메서드
	// getter, setter
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	// printInfo()
	public void printInfo() {
		System.out.println("고객ID : " + id);
		System.out.println("고객명 : " + name);
		System.out.println("고객등급 : " + grade);
		System.out.println("소지금액 : " + money+"(만원)");
	}
}
