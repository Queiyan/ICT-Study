package test;

public class _07_VipClient extends _07_Client {
	
	// 멤버변수
	private int agentID;		// vip 고객상담원ID : 9999
	private double saleRatio;	// 할인율 : 0.01
	
	// 디폴트 생성자
	public _07_VipClient (){

	}
	
	// 매개변수 생성자
	public _07_VipClient (int id, String name, String grade,int agentID, double saleRatio){
		super();
		this.agentID = agentID;
		this.saleRatio = saleRatio;
	}
	
	// 멤버메서드(getter, setter)
	public int getAgentID(){
		return agentID;
	}	
	public void setAgentID(int agentID){
		this.agentID = agentID;
	}
	public double  getSaleRatio(){
		return saleRatio;
	}	
	public void setSaleRatio(double  saleRatio){
		this.saleRatio = saleRatio;
	}
	
	@Override
	public void showInfo(){
		super.showInfo();
		System.out.println("vip 고객상담원ID : " + agentID);
		System.out.println("할인율 : " + saleRatio);
	}
	
}
