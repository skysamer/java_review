package template;

public class ManualCar extends Car{

	@Override
	public void drive() {
		System.out.println("����� ����");
		System.out.println("����� �ڵ� ����");
	}

	@Override
	public void stop() {
		System.out.println("�극��ũ�� ����");
	}

	@Override
	public void wiper() {
		System.out.println("�����Ⱑ �ڵ� ����");
	}

}
