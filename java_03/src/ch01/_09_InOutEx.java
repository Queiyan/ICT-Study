package ch01;

import java.util.Scanner;

public class _09_InOutEx {
	public static void main(String[] args) {
		// 클래스명 참조변수형 = new 클래스명();
		// 참조변수명에는 객체(인스턴스)를 가리키는 주소값이 들어있다.

		// 참조변수명. 메소드

		// 콘솔창에 이름, 나이 이메일 입력받아 출력하세요
		Scanner sc = new Scanner(System.in);

		System.out.print("이름을 입력 해주세요: ");
		String name = sc.next();

		System.out.print("나이 입력 해주세요: ");
		int age = sc.nextInt();

		System.out.print("이메일을 입력 해주세요: ");
		String email = sc.next();

		System.out.println("=== MyInfo ===");

		System.out.println("저의 이름은 " + name + "입니다");
		System.out.println("저의 나이는 " + age + "살 입니다");
		System.out.println("저의 이메일은 " + email + " 입니다");
		
		sc.close();

	}
}
