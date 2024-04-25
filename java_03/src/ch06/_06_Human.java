package ch06;

public class _06_Human extends _06_Animal{
	
	// 멤버메서드
	@Override
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}
	
	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	}
	
	public void listenMusic() {
		System.out.println("사람이 음악을 듣습니다.");
	}
}
