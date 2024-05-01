package ch08;

public class _08_BankMain {
	public static void main(String[] args) {

		// 매개변수 생성자를 통해 멤버변수로 값을 전달하고
		_08_BankHashMap bankL = new _08_BankHashMap();

		// ArrayList에 추가, 삭제, 조회
		bankL.addBank(new _08_Bank(101, "신한은행", "101-1111"));
		bankL.addBank(new _08_Bank(102, "우리은행", "102-2222"));
		bankL.addBank(new _08_Bank(103, "국민은행", "103-3333"));

		bankL.showAllBankInfo();

		bankL.removeBank(102);

		bankL.showAllBankInfo();


	}
}