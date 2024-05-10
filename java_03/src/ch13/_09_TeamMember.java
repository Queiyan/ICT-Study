package ch13;

// p481
public class _09_TeamMember {
	private String name;
	private int age;
	private String bloodType;
	private String hobby;
	private String mbti;
	private int salary;
	
	public _09_TeamMember() {
		
	}
	
	public _09_TeamMember(String name, int age, String bloodType, String hobby, String mbti, int salary) {
		this.name = name;
		this.age = age;
		this.bloodType = bloodType;
		this.hobby = hobby;
		this.mbti = mbti;
		this.salary = salary;
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

	public String getBloodType() {
		return bloodType;
	}

	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public String getMbti() {
		return mbti;
	}

	public void setMbti(String mbti) {
		this.mbti = mbti;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int price) {
		this.salary = price;
	}

	public String toString() {
		return "이름 : " + name + " 나이 : " + age + " 혈액형 : " + bloodType 
				+ " 취미 : " + hobby + " mbti : " + mbti + " 희망초봉 : " + salary ;
	}
}
