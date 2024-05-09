package ch12;

// 3-2. 잔액합계 스레드 - Thread 클래스 상속
public class _06_TotalBalanceThread extends Thread{

	// 멤버변수
	private _06_SharedArea sharedArea;

	// 디폴트 생성자
	public _06_TotalBalanceThread(){
	   
    }
	
	// 매개변수 생성자
	public _06_TotalBalanceThread(_06_SharedArea sharedArea) {
		this.sharedArea = sharedArea;
	}
	
	// run 재정의 => getBalanceTotal() 3번 호출해서 잔액합계 출력, 1초 간격
	@Override
	public void run() {
		
		for (int i = 1; i <= 3; i++) {
			try {
				Thread.sleep(1000); 
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println(sharedArea.getBalanceTotal());
			
		}
		
		
	}
}