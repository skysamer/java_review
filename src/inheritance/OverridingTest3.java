package inheritance;

public class OverridingTest3 {

	public static void main(String[] args) {
		int price=10000;
		
		Customer lee=new Customer(10010, "�̼���");
		System.out.println(lee.getCustomerName()+"���� �����ؾ� �ϴ� �ݾ��� "+lee.calcPrice(price)+"�� �Դϴ�.");
		
		VIPCustomer kim=new VIPCustomer(10020, "������", 12345);
		System.out.println(kim.getCustomerName()+"���� �����ؾ� �ϴ� �ݾ��� "+kim.calcPrice(price)+"�� �Դϴ�.");
		
		Customer vc=new VIPCustomer(10030, "����", 2000);
		System.out.println(vc.getCustomerName()+"���� �����ؾ� �ϴ� �ݾ��� "+vc.calcPrice(10000)+"�� �Դϴ�.");

	}

}
