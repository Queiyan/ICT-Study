package ch11;

// p356
class Book1{
	int bookNumber;
	String bookTitle;
	
	Book1(int bookNumber, String bookTitle){
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}
	
	@Override
	public String toString() {
		return bookTitle + "," + bookNumber;
	}
}

public class _03_Book {
	public static void main(String[] args) {
		Book book1 = new Book(200, "개미");
		
		System.out.println(book1);
		System.out.println(book1.toString());
	}
}
