package ch05;

// 11일차
public class _05_ArrayEx {
	public static void main(String[] args) {
		
		// 향상된 for문 p218
		String[] strArray = {"사과", "배", "딸기", "바나나", "참외"};
		
		// 방법1. for문
		for(int i = 0; i < strArray.length; i++) {
			System.out.println(strArray[i]);
		}
		
		// 방법2. 향상된 for문 p218
		for (String string : strArray) {
			System.out.println(string);
		}
	
	}
}
