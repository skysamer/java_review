package inheritance;

public class CustomerTest1 {

	public static void main(String[] args) {
		Customer lee=new Customer(10010, "이순신");
		lee.bonusPoint=1000;
		System.out.println(lee.showCustomerInfo());
		
		VIPCustomer kim=new VIPCustomer(10020, "김유신", 99);
		kim.bonusPoint=10000;
		System.out.println(kim.showCustomerInfo());

	}

}
