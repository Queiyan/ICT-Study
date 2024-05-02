package ch09;

import java.util.Scanner;

public class _05_ThrowsExcerption {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		/* 1. 강제예외발생 : throw new Exception(message);
	     * 2. 상위 메서드에게 예외 던지기
	     *    throws Exception
	     * 3. 예외 처리
	     *    catch(던진 Exception e){e.getMaessage()}로 받는다.
	     * catch문이 여러개일때(다중 catch) 부모 Exception이 제일 아래오도록 한다. 실행순서는 위에서부터 실행
	     */
		try {
			System.out.println("나이 : " + readAge());
		} catch (Exception e) {
			System.out.println("메세지 : " + e.getMessage());
		} finally {
			
		}
		System.out.println("정상종료^^");
		
	}
	
	public static int readAge() throws Exception {
		System.out.println("나이를 입력하세요");
		
		int age = sc.nextInt();
		
		if(age < 0) {
			// 1. 강제예외발생 : throw new Exception(mesn jsage);
			throw new Exception("나이는 0보다 큽니다.!!"); // Exception 매개변수 생성자 호출
		} else {
			return age;
		}
		
	}
}
