package ch05;

public class _04_Main {
	public static void main(String[] args) {
		
		// 3건 출력 : 매개변수생성자 => 멤버변수 초기화 => printInfo() 출력
		
		_04_Student[] stInfo = new _04_Student[3];
		
		stInfo[0] = new _04_Student("S001", "홍길동", 20);
		stInfo[1] = new _04_Student("S002", "아이유", 30);
		stInfo[2] = new _04_Student("S003", "유재석", 40);
		
		for (int i = 0; i < stInfo.length; i++) {
			System.out.println();
			stInfo[i].printInfo();
		}
		
	}
}
