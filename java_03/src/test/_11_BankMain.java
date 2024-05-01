package test;

public class _11_BankMain {
	public static void main(String[] args) {

		// 매개변수 생성자를 통해 멤버변수로 값을 전달하고
		_11_BankArrayList bankL = new _11_BankArrayList();

		// ArrayList에 추가, 삭제, 조회
		bankL.addBank(new _11_Bank(101, "신한은행", "101-1111"));
		bankL.addBank(new _11_Bank(102, "우리은행", "102-2222"));
		bankL.addBank(new _11_Bank(103, "국민은행", "103-3333"));

		bankL.showAllBankInfo();

		bankL.removeBank(102);

		bankL.showAllBankInfo();


	}
}