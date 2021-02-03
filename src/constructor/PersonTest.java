package constructor;

public class PersonTest {

	public static void main(String[] args) {
		Person personKim=new Person();
		personKim.name="김유신";
		personKim.height=85.5f;
		personKim.weight=180.0f;
		
		Person personLee=new Person("이순신", 175, 75);
		
		

	}

}
