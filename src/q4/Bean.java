package q4;

public class Bean {
	int money;
	
	public String brewing(int money) {
		this.money+=money;
		
		if(money==Menu.BEANAMERICANO) {
			return "아메리카노 1잔 구매";
		}
		else if(money==Menu.BEANLATTE) {
			return "라테 1잔 구매";
		}
		else
			return null;
	}

}
