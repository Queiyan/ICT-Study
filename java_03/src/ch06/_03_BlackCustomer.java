package ch06;

public class _03_BlackCustomer extends _04_Customer {

	private int penalty;

	public _03_BlackCustomer (){

	}
	
	public _03_BlackCustomer (int id, String name, String grade,int penalty){
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
	public void printInfo(){
		super.printInfo();
		System.out.println("패널티 : " + penalty);
	}

}