package test;

public class _03_WhileEx{
	public static void main(String[] args){
	
		int dan = 2;
		int i = 1;

		while(dan<=9){
			i = 1;
			System.out.println("=== "+dan+"단 ===");
			while(i<=9){
				System.out.println(dan+" * "+i+" = "+(dan*i));
				i++;
			}
			dan++;
		}
		System.out.println("===========");
	}
}