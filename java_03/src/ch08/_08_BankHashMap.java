package ch08;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class _08_BankHashMap {
	private Map<Integer, _08_Bank> bankList;

	// 2. 디폴트 생성자
	public _08_BankHashMap(){
		bankList = new HashMap<Integer, _08_Bank>();
	}
	
	// 8. 은행추가 메서드.. 신생아실
	public void addBank(_08_Bank bankNo){
		bankList.put(bankNo.getBankNo(), bankNo);
	}

	// 11. 은행삭제 메서드
	public boolean removeBank(int bankNo){
			if(bankList.containsKey(bankNo)) {
				bankList.remove(bankNo);
				return true;
			}
		System.out.println("찾으시는 은행 번호가 없습니다.");
		return false;
	}

	// 10. 전체 은행 정보 출력
	public void showAllBankInfo(){
		Iterator<Integer> itr = bankList.keySet().iterator();
		while(itr.hasNext()){
			int key = itr.next();
			_08_Bank bank = bankList.get(key);
			System.out.println(bank);
		}
		System.out.println();
	}
}