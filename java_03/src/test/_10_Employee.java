package test;

public class _10_Employee {
	private String sabun;	    // 사번	 E001       E002
	private String name;	    // 이름	 아이유    김태희
	private String deptName;	// 부서명  Ent         IT
	private int salary;		    // 급여    1000000   500000

	// 디폴트 생성자
	public _10_Employee() {

	}

	// 매개변수 생성자
	public _10_Employee(String sabun, String name, String deptName, int salary) {
		this.sabun = sabun;
		this.name = name;
		this.deptName = deptName;
		this.salary = salary;
	}

	// 멤버 메서드
	// getter, setter
	public String getSabun(){
		return sabun;
	}
	public void setSabun(String sabun){
		this.sabun = sabun;
	}

	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}

	public String getDeptName(){
		return deptName;
	}
	public void setDeptName(String deptName){
		this.deptName = deptName;
	}

	public int getSalary(){
		return salary;
	}
	public void setSalary(int salary){
		this.salary = salary;
	}

	// printInfo()로 출력
	public void printInfo(){
		System.out.println("사번 : " + sabun);
		System.out.println("이름 : "+ name);
		System.out.println("부서명 : " + deptName);
		System.out.println("급여 : " + salary);
	}
}