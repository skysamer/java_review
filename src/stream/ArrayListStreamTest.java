package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {

	public static void main(String[] args) {
		List<String> s=new ArrayList<String>();
		s.add("Tomas");
		s.add("Edward");
		s.add("Jack");
		
		Stream<String> stream=s.stream();
		stream.forEach(v->System.out.println(v+" "));
		System.out.println();
		s.stream().sorted().forEach(v->System.out.println(v));

	}

}
