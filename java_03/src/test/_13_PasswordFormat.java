package test;

public class _13_PasswordFormat {
	// 멤버변수
	private String password;
   	
	// getter, setter에서 예외발생 및 던지기
	// 패스워드 12~20 사이만 허용
	public void setPassword(String password) throws _13_PasswordInvalidException{
		if((password.length() >= 12 && password.length() <= 20)|| !password.isBlank()){
			this.password = password;
		} else {
			throw  new _13_PasswordInvalidException("패스워드는 10 ~ 20 자로 작성하십시요.");
		}
	}
	public String getPassword(){
		return password;
	}
	
}