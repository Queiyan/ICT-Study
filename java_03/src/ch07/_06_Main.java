package ch07;

public class _06_Main {

	public static void main(String[] args) {
		// 자식매개변수 생성자를 통한 값 전달(등록번호, 타이틀, 대출여부)
	    // checkOut() 호출시점에 값 전달(대출자, 대출일자)
	    // 대출상태 판단은 상수를 이용
		
		
		
		_06_CDInfo hongIn = new _06_AppCDInfo("R001","노인과바다",0);
		_06_Lendable CD1 = (_06_AppCDInfo) hongIn;
		CD1.checkOut("홍길동","2023-12-08");
		System.out.println();
		CD1.checkIn();
		
		System.out.println("\n==========================\n");
		
		_06_CDInfo hongOut = new _06_AppCDInfo("R001","노인과바다",1);
		_06_Lendable CD2 = (_06_AppCDInfo) hongOut;
		CD2.checkOut("홍길동","2023-12-08");
		System.out.println();
		CD2.checkIn();
	}
	/*  출력결과
    
	   === 책 대여시 ===
	   대출되었습니다
	   도서번호 : R001
	   도서제목 : 노인과바다
	   대출인 : 홍길동
	   대출일 : 2023-12-08

	   === 이미 대출된 상태인데 대출시도할 때 ===
	   대출하실 수 없습니다

	   === 책 반납시 ===
	   반납되었습니다.
	   반납인 : 홍길동

	   === 이미 반납된 상태일때 책 반납시 ===
	   이미 반납된 상태입니다

	   */
	
}
