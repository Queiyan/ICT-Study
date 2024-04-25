package ch03;

public class _02_BookMain {
	public static void main(String[] args) {
		// [ 인스턴스(객체) 생성]
		// 클래스명 참조변수 = new 클래스명();
		// 참조변수에는 클래스의 주소값이 들어있다.
		// 참조변수.멤버변수 = 값;
		// 참조변수.멤버메서드()

		// 클래스명 참조변수 = new 클래스명();

		// 참조변수. 멤버변수 = 값;

		// 참조변수.멤버메서드
		_02_Book java = new _02_Book();

		java.setBookNo(1);
		java.setBookTitle("java입문");
		java.setPrice(10000);
		java.setAuthor("박은종");
//		java.bookNo = 1;
//		java.bookTitle = "java입문";
//		java.price = 10000;
//		java.author = "박은종";

		java.printInfo();
		System.out.println();

		_02_Book jsp = new _02_Book();

		jsp.setBookNo(2);
		jsp.setBookTitle("JSP");
		jsp.setPrice(20000);
		jsp.setAuthor("최범균");
//		jsp.bookNo = 2;
//		jsp.bookTitle = "JSP";
//		jsp.price = 20000;
//		jsp.author = "최범균";

		System.out.println("책번호 : " + java.getBookNo());
		System.out.println("제목 : " + java.getBookTitle());
		System.out.println("가격 : " + java.getPrice());
		System.out.println("저자 : " + java.getAuthor());
		
		System.out.println("책번호 : " + jsp.getBookNo());
		System.out.println("제목 : " + jsp.getBookTitle());
		System.out.println("가격 : " + jsp.getPrice());
		System.out.println("저자 : " + jsp.getAuthor());
		
//		jsp.printInfo();

	}
}
