package ch08;

import java.util.HashMap;
import java.util.Map;

public class _09_MemberHashMap {
	public static void main(String[] args) {
		// HashMap 생성 - 다형성
		Map<String, _09_Member> map = new HashMap<>();
		
		// 값 전달 : 매개변수 생성자 -> 멤버변수
		_09_Member hong = new _09_Member(1001,"홍길동","HGD@gmail.com");
		_09_Member kim = new _09_Member(1002,"김태희","KTH@gmail.com");
		_09_Member iu = new _09_Member(1003,"아이유","IU@gmail.com");
		
		// 데이터 추가 : 참조변수.put(key, value);
		map.put("M001", hong);
		map.put("M002", kim);
		map.put("M003", iu);
		
		System.out.println(map);
		// M003=회원아이디 : 1003, 회원명 : 아이유, 이메일 : IU@gmail.com
		// M002=회원아이디 : 1002, 회원명 : 김태희, 이메일 : KTH@gmail.com
		// M001=회원아이디 : 1001, 회원명 : 홍길동, 이메일 : HGD@gmail.com
		
		// 멤버삭제 : 참조변수.remove(key);
		map.remove("M002");
		System.out.println(map);
		
		// 멤버변경 - replace();
		map.put("M003", new _09_Member(1003, "박명수","PMS@gmaii.com"));
		System.out.println(map);
		
		// 멤버추가 M004 | 1004 카리나
		map.put("M004", new _09_Member(1004, "카리나","KLN@gmaii.com"));
		System.out.println(map);
		
		// 방법1. Iterator를 이용해 반복자
		
		// 방법2. Entry를 이용해 key, value 출력
		// Map.Entry<String, _09_Member> => Interface
		// entrySet() : Map 객체의 내용을 출력하는 방법
		//				=> Map에서 모든 Entry(key-value쌍)을 가져와 Set 객체로 반환합니다.
		System.out.println("=== 방법2. Entry를 이용해 key, value 출력 ===");
		for (Map.Entry<String, _09_Member> entry : map.entrySet() ) {
			String key = entry.getKey();
			_09_Member value = entry.getValue();
			
			System.out.println("Key : " + key + ", value : " + value);
		}
		
		
	}
}
