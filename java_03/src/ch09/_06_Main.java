package ch09;

import java.util.Scanner;

public class _06_Main {
	public static void main(String[] args) {
		_06_IDFormat idf = new _06_IDFormat();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Id를 입력하세요");
		
		String userID = sc.nextLine();
		
		try {
			idf.setUsreID(userID);
			System.out.println("아이디 : "+idf.getUsreID());
		} catch (_06_IDformatException e) {
			System.out.println(e.getMessage());
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			
		}
		System.out.println("정상종료^^");
		sc.close();
	}
}
