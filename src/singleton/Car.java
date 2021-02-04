package singleton;

public class Car {
	private int carNum;
	private static int serialNum=10000;
	
	public Car() {
		serialNum++;
		carNum=serialNum;
	}

	public int getCarNum() {
		carNum++;
		return carNum;
	}

	public void setCarNum(int carNum) {
		this.carNum = carNum;
	}
	
	

}
