package test;

public class _04_ForEx{
	public static void main(String[] args){

		for(int da= 2; da <= 9; da++){
			System.out.println("=== "+da+"단 ===");	
			for(int i = 1; i <=9; i++){			
				System.out.println(da+" * "+i+" = "+(da*i));
			}
		}
		System.out.println("===========");
	}
}