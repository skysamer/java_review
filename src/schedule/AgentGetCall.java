package schedule;

public class AgentGetCall implements Schedule{

	@Override
	public void getNextCall() {
		System.out.println("������ ���� ��ȭ ��û");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("������ ��ȭ����� ���������ϴ�.");
	}

}
