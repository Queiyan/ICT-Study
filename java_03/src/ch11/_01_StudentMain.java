package ch11;

public class _01_StudentMain {
	public static void main(String[] args){
		_01_Student st =  _01_Student.getInstance();

		String name = "홍길동";

		st.gotoSchool(name);
		st.study(name);
		st.gotoCafeteria(name);
		st.gotoHome(name);
		

	}
}