package test;
import java.util.Scanner;

public class _02_SwitchCase{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.print("점수를 입력하세요. : ");

		int jumsu = sc.nextInt();

		System.out.print("이름을 입력하세요. : ");

		String name = sc.next();
		char result = ' ';
		
		switch(jumsu/10){
		


		case 9 : result = 'A'; break;
		case 8 : result = 'B'; break;
		case 7 : result = 'C'; break;
		case 6 : result = 'D'; break;
		case 5 :case 4 :case 3 :case 2 :case 1 :case 0 : result = 'F'; break;
		case 10 :
			
			switch(jumsu%100) {
				case 0 : result = 'A'; break;
				default : result = 'W'; break;
			}
			break;
		default: result = 'W';
		
		}
		
		System.out.println("이름 : "+name+", 점수 : "+jumsu+", 학점 : "+result);
		sc.close();
	}
}