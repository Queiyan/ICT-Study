package ch10;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

// p504

//import java.util.Timestamp;

public class _09_BufferedStream {
	public static void main(String[] args) {
		
		// 각 자료형에 맞게 자료를 씀
		
		// 자료형에 맞게 자료를 읽고 출력함
		// 파일에 쓴 순서와 같은 순서, 같은 메서드로 읽어야 함
		long millisecond = 0;
		try(FileInputStream fis = new FileInputStream("a.zip");
			FileOutputStream fos = new FileOutputStream("copy.zip");
			BufferedInputStream bis = new BufferedInputStream(fis);
			BufferedOutputStream bos = new BufferedOutputStream(fos)) {
			
			millisecond = System.currentTimeMillis() - millisecond;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("파일 복사하는 데" + millisecond + "milliseconds 소요되었습니다.");
	}
}
