package chojipjung;

import java.util.ArrayList;

class Book{
	private String name;
	private int price;
	
	public Book(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}


	public int getPrice() {
		return price;
	}

	
}

public class LibraryTest {

	public static void main(String[] args) {
		ArrayList<Book> list=new ArrayList<Book>();
		
		list.add(new Book("java", 25000));
		list.add(new Book("android", 15000));
		list.add(new Book("python", 30000));
		
		int total=list.stream().mapToInt(c->c.getPrice()).sum();
		System.out.println("책 가격의 합: "+total);
		list.stream().filter(c->c.getPrice()>=20000).map(c->c.getName()).sorted().forEach(s->System.out.println(s));

	}

}
