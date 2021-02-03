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
		
		o.address="서울시 영등포구 여의도동 20번지";
		o.CustomerID="abc123";
		o.customerName="홍길순";
		o.date="2018년 3월 12일";
		o.giftNum="PD0345-12";
		o.orderNum="201803120001";
		
		System.out.println("주문 번호: "+o.orderNum);
		System.out.println("주문자 아이디: "+o.CustomerID);
		System.out.println("주문 날짜: "+o.date);
		System.out.println("주문자 이름: "+o.customerName);
		System.out.println("주문 상풍 번호: "+o.giftNum);
		System.out.println("배송 주소: "+o.address);
	}

}
