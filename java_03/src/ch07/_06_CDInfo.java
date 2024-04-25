package ch07;


public class _06_CDInfo {
	private String registerNo;   // 등록번호  "R001"
	   private String title;   // 타이틀   "노인과바다"
	   
	   // 디폴트 생성자
	   public _06_CDInfo() {}
	   
	   // 매개변수 생성자
	   public _06_CDInfo(String registerNo, String title) {
	      this.registerNo = registerNo;
	      this.title = title;
	   }
	   
	   // 멤버메서드
	   public String getRegisterNo() {
	      return registerNo;
	   }
	   
	   public void setRegisterNo(String registerNo) {
	      this.registerNo = registerNo;
	   }
	   
	   public String getTitle() {
	      return title;
	   }
	   
	   public void setTitle(String title) {
	      this.title = title;
	   }
}
