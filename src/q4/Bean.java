package q4;

public class Bean {
	int money;
	
	public String brewing(int money) {
		this.money+=money;
		
		if(money==Menu.BEANAMERICANO) {
			return "�Ƹ޸�ī�� 1�� ����";
		}
		else if(money==Menu.BEANLATTE) {
			return "���� 1�� ����";
		}
		else
			return null;
	}

}
