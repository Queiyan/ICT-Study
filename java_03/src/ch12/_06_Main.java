package ch12;

public class _06_Main {
   public static void main(String[] args) {
      /*
       * 1) 한계좌의 금액을 다른 계좌로 이체
       * 2) 공유영역(김태희 계좌(200만원) + 비 계좌(100만원)
       * 3) 두 계좌의 잔액합계를 출력하는 일을 동시에 한다.
       */
	   _06_Account kim = new _06_Account("010-1111-2222","김태희",2000000);
	   
	   _06_Account be = new _06_Account("010-8888-9999","비",1000000);
	   
	   _06_Account IU = new _06_Account("010-3333-4444","아이유",5000000);
	   
	   _06_Account Suk = new _06_Account("010-5555-6666","김숙",2000000);
	   	      
	   Thread trans = new Thread(new _06_TransferThread(new _06_SharedArea(kim,be)));
	   
	   Thread trans1 = new Thread(new _06_TransferThread(new _06_SharedArea(IU,Suk)));
	   
	   Thread total = new Thread(new _06_TotalBalanceThread(new _06_SharedArea(kim,be)));
	   
	   trans.start();
	   
	   trans1.start();
	   
	   total.start();
	   
      // 스레드 발생
      
      
      // 스레드 실행
      
   }
}
//[계좌 이체 5회 _06_TransferThread]
//김태희 계좌 : 1000 인출
//비 계좌 : 1000 입금,
//
//김태희 계좌 : 1000 인출
//비 계좌 : 1000 입금,
//
//김태희 계좌 : 1000 인출
//비 계좌 : 1000 입금,
//
//아이유 계좌 : 1000 인출
//김숙 계좌 : 1000 입금,
//
//아이유 계좌 : 1000 인출
//김숙 계좌 : 1000 입금,
//
//[잔액합계 3회 출력 _06_TotalBalanceThread]
//계좌 잔액 합계 : 3000000
//계좌 잔액 합계 : 3000000
//계좌 잔액 합계 : 3000000