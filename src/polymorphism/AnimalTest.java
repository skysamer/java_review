package polymorphism;

import java.util.ArrayList;

class Animal {
	public void move() {
		System.out.println("�������� ���δ�.");
	}
}

class Human extends Animal{
	public void move() {
		System.out.println("�� �߷� ������.");
	}
	
	public void readBook() {
		System.out.println("å�� �д´�.");
	}
}


class Tiger extends Animal{
	public void move() {
		System.out.println("�� �߷� ������.");
	}
	
	public void hunting() {
		System.out.println("����� �Ѵ�.");
	}
}

class Eagle extends Animal{
	public void move() {
		System.out.println("�ϴ��� ����.");
	}
	
	public void flying() {
		System.out.println("������ ��� ���ư�.");
	}
}

public class AnimalTest{
	ArrayList<Animal> list=new ArrayList<Animal>();
	
	
	public static void main(String[] args) {
		AnimalTest a=new AnimalTest();
		
		a.addAnimal();
		System.out.println("���� ������ �ٿ� ĳ����");
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
				System.out.println("�������� �ʴ� ���Դϴ�.");
		}
	}
}

