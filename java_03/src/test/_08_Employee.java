package test;

// 부모클래스(공통)
public class _08_Employee {
	
	// 멤버변수
	private String sabun;      // 사번 E001 E002
	private String name;       // 이름 아이유  김태희
	private String deptName; // 부서명 엔터네이먼트 IT
	private int salary;       // 급여  100000  500000

	// 디폴트 생성자
	public _08_Employee(){

	}

	// 매개변수 생성자
	public _08_Employee(String sabun, String name, String deptName, int salary){
		this.sabun = sabun;
		this.name = name;
		this.deptName = deptName;
		this.salary = salary;
	}

	// 멤버메서드
	// getter, setter
	public void setSabun(String sabun){
		this.sabun = sabun;
	}
	public String getSabun(){
		return sabun;
	}

	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}

	public void setDeptName(String deptName){
		this.deptName = deptName;
	}
	public String getDeptName(){
		return deptName;
	}

	public void setSalary(int salary){
		this.salary = salary;
	}
	public int getSalary(){
		return salary;
	}

	//printInfo()로 출력
	public void printInfo(){
		System.out.println("사번 : "+ sabun);
		System.out.println("이름 : "+ name);
		System.out.println("부서명 : "+ deptName);
		System.out.println("급여 : "+ salary);
	}
}