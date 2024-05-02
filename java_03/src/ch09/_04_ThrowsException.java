package ch09;

import java.util.Scanner;

public class _04_ThrowsException {
	
	static Scanner input = new Scanner(System.in); // 전역변수로 선언
	
	public static void main(String[] args) {
		/* 1. 강제예외발생 : throw new Exception(message);
	     * 2. 상위 메서드에게 예외 던지기
	     *    throws Exception
	     * 3. 예외 처리
	     *    catch(던진 Exception e){e.getMaessage()}로 받는다.
	     * catch문이 여러개일때(다중 catch) 부모 Exception이 제일 아래오도록 한다. 실행순서는 위에서부터 실행
	     */
		// 3.  예외 처리 : try ~catch ~finally
		 try {
			
			System.out.println("이름 : " + readName());
		} catch (Exception e) {
			System.out.println("메세지 : " + e.getMessage());
		} finally {
			input.close();
		}
		System.out.println("정상종료^^");
	}
	
	public static String readName() throws Exception {
		
		System.out.println("이름을 입력하세요 : ");
		String name = input.next();
		
		if(name.length() < 2) {
			// 1. 강제예외발생 : throw new Exception(mesn jsage);
			throw new Exception("이름은 2글자 이상입니다."); // Exception 매개변수 생성자 호출
		} else {
			return name;
		}
		
		
		
	}
}
