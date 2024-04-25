package test;

public class _07_Client {
	// 멤버변수
	private int id; // 고객ID : 1001 1002
	private String name; // 고객명 : 김태희 블랙
	private String grade; // 고객등급 : vip black

	// 디폴트 생성자
	public _07_Client() {

	}

	// 매개변수 생성자
	public _07_Client(int id, String name, String grade) {
		this.id = id;
		this.name = name;
		this.grade = grade;
	}

	// 멤버 메서드(getter,setter)
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

	public void showInfo() {
		System.out.println("고객ID : " + id);
		System.out.println("고객명 : " + name);
		System.out.println("고객등급 : " + grade);
	}
}