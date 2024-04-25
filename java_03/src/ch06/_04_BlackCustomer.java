package ch06;

public class _04_BlackCustomer extends _04_Customer {

	private int penalty;

	public _04_BlackCustomer (){
		super();
	}
	
	public _04_BlackCustomer (int id, String name, String grade, int money, int penalty){
		super(id, name, grade, money);
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