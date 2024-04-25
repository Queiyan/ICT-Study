package ch02;

import java.util.Scanner;

public class _19_DoWhileEx {
	public static void main(String[] args) {
     
		   Scanner sc = new Scanner(System.in);
		      
		   System.out.print("월을 입력하세요: ");
		   int month = sc.nextInt();
		   
		   do {
		      if(month < 1 || month > 12) {
		         System.out.print("잘못입력: " + month + "월은 잘못된 월입니다. 다시입력하세요: ");
		         month = sc.nextInt();
		      }
		   } while(month < 1 || month > 12);
		   
		   System.out.println("정상: " + month + "월 입니다.");
		
		sc.close();
		
	}
}
