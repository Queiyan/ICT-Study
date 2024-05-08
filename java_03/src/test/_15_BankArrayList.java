package test;

import java.util.ArrayList;
import java.util.Iterator;

public class _15_BankArrayList {
	
	private ArrayList<_15_Bank> bankList;

   	// 2. 디폴트 생성자
   	public _15_BankArrayList (){
		bankList = new ArrayList<_15_Bank>();
	}

   	// 8. 은행추가 메서드 addBank()
   	public void addBank(_15_Bank bank){
		bankList.add(bank);
	}

   	// 11. 우리은행삭제 메서드 removeBank()
   	public boolean removeBank(int bankNo){
		for (int i = 0; i < bankList.size(); i++){
			_15_Bank bankInfo = bankList.get(i);
			int bankNum = bankInfo.getBankNo();

			if(bankNum == bankNo){
				bankList.remove(i);
				return true;
			}
		}
		System.out.println("찾으시는 은행이 없습니다.");
		return false;
	}


  	 // 10. 전체 은행 정보 출력
	public void showAllBankInfo(){

   		System.out.println("== 방법1. 향상된 for문 ==");
		for(_15_Bank bank : bankList){
			System.out.println(bank);
		}

   		System.out.println("== 방법2. 반복자(Iterator) ==");
   		Iterator<_15_Bank> bank = bankList.iterator();
		while(bank.hasNext()){
			_15_Bank bankObj = bank.next();
			System.out.println(bankObj);
		}
   	
   
      	}
}