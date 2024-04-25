package ch06;

// 자식클래스
public class _04_VipCustomer extends _04_Customer {

	// 멤버변수
	private int agentID;		// vip 고객상담원ID : 9999
	private double saleRation;  // 할인율 : 0.01
	
	// 디폴트 생성자
	public _04_VipCustomer() {
		super();
	}
	
	// 매개변수 생성자
	public _04_VipCustomer(int id, String name, String grade,int money, int agentID, double saleRation) {
		super(id, name, grade, money);
		this.agentID = agentID;
		this.saleRation = saleRation;
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
	/* p244
     * super : 부모의 참조변수
     *  - 하위클래스에서 상위클래스로 접근할 때 사용한다.
     *    하위클래스는 상위클래스의 주소, 즉 참조값을 알고 있다.
     *    예) super.printInfo(); // 참조변수.메서드
     		super.name = "김태희"; // 참조변수.멤버변수 => 단 멤버변수는 protected 접근자.
     *  - 상위클래스의 생성자를 호출할 때도 사용한다.
     *    예) super();  // 부모 디폴트 생성자
     *    예) super(sabun, name, deptName, salary);  // 부모 매개변수 생성자
     *    cf) this : 자기자신의 주소값
     */

}
