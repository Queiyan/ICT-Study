package ch03;

public class _02_Book {
	/*
	 * 클래스 : 객체에 대한 설계도, 디자인 - 멤버변수(속성) + 멤버메서드(기능, 동작)
	 * 
	 * 객체 : 클래스를 바탕으로 만들어진 힙메모리 공간
	 */

	// 멤버변수(속성)
	private int bookNo; // 책번호 1 2
	private String bookTitle; // 제목 java입문 JSP
	private int price; // 가격 10000 20000
	private String author; // 저자 박은종 최범균

	// 멤버메서드 - setter, getter
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}
	public int getBookNo() {
		return bookNo;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	

	public void setPrice(int price) {
		
		if(price<0) {
			System.out.println("금액은 음수가 안됩니다.");
		}else
			this.price = price;
	}
	public int getPrice() {
		return price;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	public String getAuthor() {
		return author;
	}

	// 멤버메서드(기능, 동작) - 멤버변수 값 출력
	public void printInfo() {
//		System.out.println("책번호 : " + bookNo);
//		System.out.println("제목 : " + bookTitle);
//		System.out.println("가격 : " + price);
//		System.out.println("저자 : " + author);
		System.out.println("책번호 : " + getBookNo());
		System.out.println("제목 : " + getBookTitle());
		System.out.println("가격 : " + getPrice());
		System.out.println("저자 : " + getAuthor());
	}
	

}
