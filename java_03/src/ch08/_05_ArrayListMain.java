package ch08;

import java.util.Scanner;

public class _05_ArrayListMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int mnum = 1001;
		
		// 1.디폴트 생성자 호출
		_05_MemberArrayList mList = new _05_MemberArrayList();
				
		mList.addMember(new _05_Member(1001, "이지원","lgw@gmail.com"));
		mList.addMember(new _05_Member(1002, "손민국","smg@naver.com"));
		mList.addMember(new _05_Member(1003, "박서훤","psh@daum.com"));
		mList.addMember(new _05_Member(1004, "홍길동","hgd@gmail.com"));
		
//		for(int i = 0; i < 5; i++) {
//			System.out.println("이름을 입력하세요.");
//			String name = sc.next();
//			mList.addMember(new _05_Member(mnum, name));
//			mnum++;
//		}
		
//		mList.addMember(new _05_Member(1001, "이지원"));
		
		
		
		mList.showAllmember();
		 // 회원삭제.. 1004 회원 삭제.
		mList.removeMember(1004);
		//mList.removeMember(memberHong.getMemberId());
		
		System.out.println("[ 삭제 후 전체 회원 출력 ]");
		mList.showAllmember();
	}

}
