package schedule;

public class PriorityAllocation implements Schedule{

	@Override
	public void getNextCall() {
		System.out.println("�� ����� ���� ���� ��ȭ�� ���� �����ɴϴ�.");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("���� ��ų���� ���� �������� �켱������ ���");
	}

}
