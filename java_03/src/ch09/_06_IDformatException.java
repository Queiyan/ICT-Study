package ch09;

// p506
// 시용자의 정의  Exception = Exception을 상속받아야 한다.
public class _06_IDformatException extends Exception{
	
	// 매개변수 생성자
	public _06_IDformatException(String message) {
		super(message); // 부모(=Exception) 매개변수 생성자 호출
	}
	
}
