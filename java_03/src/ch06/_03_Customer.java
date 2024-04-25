package ch06;

public class _03_Customer {

	// 멤버변수
	private int id;  			// 고객ID : 1001
	private String name;		// 고객명 : 김태희
	private String grade;		// 고객등급 : VIP
	
	// 디폴트 생성자
	public _03_Customer() {
		
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
	
	// printInfo()
	public void printInfo(){
		System.out.println("고객ID : "+id);
		System.out.println("고객명 : "+name);
		System.out.println("고객등급 : "+grade);
	}
}
