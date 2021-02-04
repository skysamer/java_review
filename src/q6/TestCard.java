package q6;

public class TestCard {

	public static void main(String[] args) {
		CardCompany company=CardCompany.getInstance();
		
		Card c1=company.createCard();
		Card c2=company.createCard();
		
		System.out.println(c1.getCardNum());
		System.out.println(c2.getCardNum());

	}

}
