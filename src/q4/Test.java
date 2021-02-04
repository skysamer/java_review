package q4;

public class Test {

	public static void main(String[] args) {
		Man kim=new Man("±è¾¾", 10000);
		Man lee=new Man("ÀÌ¾¾", 12000);
		
		Star star=new Star();
		Bean bean=new Bean();
		
		kim.buyStarCoffee(star, 4000);
		lee.buybeanCoffee(bean, 4500);

	}

}
