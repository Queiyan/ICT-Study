package ch07;

// p315 인터페이스 - 부모
public interface _03_Calc {

	// 상수 - 컴파일 과정에서 public static final 추가
	double PI = 3.14;
	int ERROR = -9999;
	
	// 추상메서드 - 컴파일과정에서 public abstract 추가
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int time(int num1, int num2);
	int divide(int num1, int num2);
}
