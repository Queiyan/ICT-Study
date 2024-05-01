package ch08;

import java.util.HashMap;
import java.util.Map;

public class _07_HashMapEx {
   public static void main(String[] args) {
      /*  p406 p439
          * 해싱(hashing) : 키를 이용해서 해시테이블로부터 데이터를 가져오는 과정
          * 
          * [면접] p439
          * HashMap
          * 1) 특징
          * - 데이터의 순서를 보장하지 않는다.
          * - key와 value 쌍으로 저장한다.
          * - key는 중복되면 안된다. value 값은 중복되도 무관하다.
          * - key를 이용해서 value를 가져올 수 있다.
          * - List 계열과 달리 index가 없다. 
          * - Map이라는 인터페이스를 구현한 클래스이다.
          * 
          * 2) 선언
          * - HashMap<Key 클래스타입, value 클래스타입> map = new HashMap<Key 클래스타입, value 클래스타입>();
          * - Map<Key 클래스타입, value 클래스타입> map = new HashMap<Key 클래스타입, value 클래스타입>(); // 다형성 적용
          * Map(부모인터페이스)
          * 3) 메서드
          * - 데이터 추가 : put(key, value);
          * - 데이터 가져오기 : get(key)
          * - 데이터 삭제 : remove(key)
          * - 데이터가 비어있는지 여부 : isEmpty()
          * - 해당 키가 있는지 여부 : containsKey(key)
          * - 해당 값이 있는지 여부 : containsValue(value)
          * - 해당 갯수 : size()
          */
      Map<Integer,String> map = new HashMap<Integer,String>();
      //1."박은종" 2."유재석"  *Integer => int의 클래스타입
      map.put(1, "박은종");
      map.put(2, "유재석");
      map.put(3, "박나래");
      map.put(4, "김연아");
      
      for(int i=1; i<=map.size();i++) {   //index가 없기 때문에 key의 값이 해당번호 그대로를 의미함
         System.out.println(map.get(i)); //i = key
      }
      System.out.println();
      //박나래
      System.out.println(map.get(3));
      
      System.out.println("--김태희 삭제후에 전체 데이터 출력--");
      map.remove(4); //삭제
      for(int i=1; i<=map.size();i++) {   
         System.out.println(map.get(i)); 
      }
      //데이터가 비어있는지 확인
      System.out.println(map.isEmpty());//false
      System.out.println("=해당키가 있는지 여부 : containsKey(key)=");
      System.out.println(map.containsKey(1)); //true
      System.out.println(map.containsKey(4)); //위에서 이미 삭제됨 => false
      
      System.out.println("=해당값이 있는지 여부 : containsValue(value)=");
      System.out.println(map.containsValue("유재석"));//true
      System.out.println(map.containsValue("김태희"));//위에서 이미 삭제됨 => false
      
      System.out.println("해당개수 : " + map.size());
   
   }
}