package ch08;

import java.util.ArrayList;
import java.util.Iterator;

// ArrayList에 책정보 추가, 삭제, 조회
public class _06_BookArrayList {
	private ArrayList<_06_Book> bookList;
	
	// 2. 디폴트 생성자
	public _06_BookArrayList() {
		bookList = new ArrayList<_06_Book>();
	}
	
	// 8. 책추가 메서드.. 매개변수에 참조변수 전달
	public void addBook(_06_Book bookNo) {
		bookList.add(bookNo);
	}
	
	// 12. 책삭제 메서드 - key로 삭제
	public boolean removeBook(int bookNo) {
		for (int i = 0; i < bookList.size(); i++) {
			_06_Book bookI = bookList.get(i);
			int bookN = bookI.getBookNo();
			
			if (bookN == bookNo) {
				bookList.remove(i);
				return true;
			}
		}
		System.out.println("찾으시는 책번호가 없습니다.");
		return false;
	}
	
	// 10. 전체 회원 출력
	public void showAllBookInfo() {
		// 향상된 for문
		System.out.println("=== 방법1. 향상된 for문 ===");
		for (_06_Book book : bookList) {
			System.out.println(book.toString());
		}
		// 반복자 Iterator
		System.out.println("=== 방법2. 반복자 Iterator ===");
		Iterator<_06_Book> book = bookList.iterator();
		while(book.hasNext()) {
			_06_Book bookObj = book.next();
			System.out.println(bookObj);
		}
	}

}
