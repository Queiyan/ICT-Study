package test;

// 자식클래스 - 부모클래스 상속받고 인터페이스 구현
public class _09_MyLoanInfo extends _09_LoanInfo implements _09_Loan {

	// 멤버변수
	private String borrower;	// 대출자 "홍길동"
	private String loanDate;	// 대출일자 "2024-04-26"
	private int state;		// 대출여부 STATE_REPAY = 0; // 상환상태

	// 디폴트 생성자
	public _09_MyLoanInfo () {
	
	}
	
	// 매개변수 생성자
	public _09_MyLoanInfo (String loanNo, String productName, String borrower, String loanData,int state) {
		super(loanNo, productName);
		this.borrower = borrower;
		this.loanDate = loanData;
		this.state = state;
		this.loan(loanNo, productName, borrower, loanData);
	}


	// 대출하다
	@Override
	public void loan(String loanNo, String productName, String borrower, String loanData){
		
		if(state == STATE_REPAY){
			
			System.out.println("대출되었습니다");
			System.out.println("대출번호 : " + super.getLoanNo());
			System.out.println("대출상품명 : " + super.getProducName());
			System.out.println("대출인 : " + borrower);
			System.out.println("대출일 : " + loanDate);
			this.state = 1;
		} else {
			System.out.println("대출하실 수 없습니다");
		}
	}
	// 상환하다
	public void repay(){
		if(state == STATE_LOAN){	
			System.out.println("상환되었습니다.");
			System.out.println("상환인 : " + borrower);
			this.state = 0;
		} else {
			System.out.println("이미 상환된 상태입니다");
		}
	}

}