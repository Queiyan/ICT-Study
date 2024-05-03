package ch09;

public class _06_IDFormat {
	// 멤버변수
	private String usreID;
	
	// getter, setter
	public void setUsreID(String usreID) throws Exception{
		if(usreID.isBlank()) {
			// 2. 강제예외발생 : throw new Exception(message)
			throw new _06_IDformatException("아이디가 입력되지 않았습니다.");
		}
		else if(usreID.length() < 0  || usreID.length() > 20) {
			// 2. 강제예외발생 : throw new Exception(message)
			throw new _06_IDformatException("아이디는 1~19 자리 입니다.");
		}
		else {
			this.usreID = usreID;
		}
	}
	public String getUsreID() {
		return usreID;
	}
	
	
	
}
