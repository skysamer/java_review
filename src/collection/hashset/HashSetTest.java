package collection.hashset;

import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {
		HashSet<String> hash=new HashSet<String>();
		hash.add(new String("������"));
		hash.add(new String("������"));
		hash.add(new String("ȫ����"));
		hash.add(new String("������"));
		hash.add(new String("������"));
		
		System.out.println(hash);

	}

}
