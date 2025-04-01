package Yeje.Object;
// Object 클래스의 toString() 메소드 사용하기

class Book{
	int bookNumber;
	String bookTitle;
	
	public Book(int bookNumber, String bookTitle) {
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}
	
	
}

public class Object1 {

	public static void main(String[] args) {
		Book book1 = new Book(200, "개미");
		
		System.out.print(book1);
		System.out.println(book1.toString());

	}

}
