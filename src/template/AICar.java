package template;

public class AICar extends Car{

	@Override
	public void drive() {
		System.out.println("��������");
		System.out.println("�ڵ� ������ȯ");
	}

	@Override
	public void stop() {
		System.out.println("�ڵ� ����");
	}

	@Override
	public void wiper() {
		System.out.println("����� �����⸦ ����");
	}

}
