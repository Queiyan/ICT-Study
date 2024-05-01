package ch08;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

// p440
public class _07_MemberHashMap {
	
	private Map<Integer, _07_Member> hashMap;
	
	// 디폴트 생성자
	public _07_MemberHashMap() {
		hashMap = new HashMap<Integer, _07_Member>();
	}
	
	// 회원추가
	public void addMember(_07_Member member) {
		hashMap.put(member.getMemberId(), member);
	}
	
	// 회원삭제
	public boolean removeMember(int memberId) {
		if(hashMap.containsKey(memberId)) {
			hashMap.remove(memberId);
			return true;  // void 타입으로 하려면 그냥 return;
		} 
		System.out.println(memberId + "가 존재 하지 않습니다.");
		return false;
	}
	
	// 회원조회 - Iterator사용
	public void showAllMember() {
		Iterator<Integer> ir = hashMap.keySet().iterator();
		while(ir.hasNext()) { // 다음 key가 있으면
			int key = ir.next(); // key 값을 읽어서 대입
			_07_Member member = hashMap.get(key); // key로부터 value 가져오기
			System.out.println(member); // toString 생략가능
		}
		System.out.println();
	}
}
