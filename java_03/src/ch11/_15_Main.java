package ch11;

public class _15_Main {
	public static void main(String[] args) {
		_15_SpreadArgs spread = new _15_SpreadArgs();
		
		spread.callArgs("치킨", "피자");
		spread.callArgs2("치킨", "피자", "랍스타", "킹크랩", "감바스");
		spread.callArgs3("치킨", 1,2,3,4,5);
	}
}
