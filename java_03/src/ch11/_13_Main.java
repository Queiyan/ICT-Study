package ch11;

import java.util.ArrayList;
import java.util.List;

public class _13_Main {
	public static void main(String[] args) {
		
		// 매개변수 생성자를 통한 값 전달
		_13_Enum cat = new _13_Enum(Animal.CAT,"야옹이");
		_13_Enum dog = new _13_Enum(Animal.DOG,"댕댕이");
		_13_Enum fish = new _13_Enum(Animal.FISH,"물고기");
		
		// 리스트에 담는다.
		List<_13_Enum> ani = new ArrayList<>();
		
		ani.add(cat);
		ani.add(dog);
		ani.add(fish);
		
		// 향상된 for문(for-each문)으로 출력
		System.out.println("== 출력 ==");
		for (_13_Enum _13_Enum : ani) {
			System.out.println(_13_Enum);
		}
	}
}
