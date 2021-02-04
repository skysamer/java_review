package dogq4;

import java.util.ArrayList;

public class DogTestArrayList {

	public static void main(String[] args) {
		ArrayList<Dog> dogArr=new ArrayList<Dog>();
		
		dogArr.add(new Dog("a", "1"));
		dogArr.add(new Dog("b", "2"));
		dogArr.add(new Dog("c", "3"));
		dogArr.add(new Dog("d", "4"));
		dogArr.add(new Dog("e", "5"));
		
		for(Dog d:dogArr) {
			System.out.println(d.showDogInfo());
		}

	}

}
