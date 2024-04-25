package ch06;

public class _05_EmpMain {
	public static void main(String[] args){
		System.out.println("<< Manager 정보 >>");
		System.out.println("--- 방법1. setter로 값 전달");
				
		_05_Manager mg = new _05_Manager();

		mg.setSabun("E001");
		mg.setName("아이유");
		mg.setDeptName("엔터테이먼트");
		mg.setSalary(100000);
		mg.setBonus(1000);

		mg.printInfo();

		System.out.println("--- 방법2. 자식 매개변수 생성자로 값 전달");

		_05_Employee mg2 = new _05_Manager("E001", "아이유", "엔터테이먼트", 100000, 1000);

		mg2.printInfo();

		System.out.println("<< Sawon 정보 >>");
		System.out.println("--- 방법1. setter로 값 전달");

		_05_Sawon sw = new _05_Sawon();

		sw.setSabun("E002");
		sw.setName("김태희");
		sw.setDeptName("IT");
		sw.setSalary(500000);
		sw.setSudang(5000);

		sw.printInfo();

		System.out.println("--- 방법2. 자식 매개변수 생성자로 값 전달");

		_05_Employee sw2 = new _05_Sawon("E002", "김태희", "IT", 500000, 5000);

		sw2.printInfo();
	}
}

