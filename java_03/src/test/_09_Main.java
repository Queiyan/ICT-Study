package test;

public class _09_Main {
	public static void main(String[] args) {
		// 자식매개변수 생성자를 통한 값 전달(대출번호, 타이틀, 대출여부)
		// loan() 호출시점에 값 전달(대출자, 대출일자)
		// 대출상태 판단은 상수를 이용

		System.out.println("=== 대출시 ===");
		
		_09_LoanInfo loaning = new _09_MyLoanInfo ("P001", "청년취업지원", "홍길동","2024-04-26",0);

		System.out.println("=== 이미 대출된 상태인데 대출시도할 때 ===");
		
		_09_LoanInfo aready = new _09_MyLoanInfo ("P001", "청년취업지원", "홍길동","2024-04-26",1);
		
		System.out.println("=== 대출 상환시 ===");
		
		_09_Loan reloaning = (_09_MyLoanInfo) loaning;
		reloaning.repay();
		
		System.out.println("=== 이미 상환된 상태일때 대출 상환시 ===");
		
		_09_Loan areadyloan = (_09_MyLoanInfo) aready;
		areadyloan.repay();
	}
}