package ch11;

public class _01_CompanyMain {
	public static void main(String[] args) {
		_01_Company company = _01_Company.getInstance();
	
		System.out.println("company : " + company);
	
		String name = "홍길동";
		
		company.gotoWork(name);
		company.work(name);
		company.gotoCafeteria(name);
		company.gotoHome(name);
		
	/* p193  
	 * [면접] 싱글톤패턴
	 * - 인스턴스를 단 하나만 생성하는 디자인 패턴
	 * - static을 응용하여 프로그램 전반에서 사용하는 동일한 인스턴스를 하나만 생성하는 방식
	 * - 접근할 클래스에 여러 메서드가 있을 때, 외부 클래스가 해당 메서드에 접근할 때마다 
	 *   객체를 생성할 필요없이 getInstance()를 통해 참조변수만 리턴받아 접근한다.
	 *   열번, 백번을 호출해도 항상 같은 주소의 인스턴스가 반횐된다.
	 *  
	 * 싱글톤패턴 생성
	 * - 1단계. 디폴트생성자를 private으로 만들기
	 * - 2단계. 클래스 내부에 static으로 유일한 인스턴스 생성하기
	 * - 3단계. 외부에서 참조할 수 있는 public 메서드 만들기
	 * 
	 * 호출
	 * - 접근클래스명 참조변수 = 접근클래스명.getInstance();
	 * 예) _08_Company com1 = _08_Company.getInstance();  // 클래스명.메서드명
	 */

	}
}