package test;

import java.util.Scanner;

public class _13_Main {

	public static void main(String[] args) {
		_13_PasswordFormat pwS = new _13_PasswordFormat();
		Scanner sc = new Scanner(System.in);
		
		try{
			System.out.println("패스워드를 입력하세요");
			String password = sc.next();
			pwS.setPassword(password);
		} catch(_13_PasswordInvalidException e) {
			System.out.println("메세지 : " + e.getMessage());
		} finally {

		}
		System.out.println("정상출력");
		System.out.println("패스워드 : " + pwS.getPassword());
		sc.close();
	}
}