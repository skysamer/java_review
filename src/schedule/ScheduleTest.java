package schedule;

import java.io.IOException;

public class ScheduleTest {

	public static void main(String[] args) throws IOException{
		System.out.println("��ȭ ��� �Ҵ� ����� �����ϼ���.");
		System.out.println("R: �Ѹ� ���ʷ� �Ҵ�");
		System.out.println("L: ���� �ְų� ��Ⱑ ���� ���� �������� �Ҵ�");
		System.out.println("A: ������ ���� ��ȭ����� ������");
		System.out.println("P: �켱������ ���� �� ���� �Ҵ�");
		
		int ch=System.in.read();
		Schedule s=null;
		
		if(ch=='R'||ch=='r') {
			s=new RoundRobin();
		}
		else if(ch=='L'||ch=='l') {
			s=new LeastJob();
		}
		else if(ch=='P'||ch=='p') {
			s=new PriorityAllocation();
		}
		else if(ch=='A'||ch=='a') {
			s=new AgentGetCall();
		}
		else {
			System.out.println("�������� �ʴ� ����Դϴ�.");
			return;
		}
		s.getNextCall();
		s.sendCallToAgent();
	}

}
