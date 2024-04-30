package ch08;

import java.util.ArrayList;
import java.util.Iterator;

// p410
// ArrayList에 회원정보 추가, 삭제, 조회
public class _05_MemberArrayList {
	private ArrayList<_05_Member> arrayList;
	
	// 디폴트 생성자
	public _05_MemberArrayList() {
		// ArrayList 생성
		arrayList = new ArrayList<_05_Member>();
	}
	
	// 회원추가 메서드
	// 디폴트 생성자에서 생성한 ArrayList 에 클래스 타입으로 값을 저장하는 메소드
	public void addMember(_05_Member member) {
		arrayList.add(member); // 1001, "이지원", 1002, "손민국", 1003, "박서원", 1004, "홍길동"
	}
	
	// 회원탈퇴 메서드 - key로 삭제
	// 특정번호를 검색하여 원하는 정보(배열 안에 있는 클래스 객체) 삭제
	// boolean 타입 메서드는 무조건 return 값으 반환 해야한다 (true or false)
	public boolean removeMember(int memberId) {
		for (int i = 0; i < arrayList.size(); i++) {
			_05_Member member = arrayList.get(i); // get() 메서드로 회원정볼르 순차적으로 가져옴
			int tempId = member.getMemberId();
			if (tempId == memberId) {
				arrayList.remove(i); // 해당회원(1004)을 삭제
				return true; 		 // 삭제 후 종류.. 삭제후 removeMember() 메서드를 빠져나감.
			} // if
		} // for
		System.out.println(memberId + "가 존재하지 않습니다."); // 반복문이 끝날 때까지 해당 아이디를 못찾는 경우
		return false;
	}
	
	// 전체 회원 출력
	public void showAllmember() {
		// 향상된 for문
//		for (_05_Member member : arrayList) {
//			System.out.println(member.toString());
//		}
		// iterator 사용
		Iterator<_05_Member> member = arrayList.iterator();
		while(member.hasNext()) {
			_05_Member obj = member.next();
			System.out.println(obj.toString());
		}
		
		System.out.println();
	}
}
