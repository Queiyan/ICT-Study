package test;

// 배열을 이용하여 3명의 사원정보를 출력하세요
public class _10_Main {
	public static void main(String[] args){
		
		_10_Employee[] member = new _10_Employee[3];

		member[0] = new _10_Employee("E001", "아이유", "Ent", 100000);
		member[1] = new _10_Employee("E002", "김태희", "IT", 500000);
		member[2] = new _10_Employee("E003", "장원영", "스타쉽", 800000);
		
		// 향상된 for문
		for(_10_Employee asd : member){
			System.out.println();
			asd.printInfo();
		}
		
	}
}