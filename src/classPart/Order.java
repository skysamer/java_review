package classPart;

public class Order {
	String orderNum;
	String CustomerID;
	String date;
	String customerName;
	String address;
	String giftNum;
	
	public static void main(String[] args) {
		Order o=new Order();
		
		o.address="����� �������� ���ǵ��� 20����";
		o.CustomerID="abc123";
		o.customerName="ȫ���";
		o.date="2018�� 3�� 12��";
		o.giftNum="PD0345-12";
		o.orderNum="201803120001";
		
		System.out.println("�ֹ� ��ȣ: "+o.orderNum);
		System.out.println("�ֹ��� ���̵�: "+o.CustomerID);
		System.out.println("�ֹ� ��¥: "+o.date);
		System.out.println("�ֹ��� �̸�: "+o.customerName);
		System.out.println("�ֹ� ��ǳ ��ȣ: "+o.giftNum);
		System.out.println("��� �ּ�: "+o.address);
	}

}
