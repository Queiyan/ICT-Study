package ch13;

// p467
public class _05_Main {
	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "World";
		// 인터페이스명 참조변수 = (메개변수1, 메개변수2, ...) -> 구현부
		_05_StringConcat concat2 = (s, v) -> System.out.println(s + "," + v);
		// 참조변수.메서드(메개변수1, 메개변수2, ...);
		concat2.makeString(s1, s2);
	}
}
