package ch05;

public class _02_ArrayEx {
	public static void main(String[] args) {
		 /* 방법2) 선언과 생성을 동시에 한다. .. 추천
	        int[] scores = new int[갯수];
	        scores[index] = 값;
	     */
		String[] drink = new String[5];
		drink[0] = "아침햇살";
		drink[1] = "레몬에이드";
		drink[2] = "레쓰비";
		drink[3] = "실론티";
		drink[4] = "초코에몽";
		
		for (int i = 0; i < drink.length; i++) {
			System.out.println((i+1)+"번째 음료수 = "+drink[i]);
		}
		
		System.out.println();
		
		/*	방법4) 선언과 할당을 동시에 한다. .. 제일 많이 사용
	           int[] scores = {값1, 값2,...};
	    */    
		String[] drink2 = {"콜라","사이다","환타","웰치스","마운틴듀"};
		for (int i = 0; i < drink2.length; i++) {
			System.out.println((i+1)+"번째 탄산음료수 = "+drink2[i]);
		}
		
	}
}
