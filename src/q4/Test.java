package q4;

public class Test {

	public static void main(String[] args) {
		Man kim=new Man("�达", 10000);
		Man lee=new Man("�̾�", 12000);
		
		Star star=new Star();
		Bean bean=new Bean();
		
		kim.buyStarCoffee(star, 4000);
		lee.buybeanCoffee(bean, 4500);

	}

}
