package ch08;

// p407
public class _05_Member extends Object{
	
	// 6. 맴버변수
	private int memberId;
	private String memberName;
	private String email;
	
	// 디폴트 생성자
	public _05_Member() {
		
	}

	// 5. 매개변수 생성자
	public _05_Member(int memberId, String memberName, String email) {
		this.memberId = memberId;
		this.memberName = memberName;
		this.email = email;
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
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	// toString 재정의
	@Override
	public String toString() {
		return memberName + " 회원님의 아이디는 " + memberId + " 이메일은 "+ email + " 입니다.";
	}
}
