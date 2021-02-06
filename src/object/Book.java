package object;

public class Book {
	int bookNumber;
	String bookTitle;
	
	public Book(int bookNumber, String bookTitle) {
		this.bookNumber=bookNumber;
		this.bookTitle = bookTitle;
	}
	
	
	
	@Override
	public String toString() {
		return bookTitle+", "+bookNumber;
	}



	public static void main(String[] args) {
		Book b=new Book(200, "°³¹Ì");
		System.out.println(b);
		System.out.println(b.toString());
	}
	 
	

}
