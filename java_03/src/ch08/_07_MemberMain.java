package ch08;

public class _07_MemberMain {
	public static void main(String[] args) {
		
		_07_MemberHashMap hmap = new _07_MemberHashMap();
		
		hmap.addMember(new _07_Member(1001, "아이유", "IU@gmail.com")); // 매개변수 생성자를 통해 멤버변수 값 전달
		hmap.addMember(new _07_Member(1002, "소유", "SoU@gmail.com"));
		hmap.addMember(new _07_Member(1003, "김연아", "KYA@gmail.com"));
		hmap.addMember(new _07_Member(1004, "카리나", "KLN@gmail.com"));
		
		// 회원추가
		hmap.showAllMember();
//		회원아이디 : 1001, 회원명 : 아이유, 이메일 : IU@gmail.com
//		회원아이디 : 1002, 회원명 : 소유, 이메일 : SoU@gmail.com
//		회원아이디 : 1003, 회원명 : 김연아, 이메일 : KYA@gmail.com
//		회원아이디 : 1004, 회원명 : 카리나, 이메일 : KLN@gmail.com
		
		// 회원삭제
		System.out.println("== 1004 삭제 후 ==");
		hmap.removeMember(1004);
		hmap.showAllMember();
	}
}
