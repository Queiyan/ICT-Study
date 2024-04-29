package ch01;

public class _10_printEx {
	public static void main(String[] args) {
		   double value = 1.0 / 3.0;
		      System.out.println("value : " + value); // value : 0.3333333333333333
		      System.out.printf("value : " + "%f", value);  // value : 0.333333   // 실수6자리
		      System.out.println();
		      
		      // printf(%전체자릿수.나머지자리수f, 값 또는 변수)  => 자리수가 부족하면 공백으로 채운다.
		      System.out.printf("value : " + "%6.2f", value);  // value :   0.33 => 앞의 2자리가 공백으로 채워진다.
		      System.out.println();
		      
		      System.out.printf("value : " + "%4.2f", value);  // value : 0.33 => 공백없이 채워짐
		      System.out.println();
		      
		      System.out.printf("value : " + "%s", "Good Luck~~");  // value : Good Luck~~
		      System.out.println();
		      
		      System.out.printf("value : " + "%s", "2023/11/29");  // value : 2023/11/29
		      System.out.println();
	}
}
