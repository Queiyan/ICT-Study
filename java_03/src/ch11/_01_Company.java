package ch11;

public class _01_Company {
	
	// 멤버변수
	private String worker; // 홍길동
	
	// 1단계. 디폴트생성자를 private으로 만들기
	private _01_Company() {}
	
	// 2단계. 클래스 내부에 static으로 유일한 인스턴스 생성하기
	private static _01_Company instance = new _01_Company();
	
	// 3단계. 외부에서 참조할 수 있는 public 메서드 만들기
	// static 메서드 접근 : 클래스명.메서드명();
	// 쓰레드의 synchronized를 추가시 lock처리 => 성능저하
	// 			└추가 안하면 동시에 접근할 수 있으므로 충돌발생해서 객체생성이 안될 수 있으므로 if문 추가
	public static _01_Company getInstance() {
		if (instance == null) {
			instance = new _01_Company();
		} // synchronized 대체 (synchronized는 사용안함)
		return instance;
	}
	
	public String getWorker() {
		return worker;
	}

	public void setWorker(String worker) {
		this.worker = worker;
	}

	// 멤버메서드
	// 출근하다. gotoWork(String worker)
	public void gotoWork(String worker) {
		System.out.println(worker + "이가 출근하다.");
	}
	
	// 일하다. work(String worker)
	public void work(String worker) {
		System.out.println(worker + "이가 일하다.");
	}
	
	// 점심먹다. gotoCafeteria(String worker)
	public void gotoCafeteria(String worker) {
		System.out.println(worker + "이가 점심먹다.");
	}
	
	// 퇴근하다. gotoHome(String worker)
	public void gotoHome(String worker) {
		System.out.println(worker + "이가 퇴근하다.");
	}

}

