package ch08;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _10_LoginHashMap {
	public static void main(String[] args) {
		/* [시험, 플젝]
	       * 1. id, pwd 5건을 hashtable에 저장(hashMap에 저장) - put
	       * 2. 콘솔로부터 id, password를 입력받는다.(로그인을 위해)
	       *    1과 2를 비교해서
	       * 3. 아이디가 없으면 "입력하신 아이디가 존재하지 않습니다." 출력
	       *    아이디가 있으면 비밀번호와 비교해서 일치시 "로그인 성공" 출력
	       *                                불일치시 "비밀번호가 불일치" 출력
	       * 4. id입력시 Q나 q를 입력시 종료  :  System.exit(0) // 정상종료, break, return;
	       * 문자열 비교 =>  입력값.equals(비교값)
	       * 
	       *  key      value    
	       *    id       password
	       * "park"   "park1234"
	       * "kim"    "kim1234"
	       * "lee"    "lee1234"
	       * "son"    "son1234"
	       * "choi"   "choi1234"
	       */
		// 1. id, pwd 5건을 hashtable에 저장(hashMap에 저장) - put
		
		HashMap<String, String> user = new HashMap<>();
		Scanner sc = new Scanner(System.in);
			
			
			user.put("park", "park1234");
			user.put("kim", "kim1234");
			user.put("lee", "lee1234");
			user.put("son", "son1234");
			user.put("choi", "choi1234");
		
			System.out.println("=== id,pw 등록하기 \"Q\"를 입력하면 로그인 ===");
			
			// put scanner
			while(true) {
				System.out.println("아이디를 입력하세요.");
				String id = sc.next();
				if(id.equals("q") || id.equals("Q")) {
					System.out.println("종료합니다.");
					break;
				}

				else {
					System.out.println("비밀번호를 입력하세요.");
					String pw = sc.next();
					user.put(id, pw);
				}
				
			}
			// put scanner end
			System.out.println("====== 출력 ======");
			
			for (Map.Entry<String, String> entry : user.entrySet() ) {
				String key = entry.getKey();
				String value = entry.getValue();
				
				System.out.println("아이디 : " + key + ", 비밀번호 : " + value);
			}
			
			// login
			while(true) {
				System.out.println("======= 로그인 =======");
				System.out.println("아이디를 입력해 주세요");
				String idS = sc.next();
				
				if(idS.equals("q") || idS.equals("Q")) {
					System.out.println("종료합니다.");
					sc.close();
					System.exit(0);
				}
				
				if(user.containsKey(idS)) {
					System.out.println("비밀번호를 입력해 주세요");
					String pwS = sc.next();
					if(user.containsValue(pwS)) {
						System.out.println("=== 로그인 성공 ===");
						
					}else {
						System.out.println("비밀번호가 불일치");
						
					}
				}else {
					System.out.println("입력하신 아이디가 존재하지 않습니다. 다시 입력해 주세요");
					
				}
			}
			
	}
}