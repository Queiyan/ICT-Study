package ch03;

public class _03_MyInfoMain {
	public static void main(String[] args) {
		/*
		 * 객체생성 : 클래스명 참조변수 = new 클래스명();
		 * 참조변수 : 생성된 클래스의 힙메모리 주소값이 들어있다.
		 * 멤버변수, 멤버메서드 접근
		 * 
		 */
		// 1. 디폴트 생성자 호출 -> setter로 값 전달
		_03_MyInfo myInfo = new _03_MyInfo(); // 디폴트 생성자 호출
		// 방법1. setter로 값 전달 -> showInfo()로 출력
		
		myInfo.setName("홍길동");
		myInfo.setBirthday("1월1일");
		myInfo.setMoney(10000000);
		myInfo.setAddress("서울");
		
		
		System.out.println("===== showInfo() =====");

		myInfo.showInfo();
		
		// 방법2. setter로 값 전달 -> getter로 출력
		System.out.println("===== getter() =====");
		System.out.println("이름 : " +  myInfo.getName());
		System.out.println("생일 : " +  myInfo.getBirthday());
		System.out.println("자산 : " +  myInfo.getMoney());
		System.out.println("주소 : " +  myInfo.getAddress());
	
		// 2.매개변수 생성자 호출
		_03_MyInfo myInfo2 = new _03_MyInfo("김준혁","10월14일",500,"주안동");
		
		System.out.println();
		myInfo2.showInfo();
		
		System.out.println("===== getter() =====");
		System.out.println("이름 : " +  myInfo2.getName());
		System.out.println("생일 : " +  myInfo2.getBirthday());
		System.out.println("자산 : " +  myInfo2.getMoney());
		System.out.println("주소 : " +  myInfo2.getAddress());
	}
}
