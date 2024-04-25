package ch03;
import java.util.Scanner;

public class _01_Student {
	/*
	 * 클래스 : 객체에 대한 설계도, 디자인
	 * 		  - 멤버변수(속성) + 멤버메서드(기능, 동작)
	 *  
	 *  객체 : 클래스를 바탕으로 만들어진 힙메모리 공간
	 */
	
	// 멤버변수(속성)
	String studentID; // 학번
	String name;      // 이름
	String email;     // 이메일
	String address;
	int age;
	
	
	Scanner sc = new Scanner(System.in);
	
	public void inInfo() {
		
		System.out.println("학번을 입력하세요 : ");
		studentID = sc.next();
		
		System.out.println("이름을 입력하세요 : ");
		name = sc.next();
		
		System.out.println("이메일을 입력하세요 : ");
		email = sc.next();
		
		System.out.println("나이를 입력하세요 : ");
		age = sc.nextInt();
		
		System.out.println("주소를 입력하세요 : ");
		address = sc.next();
		
	}
	
	
	// 멤버메서드(기능. 동작)
	public void printInfo() {
		
		System.out.println("=== "+name+" 정보 출력 ===");
		// 멤버변수 정보 출력	
		System.out.println("학번 : " + studentID);
		System.out.println("이름 : " + name);
		System.out.println("이메일 : " + email);
		System.out.println("나이 : " + age);
		System.out.println("주소 : " + address);
		System.out.println("=====================");
	}
	
	
}
