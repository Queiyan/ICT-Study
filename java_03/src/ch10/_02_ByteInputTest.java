package ch10;

import java.io.IOException;

public class _02_ByteInputTest {
	public static void main(String[] args) {
		System.out.println("알파벳 여러 개를 쓰고 [Enter]를 누르세요");
		
		
		
		while(true) {
			try {
				int i = System.in.read(); // 데이터를 1byte씩 읽어들여서 아스키 값으로 저장
				if(i ==13) {
					System.out.println();
					System.out.println("출력완료");
					break;
				}
				System.out.print((char)i);
			} catch (IOException e) {
				e.printStackTrace();
			}  
		}
	}
}
