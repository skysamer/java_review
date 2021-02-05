package polymorphism;

import java.util.ArrayList;

class Animal {
	public void move() {
		System.out.println("움직임이 전부다.");
	}
}

class Human extends Animal{
	public void move() {
		System.out.println("두 발로 움직임.");
	}
	
	public void readBook() {
		System.out.println("책을 읽는다.");
	}
}


class Tiger extends Animal{
	public void move() {
		System.out.println("네 발로 움직임.");
	}
	
	public void hunting() {
		System.out.println("사냥을 한다.");
	}
}

class Eagle extends Animal{
	public void move() {
		System.out.println("하늘을 난다.");
	}
	
	public void flying() {
		System.out.println("날개를 펴고 날아감.");
	}
}

public class AnimalTest{
	ArrayList<Animal> list=new ArrayList<Animal>();
	
	
	public static void main(String[] args) {
		AnimalTest a=new AnimalTest();
		
		a.addAnimal();
		System.out.println("원래 형으로 다운 캐스팅");
		a.testCasting();
		
	}
	
	public void addAnimal() {
		list.add(new Human());
		list.add(new Tiger());
		list.add(new Eagle());
		
		for(Animal a:list) {
			a.move();
		}
	}
	
	public void testCasting() {
		for(int i=0; i<list.size(); i++) {
			Animal ani=list.get(i);
			if(ani instanceof Human) {
				Human h=(Human)ani;
				h.readBook();
			}
			else if(ani instanceof Tiger) {
				Tiger t=(Tiger)ani;
				t.hunting();
			}
			else if(ani instanceof Eagle) {
				Eagle e=(Eagle)ani;
				e.flying();
			}
			else
				System.out.println("지원되지 않는 형입니다.");
		}
	}
}

