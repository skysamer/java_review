package q4;

public class Star {
	int money;
	
	public String brewing(int money) {
		this.money+=money;
		
		if(money==Menu.STARAMERICANO) {
			return "�Ƹ޸�ī�� 1�� ����";
		}
		else if(money==Menu.STARLATTE) {
			return "���� 1�� ����";
		}
		else
			return null;
	}

}
