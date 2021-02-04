package q4;

public class Star {
	int money;
	
	public String brewing(int money) {
		this.money+=money;
		
		if(money==Menu.STARAMERICANO) {
			return "아메리카노 1잔 구매";
		}
		else if(money==Menu.STARLATTE) {
			return "라테 1잔 구매";
		}
		else
			return null;
	}

}
