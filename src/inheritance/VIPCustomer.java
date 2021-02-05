package inheritance;

public class VIPCustomer extends Customer{
	private int agentID;
	double saleRatio;
	
	public int getAgentID() {
		return agentID;
	}

	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		this.agentID = agentID;
		customerGrade="VIP";
		bonusRatio=0.05;
		saleRatio=0.1;
		System.out.println("VIPCustomer(int, Strung) ������ ȣ��");
	}
	
	@Override
	public int calcPrice(int price) {
		bonusPoint+=price*bonusRatio;
		return price-(int)(price*saleRatio);
	}

}
