package ch06;

public class _06_Main {

	public static void main(String[] args) {

		System.out.println("[ 다형성 적용 ]");
		
		// 부모클래스 참조변수 = new 자식클래스();
//		_06_Animal human = new _06_Human();
//
//		human.move();
//
//		_06_Animal tiger = new _06_Tiger();
//
//		tiger.move();
//
//		_06_Animal eagle = new _06_Eagle();
//
//		eagle.move();
		
		animalMove(new _06_Human());
		animalMove(new _06_Tiger());
		animalMove(new _06_Eagle());
		
		
	}

	public static void animalMove(_06_Animal animal) {
		animal.move();
		
		if(animal instanceof _06_Human) {
			_06_Human human = (_06_Human) animal;// 다운캐스팅
			human.readBook(); 		
			human.listenMusic();
		}
		else if(animal instanceof _06_Tiger) {
			_06_Tiger tiger = (_06_Tiger) animal;
			tiger.hunting();
		}
		else{
			_06_Eagle eagle = (_06_Eagle) animal;
			eagle.flying();
		}
		
	}
}
