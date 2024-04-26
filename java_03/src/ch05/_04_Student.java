package ch05;

public class _04_Student {
	private String studenID; 	// 학번 S001 S002 S003
	private String name; 		// 이름 홍길동 아이유 유재석
	private int age; 			// 나이 20   30   40

	// 디폴트 생성자
	public _04_Student() {

	}
	
	// 2. 매개변수 -> 3. 멤버변수
	public _04_Student(String studenID, String name, int age) {
		this.studenID = studenID;
		this.name = name;
		this.age = age;
	}
	
	// 멤버메서드
	// getter, setter
	public String getStudenID() {
		return studenID;
	}

	public void setStudenID(String studenID) {
		this.studenID = studenID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	// 멤버변수값 출력/
	public void printInfo() {
		System.out.println("학번 : " + studenID);
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}
}
