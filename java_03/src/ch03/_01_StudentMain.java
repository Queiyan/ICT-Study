package ch03;

public class _01_StudentMain {
	public static void main(String[] args) {
		
		// [ 인스턴스(객체) 생성]
		// 클래스명 참조변수 = new 클래스명();
		// 참조변수에는 클래스의 주소값이 들어있다.	
		// 참조변수.멤버변수 = 값;		
		// 참조변수.멤버메서드()
		
		_01_Student st = new _01_Student();
		
		st.inInfo();
//		st.studentID = "S001";
//		st.name = "아이유";
//		st.email = "id@gmail.com";
		
		_01_Student iu = new _01_Student();
		st.studentID = "S001";
		st.name = "아이유";
		st.email = "id@gmail.com";
		st.age = 30;
		st.address = "아프리카";
		
		_01_Student kim = new _01_Student();
		st.studentID = "S002";
		st.name = "김준혁";
		st.email = "kgh8839@gmail.com";
		st.age = 25;
		st.address = "인천";
		
		
//		st.pritInfo();
		
		iu.printInfo();
		kim.printInfo();
		
		
	}
}
