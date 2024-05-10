package ch13;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

// p477
public class _08_ArrayListStreamTest {
	public static void main(String[] args) {
		
	
	// 다형성 적용하여 ArrayList 생성하고, 문자열 추가
	List<String> sList = new ArrayList<String>();
	sList.add("봄");
	sList.add("여름");
	sList.add("가을");
	sList.add("겨울");
	// 스트림 생성
	Stream<String> stream = sList.stream();
	// 스트림 출력
	stream.forEach(s -> System.out.print(s + " "));
	System.out.println();
	// 정렬
	sList.stream().filter(s -> s.length() ==2).sorted().forEach(s -> System.out.print(s + " "));
	}
}
