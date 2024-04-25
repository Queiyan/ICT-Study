package test;

import java.util.Scanner;

public class _05_MyInfoMain {

	public static void main(String[] args) {
		/*
		 * 객체생성 참조변수 ? 멤버변수, 멤버에서도 접근
		 * 
		 */
		// 방법1. setter로 값 전달 -> showInfo()로 출력

		// 방법2. setter로 값 전달 -> getter로 출력

		_05_MyInfo kim = new _05_MyInfo();

		Scanner sc = new Scanner(System.in);

		System.out.println("이름을 입력하세요.");
		kim.setName(sc.next());
		System.out.println("생일을 입력하세요.");
//		String str = sc.nextLine(); // nextLine 오류 해결 (개행문자 값이 남아서 오류가 나옴 따로 변수에 담아서 해결)
		kim.setBirtday(sc.next());
		System.out.println("자산을 입력하세요.");
		kim.setMoney(sc.nextInt());
		System.out.println("주소를 입력하세요.");
		kim.setAddress(sc.next());

//		kim.setName("김준혁");
//		kim.setBirtday("10월 14일");
//		kim.setMoney(500);
//		kim.setAddress("인천 주안동");

//		kim.showInfo(); // 방법1

		// 방법2
		System.out.println("저의 이름은 " + kim.getName() + " 입니다.");
		System.out.println("저의 생일은 " + kim.getBirtday() + " 입니다.");
		System.out.println("저의 자산은 " + kim.getMoney() + "(만원) 입니다.");
		System.out.println("저의 주소는 " + kim.getAddress() + " 입니다.");

		sc.close();
	}
}
