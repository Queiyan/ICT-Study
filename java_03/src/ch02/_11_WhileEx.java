package ch02;
public class _11_WhileEx {
	public static void main(String[] args) {
		  /*
	       * Test3. while문으로 구구단 작성
	       * 2~9단까지 출력
	       * 
	       * *** 구구단 출력 ***
	       * === 2단 ===
	       * 2 * 1 = 2
	       * ...
	       * 2 * 9 = 18
	       * === 9단 ===
	       * 9 * 1 = 9
	       * ...
	       * 9 * 9 = 81
	       * ==========  마지막에 한번만
	       */
		
		// 1. 초기값
		int dan = 2;
		
		int i = 1;
		
		while(dan<=9) {
			System.out.println("=== "+dan+"단 ===");
			//2-1 초기값
			i = 1;
			
			// 2-2 while 조건식
			while(i<=9) {
				System.out.println(dan+" * "+i+" = "+(dan*i));
				
				// 2-3 증감식
				i++;
				
			}
			
			
			// 3. 증감식
			dan++;

		}
		System.out.println("==========");
		
		
	}
}
