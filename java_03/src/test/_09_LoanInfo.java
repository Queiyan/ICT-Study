package test;

// 부모클래스
public class _09_LoanInfo{

	// 멤버변수
	private String loanNo; 		// 대출번호 : "P001"
	private String producName;  	// 대출상품명 "청년취업지원"

	// 디폴트 생성자
	public _09_LoanInfo (){
	
	}

	// 매개변수 생성자
	public _09_LoanInfo (String loanNo, String producName){
		this.loanNo = loanNo;
		this.producName = producName;
	}

	// 멤버메서드
	public String getLoanNo() {
		return loanNo;
	}

	public void setLoanNo(String loanNo) {
		this.loanNo = loanNo;
	}

	public String getProducName() {
		return producName;
	}

	public void setProducName(String producName) {
		this.producName = producName;
	}
}

	