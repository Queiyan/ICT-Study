package ch11;

// p358
// == : ==> 물리적주소 비교
// equals() => Streing 클래스와 Integer 클래스에는 equals() 메서드가 이미 재정의되어 있으므로 값 비교시 true
public class _05_StringEquals {
	public static void main(String[] args) {
		 _04_Student studentLee = new _04_Student(100, "이상원");
		 _04_Student studentLee2 = studentLee;
		 _04_Student studentSang = new _04_Student(100, "이상원");
		
		if (studentLee == studentLee2) 
			System.out.println("studentLee와 studentLee2의 주소는 같습니다.");
		else 
			System.out.println("studentLee와 studentLee2의 주소는 다릅니다.");
		
		if (studentLee.equals(studentLee2)) 
			System.out.println("studentLee와 studentLee2는 동일합니다.");
		else 
			System.out.println("studentLee와 studentLee2는 동일하지 않습니다.");
		
		if (studentLee == studentSang) 
			System.out.println("studentLee와 studentSang의 주소는 같습니다.");
		else 
			System.out.println("studentLee와 studentSang의 주소는 다릅니다.");
		
		if (studentLee.equals(studentSang)) 
			System.out.println("studentLee와 studentSang는 동일합니다.");
		else 
			System.out.println("studentLee와 studentSang는 동일하지 않습니다.");
	}
}
