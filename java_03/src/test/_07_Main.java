package test;

public class _07_Main {
	public static void main(String[] args){
		
		_07_VipClient  vip = new _07_VipClient(1001 ,"김태희" ,"VIP" ,9999 ,0.01);

		_07_BlackClient bk = new _07_BlackClient(1002 ,"조나단" ,"black" ,1000);

//		vip.setId(1001);
//		vip.setName("김태희");
//		vip.setGrade("VIP");
//		vip.setAgentID(9999);
//		vip.setSaleRatio(0.01);
		
		
		vip.showInfo();
		
		System.out.println("--------------------");

		bk.setId(1002);
		bk.setName("조나단");
		bk.setGrade("black");
		bk.setPenalty(1000);

		bk.showInfo();
	}
}