package ch11;

// 싱글톤
public class _01_Student {
	
	private String studentName;

	private _01_Student() {};

	private static _01_Student instance = new _01_Student();

	public static _01_Student getInstance(){
		if(instance == null){
			instance = new _01_Student();
		}
		return instance;
	}

	public void setStudentName(String studentName){
		this.studentName = studentName;
	}
	public String getStudentName(){
		return studentName;
	}

	// 학교에 가다
	public void gotoSchool(String student) {
		System.out.println(student + "(이)가 출근하다.");
	}

	// 공부하다 study(String student)
	public void study(String student) {
		System.out.println(student + "(이)가 공부하다.");
	}

	// 점심먹다 gotoCafeteria(String student)
	public void gotoCafeteria(String student) {
		System.out.println(student + "(이)가 점심을 먹다.");
	}

	// 집에가다 gotoHome(String student)
	public void gotoHome(String student) {
		System.out.println(student + "(이)가 집에가다.");
	}
}