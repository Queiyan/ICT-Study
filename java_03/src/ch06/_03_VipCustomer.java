package ch06;

// 자식클래스
public class _03_VipCustomer extends _03_Customer {

	// 멤버변수
	private int agentID;		// vip 고객상담원ID : 9999
	private double saleRation;  // 할인율 : 0.01
	
	// 디폴트 생성자
	public _03_VipCustomer() {
		
	}
	
	// 멤버메서드
	// getter, setter
	public int getAgentID() {
		return agentID;
	}

	public void setAgentID(int agentID) {
		this.agentID = agentID;
	}

	public double getSaleRation() {
		return saleRation;
	}

	public void setSaleRation(double saleRation) {
		this.saleRation = saleRation;
	}
	
	// 재정의(오버라이드)-부모메서드와 자식메서드가 통일할때 자식메서드를 호출
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("vip 고객상담원ID : "+agentID);
		System.out.println("할인율 : "+saleRation);
	}
}
