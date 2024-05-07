package test;

public class _14_Main {
	public static void main(String[] args) {

		System.out.println("<< Manager 정보 >>");
		System.out.println("--- 방법1. setter로 값 전달");

		_14_Manager mg = new _14_Manager();
		mg.setSabun("E001");
		mg.setName("아이유");
		mg.setDeptName("엔터테이먼트");
		mg.setSalary(100000);

		mg.setBonus(10000);

		mg.printInfo();
		System.out.println();
		System.out.println("--- 방법2. 자식 매개변수 생성자로 값 전달");

		_14_Employee mg2 = new _14_Manager("E001", "아이유", "엔터테이먼트", 100000, 10000);

		mg2.printInfo();
		System.out.println();
		System.out.println("<< Sawon 정보 >>");
		System.out.println("--- 방법1. setter로 값 전달");

		_14_Sawon sw = new _14_Sawon();

		sw.setSabun("E002");
		sw.setName("김태희");
		sw.setDeptName("IT");
		sw.setSalary(500000);

		sw.setSudang(20000);

		sw.printInfo();
		System.out.println();
		System.out.println("--- 방법2. 자식 매개변수 생성자로 값 전달");

		_14_Employee sw2 = new _14_Sawon("E002", "김태희", "IT", 500000, 20000);

		sw2.printInfo();
		
	}

}