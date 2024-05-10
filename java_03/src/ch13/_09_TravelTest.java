package ch13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

// p483
public class _09_TravelTest {
	public static void main(String[] args) {
		
		// 1. 교재 stream
		_09_TeamMember memberKJW = new _09_TeamMember("김조원",28,"AB형","음악듣기","INTJ", 250);
		_09_TeamMember memberKSY = new _09_TeamMember("김소연", 28, "B형", "영화보기", "INTP", 300);
		_09_TeamMember memberKJH = new _09_TeamMember("김준혁", 27, "B형", "노래", "INTP", 200);
		_09_TeamMember memberKGY = new _09_TeamMember("김가연", 26, "O형", "예능보기", "ISTJ", 300);
		_09_TeamMember memberJSW = new _09_TeamMember("주성원", 21, "A형", "축구보기", "ENFP", 300);
		
		List<_09_TeamMember> memberList = new ArrayList<>();
		
		memberList.add(memberKJW);
		memberList.add(memberKSY);
		memberList.add(memberKJH);
		memberList.add(memberKGY);
		memberList.add(memberJSW);
		
		Stream<_09_TeamMember> str = memberList.stream();
		
		System.out.println("== 멤버 추가한 순서대로 출력 ==");
		memberList.stream().map(c -> c.getName()).forEach(s -> System.out.println(s));
//		str.map((c, s) -> c.getName(),s.getMbti()).filter(s -> s.getMbti().charAt(1) == 'I').forEach(s -> System.out.println(s));
		
		// 2. for문으로 전체 팀원정보 출력
		for (int i = 0; i < memberList.size(); i++) {
			System.out.println(memberList.get(i));
		}
		// 3. Iterator를 이용해 전체 팀원정보 출력
		Iterator<_09_TeamMember> it = memberList.iterator();
	}
}
