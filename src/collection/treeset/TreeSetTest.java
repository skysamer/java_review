package collection.treeset;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		TreeSet<String> tree=new TreeSet<String>();
		
		tree.add("홍길동");
		tree.add("강감찬");
		tree.add("이순신");
		
		for(String str:tree) {
			System.out.println(str);
		}

	}

}
