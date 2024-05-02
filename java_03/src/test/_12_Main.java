package test;

public class _12_Main {

	public static void main(String[] args) {
		_12_BookHashMap bookM = new _12_BookHashMap();
		
		// 책 추가
		bookM.addBook(new _12_Book(1001, "람세스", "크리스티앙 자크"));
		bookM.addBook(new _12_Book(1002, "트와일라잇", "스테퍼니 마이어"));
		bookM.addBook(new _12_Book(1003, "어린왕자", "생텍쥐페리"));
		bookM.addBook(new _12_Book(1004, "행복한왕자", "오스카 와일드"));

		// 책 조회
		bookM.showBookInfo();		

		// 책 삭제 후 조회 - 003 삭제
		bookM.removeBook(1003);
		bookM.showBookInfo();

	}
}