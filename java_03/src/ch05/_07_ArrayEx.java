package ch05;

import java.util.Scanner;

public class _07_ArrayEx {
	public static void main(String[] args) {
		/*
         *                      *** 성적표 ***
         * =========================================
         * 번호   국어    영어   수학    총점   평균   학점
         * =========================================
         *  1    100   100   100   300   100    A
         *  2     90    90    90   270    90    A
         *  3     70    70    70   210    70    C
         *  4     70   100   100   300   100    A
         *  5     60   100    78   238    79    B         
         *  ========================================
         * 과목합계  390  460  460   
         *  
         *  평균 : 소수점 이하 둘째자리
         *  2차원배열명 => scores  국,영,수 점수는 주어진 값
         *  총점(sum), 평균(avg), 학점, 과목합계(korTot, engTot, mathTot)는 직접계산
         *  
         *  100점, 총점 270점 !                    
       */
		
		Scanner sc = new Scanner(System.in);
		
		int scores[][] = {{100,100,100},{90,90,90},{70,70,70},{70,100,100},{60,100,78}};
		
//		final int MAX = 5;
//		
//		int scores[][] = new int[MAX][3];
//		
//		String subject[] = {"국어","영어","수학"};
//		
//		for (int i = 0; i < scores.length; i++) {
//			for (int j = 0; j < 3; j++) {
//				System.out.println((i+1)+"번 "+subject[j]+"점수를 입력해 주세요");
//				scores[i][j] = sc.nextInt();
//			}
//		}
		
		System.out.println("\t\t*** 성적표 ***");
		System.out.println("========================================================");
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균\t학점");
		System.out.println("========================================================");
		
		int sum[] = new int[scores.length];
		double avr[] = new double[scores.length];
		int num = 1;
		int ea = 0;
		int total[] = new int[scores.length];
		char grade[] = new char[scores.length];
		
		for (int i = 0; i < scores.length; i++) {
			System.out.print(num+"\t");
			num++;
			for (int j = 0; j < scores[i].length; j++) {
				System.out.print(scores[i][j]+"\t");
				sum[i] = sum[i] + scores[i][j];
				ea = j;
			}
//			for (int j = 0; j < scores.length; j++) {
//				total[i] = total[i] + scores[j][i];
//			}
			System.out.print(sum[i]+"\t");
			avr[i] = (double)sum[i]/(ea+1);
			if((avr[i]%1)%.1f == 0) {
				System.out.printf("%.0f",avr[i]);
			} else {
				System.out.printf("%.1f",avr[i]);
			}
			System.out.print("\t");
			
			grade[i] = (avr[i] >= 90) ? 'A' : (avr[i] > 70) ? 'B': (avr[i] >= 60) ? 'C': (avr[i] >= 50) ? 'D' : 'F';
			System.out.print(grade[i]);
			System.out.println();
			
		}
		System.out.println("========================================================");
		System.out.print("과목합계\t");
		for (int i = 0; i < scores[i].length; i++) {
			for (int j = 0; j < scores.length; j++) {
				total[i] = total[i] + scores[j][i];
			}
			System.out.print(total[i]+"\t");
		} 
//		for (int i = 0; i < total.length; i++) {
//			System.out.print(total[i]+"\t");
//		}
		System.out.println("");
		
		sc.close();
	}
}
