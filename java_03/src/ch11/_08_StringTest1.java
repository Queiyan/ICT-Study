package ch11;

// p370
public class _08_StringTest1 {
	// str1, str2는 동적메모리 공간인 힙메모리 주소이다.
	// String, Integer 클래스는 equals(), hashCode()가 미리 재정의되어 있다.
	// 재정의된 equals()는 값 비교
	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		
		String str3 = "abc";
		String str4 = "abc";
		
		System.out.println(str3 == str4);
		System.out.println(str3.equals(str4));
	}
}
