package test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class _12_BookHashMap {

	private Map<Integer, _12_Book> bookMap;
	
	// 디폴트 생성자
	public _12_BookHashMap (){
		bookMap = new HashMap<Integer, _12_Book>();
	}

	// 책 추가
	public void addBook(_12_Book book){
		bookMap.put(book.getBookNo(), book);
	}

	// 책 삭제
	public boolean removeBook(int rebookNo){
		if(bookMap.containsKey(rebookNo)) {
			bookMap.remove(rebookNo);
			return true;
		}
		System.out.println(rebookNo + "번 책번호가 존재하지 않습니다.");
		return false;
	}

	// 책 조회 - Iterator 사용
	public void showBookInfo(){

		Iterator<Integer> itr = bookMap.keySet().iterator();

		while(itr.hasNext()){
			int key = itr.next();
			_12_Book book = bookMap.get(key);
			System.out.println(book);
		}
		System.out.println();
	}
}