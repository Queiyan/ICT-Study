package test;

public class _05_MyInfo {
	/*
	 * 설계도, 객체 구성:
	 */

	private String name;
	private String birtday;
	private int money;
	private String address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirtday() {
		return birtday;
	}

	public void setBirtday(String birtday) {
		this.birtday = birtday;
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

	public void showInfo() {
		System.out.println("저의 이름은 " + getName() + " 입니다.");
		System.out.println("저의 생일은 " + getBirtday() + " 입니다.");
		System.out.println("저의 희망연봉은 " + getMoney() + "(만원) 입니다.");
		System.out.println("저의 주소는 " + getAddress() + " 입니다.");
	}
}
