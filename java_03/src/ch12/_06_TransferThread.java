package ch12;

//3-2.계좌이체 스레드 - Thread 클래스 상속
public class _06_TransferThread extends Thread{

	// 멤버변수
	private _06_SharedArea sharedArea;

	// 디폴트 생성자
	public _06_TransferThread() {

	}
	// 매개변수 생성자
	public _06_TransferThread(_06_SharedArea sharedArea) {
		this.sharedArea = sharedArea;
	}
	@Override
	// run 재정의 => 계좌이체 transfer(1000) 5번 호출
	public void run() {
		for (int i = 1; i <= 5; i++) {
			sharedArea.transfer(1000);
		}
	}
}