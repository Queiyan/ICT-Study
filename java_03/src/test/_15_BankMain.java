package test;

public class _15_BankMain {
   // 매개변수 생성자를 통해 멤버변수로 값을 전달하고, 
   // ArrayList에 추가, 삭제, 조회
	public static void main(String[] args){
		_15_BankArrayList bankA = new _15_BankArrayList();
		
		//_15_Bank sinhan = new _15_Bank();
		//_15_Bank woori = new _15_Bank();
		//_15_Bank gukmin = new _15_Bank();

		bankA.addBank(new _15_Bank(101, "신한은행", "101-1111"));
		bankA.addBank(new _15_Bank(102, "우리은행", "102-2222"));
		bankA.addBank(new _15_Bank(103, "국민은행", "103-3333"));

		//sinhan.setBankNo(101);
		//sinhan.setBankName("신한은행");
		//sinhan.setAccountNo("101-1111");
		
		//bankA.addBank(sinhan);
	
		System.out.println("전체 출력");
		bankA.showAllBankInfo();
		
		// 102번 삭제
		bankA.removeBank(102);


		System.out.println("삭제 후 전체 출력");

		bankA.showAllBankInfo();
	}
}