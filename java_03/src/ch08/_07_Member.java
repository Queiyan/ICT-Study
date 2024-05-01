package ch08;

public class _07_Member {
	// 6. 맴버변수
		private int memberId;
		private String memberName;
		private String memberEmail;
		
		// 디폴트 생성자
		public _07_Member() {
			
		}

		// 5. 매개변수 생성자
		public _07_Member(int memberId, String memberName, String email) {
			this.memberId = memberId;
			this.memberName = memberName;
			this.memberEmail = email;
		}
		// 멤버변수 메소드
		// getter, setter
		public int getMemberId() {
			return memberId;
		}
		
		public void setMemberId(int memberId) {
			this.memberId = memberId;
		}

		public String getMemberName() {
			return memberName;
		}

		public void setMemberName(String memberName) {
			this.memberName = memberName;
		}
		
		public String getEmail() {
			return memberEmail;
		}

		public void setEmail(String email) {
			this.memberEmail = email;
		}

		// toString 재정의
		@Override
		public String toString() {
//			return memberName + " 회원님의 아이디는 " + memberId + " 이메일은 "+ memberEmail + " 입니다.";
			 return "회원아이디 : " + memberId + ", 회원명 : " + memberName + ", 이메일 : " + memberEmail;
		}
}
