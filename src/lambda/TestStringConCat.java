package lambda;

public class TestStringConCat {

	public static void main(String[] args) {
		StringConCatImpl concat1=new StringConCatImpl();
		
		String s1="hello";
		String s2="world";
		
		concat1.makeString(s1, s2);
		
		StringConCat concat2=(s, v)->System.out.println(s+", "+v);
		concat2.makeString(s1, s2);

	}

}
