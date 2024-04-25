package ch03;

public class _04_CarMain {
	public static void main(String[] args) {
		// 카페 : 자바 <중요__인스턴스 생성
		// 객체생성 : 클래스명 참조변수 = new 생성자;
		System.out.println("<< 방법1 >>");
		// 1-1. 디폴트 생성자를 통해 객체 생성(볼보)
		_04_Car volvo = new _04_Car();
		
		// 1-2. setter를 통해 멤버변수로 값 전달(멤버변수
		volvo.setMadein("스웨덴");
		volvo.setBrand("볼보");
		volvo.setPrice(6000);
		volvo.setColor("회색");
		
		// 1-3. 멤버변수 정보를 출력(printInfo())
		volvo.printInfo();
		
		System.out.println("==================");
		
		System.out.println("<< 방법2 >>");
		
		// 2-1. 매개변수 생성자를 통해 객체 생성(제네시스)
		_04_Car genesis = new _04_Car("한국","제네시스",10000,"검은색");
		
		// 2-2. 멤버변수 정보를 출력(printInfo())
		genesis.printInfo();
	}
}
