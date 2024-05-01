package test;

import java.util.ArrayList;
import java.util.Iterator;

public class _11_BankArrayList {
	private ArrayList<_11_Bank>	bankList;

	// 2. 디폴트 생성자
	public _11_BankArrayList(){
		bankList = new ArrayList<_11_Bank>();
	}
	
	// 8. 은행추가 메서드.. 신생아실
	public void addBank(_11_Bank bank){
		bankList.add(bank);
	}

	// 11. 은행삭제 메서드
	public boolean removeBank(int bankNo){
		for(int i = 0; i < bankList.size(); i++){
			_11_Bank bankN = bankList.get(i);
			int dnum = bankN.getBankNo();
			if(dnum == bankNo) {
				bankList.remove(i);
				return true;
			}
		}
		System.out.println("찾으시는 은행 번호가 없습니다.");
		return false;
	}

	// 10. 전체 은행 정보 출력
	public void showAllBankInfo(){
		System.out.println("== 방법1. 향상된 for문 ==");
		for(_11_Bank bank : bankList) {
			System.out.println(bank);
		}

		System.out.println("== 방법2. 반복자(Iterator) ==");
		Iterator<_11_Bank> itr = bankList.iterator();
		while(itr.hasNext()){
			_11_Bank bank = itr.next();
			System.out.println(bank);
		}
	}
}