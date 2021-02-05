package template;

public class AICar extends Car{

	@Override
	public void drive() {
		System.out.println("자율주행");
		System.out.println("자동 방향전환");
	}

	@Override
	public void stop() {
		System.out.println("자동 멈춤");
	}

	@Override
	public void wiper() {
		System.out.println("사람이 빠르기를 조절");
	}

}
