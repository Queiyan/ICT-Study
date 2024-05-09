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
	synchronized void transfer(int amount) {
		// 출금하다.. withdraw() 호출후 출력
		account1.withdraw(amount);
		System.out.println(account1.getOwnerName()+" 계좌 : " + amount + " 출금");

		// 입금하다.. deposit() 호출 후 출력
		account2.deposit(amount);
		System.out.println(account2.getOwnerName() + " 계좌 : " + amount + " 입금");
	}

	// 잔액합계를 구하다.
	synchronized int getBalanceTotal() {
		return account1.getBalance()+account2.getBalance();
	}
	/*
	 * [synchronized] - 동기화 .. 문서출력
	 *   예)A,B,C 출력순서는 달라질수는 있으나(시분할), 문서는 섞이면 안된다.
	 *   
	 * 동기화란 공유된 자원중에서 동시에 사용하면 안되는 자원에 대해 잠금(lock)을 수행하여 보호하는 도구이다.
	 * 즉 메서드를 호출할 때 객체에 잠금을 하고, 메서드 수행이 끝나면 잠금을 해제한다.
	 * 이 때 Vector라는 자료구조가 사용되고, 메서드가 호출될 때 마다 잠금과 해제가 일어나므로 ArrayList보다 수행속도가 느리다.
	 * 
	 * [임계 영역(critical section)]
	 * - 한 사용자가 자원을 사용하고 있으면, 다른 사용자는 사용이 끝날때까지 기다려야 한다.
	 *   이러한 영역을 임계영역이라고 한다.
	 *   
	 * - 동기화 메서드를 만들기 위해서는   synchronized 키워드를 메서드 선언에 붙이면 된다.
	 * - synchronized 키워드를 사용하면, 어떠한 순간에는 하나의 스레드만이 임계영역 안에서 실행하는 것이 보장된다.
	 * - synchronized 키워드가 붙어있으면, 하나의 스레드가 공유메서드를 실행하는 동안에, 다른 스레드는 공유메서드를 실행할 수 없다.
	 * 
	 * - wait() 메서드는 어떤 일이 일어나기를 기다릴 때 사용하는 메서드이다.
	 * - notify() 메서드는 반대로 어떤 일이 일어났을 때 이를 알려주는 메서드이다.
	 * 
	 * <임계 영역(critical section)의 동기화>
	 * - critical section이 문제를 일으키지 않으려면 그 부분이 실행되는 동안
	 *   다른 스레드가 공유 데이터를 사용할 수 없도록 만드는 것을 말한다.
	 */
}