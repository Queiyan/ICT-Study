package ch05;

import java.util.Scanner;

public class _03_BookMain {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// 1. 클래스명 참조변수 = new 생성자;
		
		// 태백산맥, 조정래 => 매개변수 생성자 => printInfo() 출력
		_03_Book[] library = new _03_Book[3];
		
//		library[0] = new _03_Book("태백산맥", "조정래");
//		library[1] = new _03_Book("데미안", "헷세");
//		library[2] = new _03_Book("자바", "김기태");
		
		for (int i = 0; i < library.length; i++) {
			
			System.out.println((i+1)+"번째 책의 제목을 입력하세요");
			String title = sc.next();
			System.out.println((i+1)+"번째 책의 저자를 입력하세요");
			String author =sc.next();
			
			library[i] = new _03_Book(title, author);
		}
		
		/* 방법2) 선언과 생성을 동시에 한다. .. 추천
        	int[] scores = new int[갯수];
        	scores[index] = 값;
		*/
		// 3건 출력 : 매개변수생성자 => 멤버변수 초기화 => printInfo() 출력
		
		for (int i = 0; i < library.length; i++) {
			System.out.print((i+1)+"번째 책 ");
			library[i].printInfo();
		}
		sc.close();
	}
}
