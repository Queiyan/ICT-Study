package ch02;

public class _05_IfEx {
	public static void main(String[] args) {
		System.out.println("--- 3항연산자 (1) ---");
		
		// 결과 조건식 ? 참 : 거짓;
		
		int age = 16;
		String result ="";
		
		result = (age >= 8 ) ? "학교에 다닙니다." : "학교에 다니지 않습니다.";
		System.out.println("result : " + result);
		
		
		System.out.println("--- 3항연산자 (2) ---");
		int score = 80;
		
		if(score >= 60) {
			result = "합격";
		}
		else if(score >= 40) {
			result = "불합격";
		}
		else {
			result = "과락";
		}
		System.out.println(score + " : " + result);
		
		// 3항 연산 적용
		
		System.out.println("--- 3항연산자 (3) ---");
		String result2 ="";
		
		result2 = (score >= 40) ?  ((score>=60) ? "합격":"불합격") : "과락";
		
		
		System.out.println(result2);

	}
}
