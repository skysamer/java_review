package classPart;

public class Man {
	int age;
	String name;
	boolean marriged;
	int cumCount;
	
	public static void main(String[] args) {
		Man m=new Man();
		
		m.age=40;
		m.cumCount=3;
		m.name="James";
		m.marriged=true;
		
		System.out.println("����: "+m.age);
		System.out.println("�̸�: "+m.name);
		System.out.println("��ȥ����: "+m.marriged);
		System.out.println("�ڽ� ��: "+m.cumCount);
		
	}

}
