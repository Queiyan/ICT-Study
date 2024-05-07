package ch11;

// p359 
public class _04_BookMain {
	 public static void main(String[] args) {
		 _04_Student studentLee = new _04_Student(100, "이상원");

		 _04_Student studentSang = new _04_Student(100, "이상원");
		
		System.out.println("studentLee의 hashCode :" + studentLee.hashCode());
		System.out.println("studentSang의 hashCode :" + studentSang.hashCode());
		
		System.out.println("studentLee의 실제 주소값 :" + System.identityHashCode(studentLee));
		System.out.println("studentSang의 실제 주소값 :" + System.identityHashCode(studentSang));
	}
}
