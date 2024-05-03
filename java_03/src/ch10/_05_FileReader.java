package ch10;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class _05_FileReader {
	public static void main(String[] args) throws IOException {
		
		// txt 파일 저장시 인코딩을 UTF-8(초성,중성,종성)로 저장할 것
	    // 한글이 2byte이므로 FileReader 사용
	    // 파일 직접 생성(파일의 내용 작성후 저장, 저장시 인코딩을 UTF-8로 저장한다.)
		FileReader fr = null;
		
		
		try {
			fr = new FileReader("D:\\dev03\\file\\5_InputStream.txt");
			
			int i;
			while((i=fr.read()) !=-1) {
				System.out.print((char)i); // 한글은 깨지지 않고 콘솔에 출력
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (fr != null) fr.close();
		}
		System.out.println();
		System.out.println("작업종료");
	}
}
