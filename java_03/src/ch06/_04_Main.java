package ch06;

public class _04_Main {

	public static void main(String[] args) {
		
		System.out.println("==== VIP ===");
		System.out.println("== <방법1> setter로 값 전달 ==");
		// 고객정보 출력 + vip 정보 출력
//		_04_VipCustomer vip = new _04_VipCustomer();
		
		
		// 부모정보 출력
//		vip.setId(1004);
//		vip.setName("김태희");
//		vip.setGrade("VIP");
//		
//		vip.printInfo();
//		
//		// 자식클래스 호출
//		vip.setAgentID(777);
//		vip.setSaleRation(0.01);
//		
//		vip.printInfo();
		
		System.out.println("== <방법2> 매개변수로 값 전달 ==");
		
		// 자식 매개변수 성성자 호출
		_04_Customer vip2 = new _04_VipCustomer(1004, "김태희", "VIP",2000, 777, 0.02);
		
		vip2.printInfo();
		
		System.out.println("-----------------");
		
		System.out.println("==== Black ====");
		System.out.println("== <방법1> setter로 값 전달 ==");
		
//		_04_BlackCustomer black = new _04_BlackCustomer();
		// 부모정보 출력
//		black.setId(6666);
//		black.setName("진상2");
//		black.setGrade("Black2");
//		
//		black.setPenalty(333);
//		
//		black.printInfo();
		System.out.println("== <방법2> 매개변수로 값 전달 ==");
		
		_04_Customer black2 = new _04_BlackCustomer(6666,"진상2","Black2",10,333);
		
		black2.printInfo();
	}

}
