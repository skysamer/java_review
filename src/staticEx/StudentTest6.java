package staticEx;

public class StudentTest6 {

	public static void main(String[] args) {
		Student3 studentLee=new Student3();
		studentLee.setStudentName("������");
		System.out.println(Student3.getSerialNum());
		System.out.println(studentLee.studentName+" ī���ȣ: "+Student3.getCardNum());
		
		Student3 studentSon=new Student3();
		studentSon.setStudentName("�ռ���");
		System.out.println(Student3.getSerialNum());
		System.out.println(studentSon.studentName+" ī���ȣ: "+Student3.getCardNum());


	}

}
