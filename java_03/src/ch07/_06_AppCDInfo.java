package ch07;

// 자식클래스 - 부모클래스 상속받고 인터페이스 구현
public class _06_AppCDInfo extends _06_CDInfo implements _06_Lendable {
	// 멤버변수
	private String borrower; // 대출자 "홍길동"
	private String checkOutDate; // 대출일자 "2023-12-08"
	private int state; // 대출여부 STATE_NORMAL = 0; // 반납상태

	// 생성자
	public _06_AppCDInfo() {
	}

	public _06_AppCDInfo(String registerNo, String title, int state) {
		super(registerNo, title);
		
		if(state == STATE_NORMAL) {
			System.out.println("=== 책 대여시 ===");
			System.out.println("대출되었습니다.");
			this.state = state;
			System.out.println("도서번호 : "+registerNo);
			System.out.println("도서제목 : "+title);
			
			
		} else {
			System.out.println("=== 이미 대출된 상태인데 대출시도할 때 ===");
			System.out.println("대출하실 수 없습니다.");
			this.state = STATE_BORROWED;
		}
	}

	@Override
	public void checkOut(String borrower, String checkOutDate) {
		this.borrower = borrower;
		this.checkOutDate = checkOutDate;
		if(state == STATE_NORMAL) {
			System.out.println("대출인 : "+ borrower);
			System.out.println("대출일 : "+ checkOutDate);
		}
	}

	@Override
	public void checkIn() {
		if(state==STATE_NORMAL) {
			System.out.println(" === 이미 반납된 상태일때 책 반납시 ===");
			System.out.println("이미 반납된 상태입니다.");
		} else {
			
			System.out.println(" === 책 반납시 ===");
			System.out.println("반납되었습니다.");
			System.out.println("반납인 : " + borrower);
		}
	}
}
