package ch02;
import java.util.Scanner;

public class _07_SwithCaseEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요: ");
		int score = sc.nextInt();

		char grade = ' ';
		if (score > 100 || score < 0) { // 100 초과 했을 때나 0 미만 일 때 따로 처리
			grade = 'W';
			System.out.println(grade);
		} else {
			
			switch(score/10) { // 컴퓨터에서 나누기는 나누고 남은 수를 버린다.
				case 10 : // 100은 90 이상으므로 ":" 뒤에 입력하지않고 case 9로 넘어가면
				case 9 :  // break가 없으므로 case 9 에서 A 값을 받고 빠져나온다(break).
					grade = 'A';
					break; // if에서는 조건 판별 후 자동으로 넘어가지만 switch는 임의로 멈춰줘야 한다
				case 8 :
					grade = 'B';
					break;
				case 7 :
					grade = 'C';
					break;
				case 6 :
					grade = 'D';
					break;
				default : grade = 'D';
	
			}

			System.out.println("점수 : " + score + ", 학점 : " + grade);
		}
		
		
		
		
		
	sc.close(); //스캐너를 사용한다고만 하고 언제까지 쓰는지 명시를 안했으므로 임의로 종료해준다.
	}
}
