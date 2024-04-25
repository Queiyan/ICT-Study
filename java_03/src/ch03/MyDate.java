package ch03;

public class MyDate {
	private int day;
	private int month;
	private int year;
	
	public void setDay(int day) {
		if(month == 2) {
			if(day < 1|| day > 28) {
				System.out.println("오류입니다.");
			} else {
				this.day = day;
			}
		}
	}
	
	public void setMonth(int month) {
		this.month = month;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public void dateInfo() {
		System.out.println("년 :"+year);
		System.out.println("월 :"+month);
		System.out.println("일 :"+day);
	}
}
