package ch08;

public class _06_BookListMain {
	public static void main(String[] args) {
		
		_06_BookArrayList bookL = new _06_BookArrayList();
		
		bookL.addBook(new _06_Book(101,"JAVA","박은종"));
		bookL.addBook(new _06_Book(102,"JSP","박명수"));
		bookL.addBook(new _06_Book(103,"SPRING","김유신"));
		
		System.out.println("[ 전체 책정보 출력 ]");
		bookL.showAllBookInfo();
		
		bookL.removeBook(102); // 102번 번호를 가진 책정보 삭제
		
		System.out.println();
		System.out.println("[ 삭제 후 전체 책정보 출력 ]");
		bookL.showAllBookInfo();
	}
}
