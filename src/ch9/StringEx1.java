package ch9;

public class StringEx1 {

	public static void main(String[] args) {
		String str1="abc";
		String str2="abc";
		
		System.out.println("String str1=\"abc\";");
		System.out.println("String str2=\"abc\";");
		
		System.out.println("str1==str2 ? "+(str1==str2));
		System.out.printf("str2.equals(str2) ? %b%n", str1.equals(str2));
		
		String str3=new String("abc");
		String str4=new String("abc");
		
		System.out.println("String str3=\"abc\";");
		System.out.println("String str4=\"abc\";");
		
		System.out.println("str3==str4 ? "+(str3==str4));
		System.out.printf("str3.equals(str4) ? %b%n", str3.equals(str4));

	}

}
