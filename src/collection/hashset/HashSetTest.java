package collection.hashset;

import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {
		HashSet<String> hash=new HashSet<String>();
		hash.add(new String("임정순"));
		hash.add(new String("박현정"));
		hash.add(new String("홍연의"));
		hash.add(new String("강감찬"));
		hash.add(new String("강감찬"));
		
		System.out.println(hash);

	}

}
