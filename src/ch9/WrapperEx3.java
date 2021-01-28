package ch9;

public class WrapperEx3 {

	public static void main(String[] args) {
		int i=10;
		
		Integer intg=i;  //기본형을 참조형으로
		Object obj=i;
		
		Long lng=100L;
		
		int i2=intg+10; //참조형+기본형
		long l=intg+lng;  //참조형+참조형
		
		Integer intg2=new Integer(20);
		int i3=intg2; //참조형을 기본형으로
		
		Integer intg3=intg2+i3;

	}

}
