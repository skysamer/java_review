package abstractEx;

public class CarTest {

	public static void main(String[] args) {
		Bus b=new Bus();
		AutoCar a=new AutoCar();
		
		b.run();
		a.run();
		
		b.refuel();
		a.refuel();
		
		b.takePassenger();
		a.load();
		
		b.stop();
		a.stop();

	}

}
