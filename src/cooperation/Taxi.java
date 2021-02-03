package cooperation;

public class Taxi {
	int passengerCount;
	int money;
	
	
	public void take(int money) {
		this.money+=money;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.printf("택시의 승객은 %d명이고, 수입은 %d입니다.%n", passengerCount, money);
	}

}
