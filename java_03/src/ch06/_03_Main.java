package ch06;

public class _03_Main {

	public static void main(String[] args) {
		
		// 고객정보 출력 + vip 정보 출력
		_03_VipCustomer vip = new _03_VipCustomer();
		// 부모클래스 호출
		vip.setId(1001);
		vip.setName("김태희");
		vip.setGrade("VIP");
		
		vip.printInfo();
		
		// 자식클래스 호출
		vip.setAgentID(9999);
		vip.setSaleRation(0.01);
		
		vip.printInfo();
		
		
	}

}
