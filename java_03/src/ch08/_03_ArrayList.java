package ch08;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class _03_ArrayList {
	public static void main(String[] args) {
		 
		// 선언
		// 클래스명<> 찹조변수 = new 클래스명<데이터타입클래스>();
		List<String> list = new ArrayList<String>();
		
		list.add("봄");
		list.add("여름");
		list.add("가을");
		list.add("겨울");
		
		// 1.for
		System.out.println("1.for");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		// 2. 향상된 for문
		System.out.println("2. 향상된 for문");
		for (String str : list) {
			System.out.println(str);
		}
		
		// 3. 반복자
		System.out.println("3. 반복자");
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			String obj = itr.next();
			System.out.println(obj);
		}
	}
}
