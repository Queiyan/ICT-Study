package test;

public class _12_Book {

	// 멤버변수
	private int bookNo;
	private String bookName;
	private String author;
	
	// 생성자
	// 디폴트 생성자
	public _12_Book() {

	}

	// 매개변수 생성자
	public _12_Book(int bookNo, String bookName, String author) {
		this.bookNo = bookNo;
		this.bookName = bookName;
		this.author = author;
	}
	
	// 멤버메서드 Getter, Setter
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}
	public int getBookNo() {
		return bookNo;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookName() {
		return bookName;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getAuthor() {
		return author;
	}

	@Override
	public String toString(){
		return "책번호 : " + bookNo + " 책이름 : " + bookName + " 저자 : " + author;
	}
}