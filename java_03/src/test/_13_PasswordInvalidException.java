package test;

//사용자 정의 Exception
public class _13_PasswordInvalidException extends Exception{
	public _13_PasswordInvalidException (String password) {
		super(password);
	}
}