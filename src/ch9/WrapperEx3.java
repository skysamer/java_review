package ch9;

public class WrapperEx3 {

	public static void main(String[] args) {
		int i=10;
		
		Integer intg=i;  //�⺻���� ����������
		Object obj=i;
		
		Long lng=100L;
		
		int i2=intg+10; //������+�⺻��
		long l=intg+lng;  //������+������
		
		Integer intg2=new Integer(20);
		int i3=intg2; //�������� �⺻������
		
		Integer intg3=intg2+i3;

	}

}
