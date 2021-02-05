package polymorphism;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {
		ArrayList<Customer> list=new ArrayList<Customer>();
		
		Customer lee=new Customer(10010, "�̼���");
		Customer shin=new Customer(10020, "�Ż��Ӵ�");
		Customer hong=new GoldCustomer(10030, "ȫ�浿");
		Customer youl=new GoldCustomer(10040, "������");
		Customer kim=new VIPCustomer(10050, "������", 12345);
		
		list.add(lee);
		list.add(shin);
		list.add(hong);
		list.add(youl);
		list.add(kim);
		
		System.out.println("==== �� ���� ��� ====");
		for(Customer c:list) {
			System.out.println(c.showCustomerInfo());
		}
		
		System.out.println("==== �������� ���ʽ� ����Ʈ ��� ====");
		int price=10000;
		for(Customer c:list) {
			int cost=c.calcPrice(price);
			System.out.println(c.getCustomerName()+"���� "+cost+"�� �����ϼ̽��ϴ�.");
			System.out.println(c.getCustomerName()+"���� ���ʽ� ����Ʈ�� "+c.bonusPoint+"���Դϴ�.");
		}

	}

}
