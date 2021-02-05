package q5car;

import java.util.ArrayList;

public class CarTest {

	public static void main(String[] args) {
		ArrayList<Car> list=new ArrayList<Car>();
		
		list.add(new Sonata());
		list.add(new Grandeur());
		list.add(new Avante());
		list.add(new Genesis());
		
		for(Car c:list) {
			c.run();
			System.out.println("=======================");
		}

	}

}
