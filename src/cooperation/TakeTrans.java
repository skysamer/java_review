package cooperation;

public class TakeTrans {

	public static void main(String[] args) {
		Student studentJames=new Student("James", 5000);
		Student studentTomas=new Student("Tomas", 10000);
		Student studentEdward=new Student("Edward", 10000);
		
		Bus bus100=new Bus(100);
		studentJames.takeBus(bus100);
		studentJames.showInfo();
		bus100.showInfo();
		
		Subway subwaygreen=new Subway("2È£¼±");
		studentTomas.takeSubway(subwaygreen);
		studentTomas.showInfo();
		subwaygreen.showInfo();
		
		Taxi taxi=new Taxi();
		studentEdward.takeTaxi(taxi);
		studentEdward.showInfo();
		taxi.showInfo();
		

	}

}
