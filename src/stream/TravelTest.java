package stream;

import java.util.ArrayList;

public class TravelTest {

	public static void main(String[] args) {
		TravelCustomer lee=new TravelCustomer("�̼���", 40, 100);
		TravelCustomer kim=new TravelCustomer("������", 20, 100);
		TravelCustomer hong=new TravelCustomer("ȫ�浿", 13, 50);
		
		ArrayList<TravelCustomer> list=new ArrayList<TravelCustomer>();
		
		list.add(lee);
		list.add(kim);
		list.add(hong);
		
		System.out.println("====�� ��� �߰��� ������� ��� ====");
		list.stream().map(c->c.getName()).forEach(s->System.out.println(s));
		
		int total=list.stream().mapToInt(c->c.getPrice()).sum();
		System.out.println("�� ���� ���: "+total);
		
		System.out.println("=== 20�� �̻� �� ��� �����Ͽ� ��� ===");
		list.stream().filter(c->c.getAge()>=20).map(c->c.getName()).sorted().forEach(s->System.out.println(s));

	}

}
