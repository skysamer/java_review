package classPart;

public class FunctionTest {

	public static void main(String[] args) {
		int num1=10;
		int num2=20;
		
		System.out.println("���ϱ�: "+add(num1, num2));
		System.out.println("����: "+con(num1, num2));
		System.out.println("��: "+multiple(num1, num2));
		System.out.println("������: "+divide(num1, num2));
		
	}
	
	public static int add(int a, int b) {
		int result =a+b;
		return result;
	}
	
	public static int con(int a, int b) {
		int result =a-b;
		return result;
	}
	
	public static int multiple(int a, int b) {
		int result =a*b;
		return result;
	}
	
	public static int divide(int a, int b) {
		int result =a/b;
		return result;
	}

}
