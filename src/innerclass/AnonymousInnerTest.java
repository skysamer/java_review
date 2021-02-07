package innerclass;

class Outer2{
	Runnable getrunnable(int i) {
		int num=199;
		
		return new Runnable() {
			
			@Override
			public void run() {
				System.out.println(i);
				System.out.println(num);
			}
		};
	}
	
	Runnable runner=new Runnable() {
		 @Override
		 public void run() {
			 System.out.println("Runnable이 구현된 익명 클래스 변수");
		 }
	};
}

public class AnonymousInnerTest {
	public static void main(String[] args) {
		Outer2 out=new Outer2();
		Runnable runnable=out.getrunnable(10);
		runnable.run();
		out.runner.run();

	}

}
