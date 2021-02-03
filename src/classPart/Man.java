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
		
		System.out.println("나이: "+m.age);
		System.out.println("이름: "+m.name);
		System.out.println("결혼여부: "+m.marriged);
		System.out.println("자식 수: "+m.cumCount);
		
	}

}
