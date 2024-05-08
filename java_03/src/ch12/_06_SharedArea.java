package ch12;

// 2.공유영역 - 계좌이체, 잔액합계
public class _06_SharedArea{

	// 멤버변수
	_06_Account account1; // 김태희 계좌
	_06_Account account2; // 비 계좌

	// 디폴트 생성자
	_06_SharedArea() {

	}

	// 매개변수 생성자
	public _06_SharedArea(_06_Account account1, _06_Account account2) {
		this.account1 = account1;
		this.account2 = account2;
	}	

	// 계좌이체를 하다.
	void transfer(int amount) {
		// 출금하다.. withdraw() 호출후 출력
		account1.withdraw(amount);
		System.out.println(account1.getOwnerName()+" 계좌 : " + amount + " 출금");

		// 입금하다.. deposit() 호출 후 출력
		account2.deposit(amount);
		System.out.println(account2.getOwnerName() + " 계좌 : " + amount + " 입금");
	}

	// 잔액합계를 구하다.
	int getBalanceTotal() {
		return account1.getBalance()+account2.getBalance();
	}

}