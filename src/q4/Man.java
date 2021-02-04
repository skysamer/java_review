package q4;

public class Man {
	String name;
	int money;
	
	public Man(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	public void buyStarCoffee(Star sCoffee, int money) {
		String msg=sCoffee.brewing(4000);
		if(msg!=null) {
			this.money=money;
			System.out.println(name   + money +   msg);
		}
	}
	
	public void buybeanCoffee(Bean bCoffee, int money) {
		String msg=bCoffee.brewing(4500);
		if(msg!=null) {
			this.money=money;
			System.out.println(name +  money + msg);
		}
	}
	

}
