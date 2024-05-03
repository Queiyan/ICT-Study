package ch10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class _08_InputStreamReader {

	public static void main(String[] args) throws IOException {
		InputStreamReader isr = null;
		try {
			isr = new InputStreamReader(new FileInputStream("D:\\dev03\\file\\8_inputStream.txt"));
			// isr = new FileInputStream("D:\\dev03\\file\\8_inputStream.txt")); 
			// 한글은 1바이트 단위로 읽으면 깨진다.
			int i;
			while((i=isr.read()) != -1) {
				System.out.print((char)i);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			if(isr != null) isr.close();
		}
		
		
	}

}
