package ch01;

//클래스명은 대문자로 시작한다.
public class _01_VariableEx {
	public static void main(String[] arg) {
		/*
		 * 프로그램 첫시작을 나타내는 main() 메서드는 소문자로 시작한다.
		 * 자바가상머신(Java Virtual Machine, JVM)이 프로그램을 시작하기 위해 호출하는 메서드
		 * p44
		 */
		
		//int level = 10;
		String name = "김준혁";
		String add = "인천광역시 미추홀구 주안동";
		String dream = "게임개발자";
		int fav_num = 3;
		char bloodType = 'B';
		
		System.out.println("*** 나의 정보 ***");
		//System.out.println("level => "+level);
		System.out.println("저의 이름은 "+name+" 입니다.");
		System.out.println("제가 살고있는 집의 주소는 "+add+" 입니다.");
		System.out.println("저의 꿈은 "+dream+" 입니다.");
		System.out.println("제가 좋아하는 숫자는 "+fav_num+" 입니다.");
		System.out.println("저의 혈액형은 "+bloodType+"입니다.");
		
//		System.out.println(); //줄바꿈
//		System.out.println("저의 이름은 "+name+" 입니다."+"\n제가 살고있는 집의 주소는 "+add+" 입니다."+
//							"\n저의 꿈은 "+dream+" 입니다."+"\n제가 좋아하는 숫자는 "+fav_num+" 입니다."+
//							"\n저의 혈액형은 "+bloodType+"입니다.");
			
		
		// \n : 줄바꿈
		// \t : 탭 
		/*
		 * 변수 선언 및 대입 => 자료형 변수명 = 값;
		 * 변수는 소문자로 시작한다.
		 * 같은 자료형에 맞게 대입되어야 한다.
		 */

	}
}
