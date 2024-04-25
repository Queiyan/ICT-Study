package ch02;

public class _09_WhileEx {
	public static void main(String[] args) {
		/*
		 * 반복문 : 조건이 참인 동안 계속해서 반복수행(while문, for문) 
		 * 1.초기값 -> 2.조건식 -> 3.증감식
		 * 
		 * [ while 문법 ] 
		 * 1. 초기값; 
		 * while(조건식) {2. 조건식 
		 * 	수행문1; 
		 * 	증감식; // 3. 증감식 
		 * } 
		 * 수행문2;
		 */
				
		System.out.println("=== 1. 1~10까지 출력 ===");

		int i = 1;
		while(i <= 10) {
			System.out.print(i+" ");
			i++;
		}
		System.out.println();
		System.out.println("=== 2. 1~10까지 합계 출력 ===");
		//
		// 1~10까지의 합계 : 결과 값
		// 반복문 종료
		int k =1;
		int sum1 = 0;
		
		while(k<=10) {
			sum1 += k;

			k++;
		}
		System.out.println("1부터 10 까지의 합계 : "+sum1);
		
		System.out.println("");
		System.out.println("반복문 종료^^");
		System.out.println();
		System.out.println("=== 3. 1~10까지의 합계 과정 출력 ===");
	      // j, sum2
	      // 1 + 0 = 1
	      // 2 + 1 = 3 ... 
	      // 10 + 45 = 55 
	      // 반복문 종료~~
		int j = 1;
		int sum2 = 0;
		
		while(j <= 10) {
			
			System.out.println(j+" + "+sum2+" = "+(j+sum2));
			sum2 += j;
			j++;
		}
		System.out.println("반복문 종료^^");
	}
}
