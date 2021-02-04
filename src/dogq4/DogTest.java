package dogq4;

public class DogTest {

	public static void main(String[] args) {
		Dog[] dog=new Dog[5];
		
		dog[0]=new Dog("a", "1");
		dog[1]=new Dog("b", "2");
		dog[2]=new Dog("c", "3");
		dog[3]=new Dog("d", "4");
		dog[4]=new Dog("e", "5");
		
		for(Dog d: dog) {
			System.out.println(d.showDogInfo());
		}

	}

}
