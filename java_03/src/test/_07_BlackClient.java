package test;

public class _07_BlackClient extends _07_Client {

	private int penalty;

	public _07_BlackClient (){

	}
	
	public _07_BlackClient (int id, String name, String grade,int penalty){
		super();
		this.penalty = penalty;
	}

	public int getPenalty(){
		return penalty;
	}	
	public void setPenalty(int penalty){
		this.penalty = penalty;
	}
	
	@Override
	public void showInfo(){
		super.showInfo();
		System.out.println("패널티 : " + penalty);
	}

}