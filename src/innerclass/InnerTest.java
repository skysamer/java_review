package innerclass;

class OutClass{
	private int num=10;
	private static int sNum=20;
	
	static class InStaticClass{
		int inNum=100;
		static int sInNum=200;
		
		void inTest() {
			System.out.println("InStaticClass inNum= "+inNum+"(���� Ŭ������ �ν��Ͻ� ���� ���)");
			System.out.println("InStaticClass sInNum= "+sInNum+"(���� Ŭ������ ���� ���� ���)");
			System.out.println("OutClass sNum= "+sNum+"(�ܺ� Ŭ������ ���� ���� ���)");
		}
		
		static void sTest() {
			System.out.println("OutClass sNum= "+sNum+"(�ܺ� Ŭ������ ���� ���� ���)");
			System.out.println("InStaticClass sInNum= "+sInNum+"(���� Ŭ������ ���� ���� ���)");
		}
	}
	
	
	
	
	
	
	private InClass inClass;
	
	public OutClass() {
		inClass=new InClass();
	}
	
	class InClass{
		int inNum=100;
		
		void inTest() {
			System.out.println("OutClass num= "+num+"(�ܺ� Ŭ������ �ν��Ͻ� ����)");
			System.out.println("OutClass sNum= "+sNum+"(�ܺ� Ŭ������ ���� ����)");
			}
		}
	public void usingClass() {
		inClass.inTest();
	}
}

public class InnerTest {
	public static void main(String[] args) {
		OutClass out=new OutClass();
		System.out.println("�ܺ� Ŭ������ �̿��Ͽ� ���� Ŭ���� ��� ȣ��");
		out.usingClass();
		
		OutClass.InStaticClass sInClass=new OutClass.InStaticClass();
		System.out.println("���� ���� Ŭ�����Ϲ� �޼��� ȣ��");
		sInClass.inTest();
		System.out.println();
		System.out.println("���� ���� Ŭ���� ���� �޼��� ȣ��");
		OutClass.InStaticClass.sTest();

	}

}
