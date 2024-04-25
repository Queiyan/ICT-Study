package ch02;

public class _03_IfEx {
	public static void main(String[] args) {
		/*
        [if - else if - else문]
        
        if(조건식1) {   // 조건식1이 참인 경우 수행문1을 실행
           수행문1;
        }
        else if(조건식2) {  // 조건식2이 참인 경우 수행문2을 실행
           수행문2;
        }   
        else if(조건식3) {  // 조건식3이 참인 경우 수행문3을 실행
           수행문3;
        }   
        else {         // 위의 조건이 모두 해당되지 않는 경우 수행문4를 실행
           수행문4;
        }
        
        수행문5;   // 무조건 실행
       */
		
		// score가 60점 이상 100점이면 합격, 60점 미만이면 불합격, 40 미만이면 과락
		System.out.println("--- 1. 잘못된 점수 미체크 ---");
		int score = 110;
		String result = "";
		
		//  if 안에 if 써서 사용
		//if(score >= 60) { 
		//	result = "합격";
		//}else if(score < 60) {
		//	result = "불합격";
		//if(score < 40) {
		//	result = "과락";
		//}
		//}
		//		
		//if(score < 40) {
		//result = "과락";
		//}else if(score < 60) {
		//result = "불합격";
		//}else if(score >= 60) {
		//result = "합격";
		//}
		if(score >= 60) {
			result = "합격";
		}else if(score < 60 && score >40) {
			result = "불합격";
		}else {
			result = "과락";
		}
		
		System.out.println("--- 2. 관계연산자로 잘못된 점수 체크---");
		// score가 60점~100점 : "합격", 
		// 40점~60점 : "불합격", 0점 ~ 
		// 0점~39미만이면 "과락", 그외 "잘못된 점수"
		// 점수 : 결과 .. // T && T => T
		if(score >= 60 && score <=100) {
			result = "합격";
		}else if(score < 60 && score >40) {
			result = "불합격";
		}else if(score >= 0 &&score < 40){
			result = "과락";
		}else {
			result = "잘못된 점수";
		}
		System.out.println(result);
		
		System.out.println("--- 3. 1의 예제에 잘못된 점수 추가 ---");
		
		if(score>100 || score<0) {
			result = "잘못된 점수";
		}
		else{
			if(score >= 60) { 
				result = "합격";				
			}
			else if(score >= 40) {
				result = "불합격";
				
			}
			else {
				result = "과락";
			}
		
		
		}
	}
}
