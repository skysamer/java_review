package object;

class Student{
	int studentID;
	String studentName;
	
	public Student(int studentID, String studentName) {
		this.studentID=studentID;
		this.studentName=studentName;
	}
	
	public String toString() {
		return studentID+", "+studentName;
	}


	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student std=(Student)obj;
			if(this.studentID==std.studentID)
				return true;
			else return false;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return studentID;
	}
	
	
}

public class EqualsTest {
	public static void main(String[] args) {
		Student lee=new Student(100, "�̻��");
		Student lee2=lee;
		Student sang=new Student(100, "�̻��");
		
		if(lee==lee2) 
			System.out.println("lee�� lee2�� �ּҴ� �����ϴ�.");
		else
			System.out.println("lee�� lee2�� �ּҴ� �ٸ��ϴ�.");
		
		if(lee.equals(lee2))
			System.out.println("lee�� lee2�� �����մϴ�.");
		else
			System.out.println("lee�� lee2�� �������� �ʽ��ϴ�.");
		
		if(lee==sang) 
			System.out.println("lee�� sang�� �ּҴ� �����ϴ�.");
		else
			System.out.println("lee�� sang�� �ּҴ� �ٸ��ϴ�.");
		
		if(lee.equals(sang))
			System.out.println("lee�� sang�� �����մϴ�.");
		else
			System.out.println("lee�� sang�� �������� �ʽ��ϴ�.");
		
		System.out.println("========================================");
		
		System.out.println("lee�� hashcode: "+lee.hashCode());
		System.out.println("sang�� hashcode: "+sang.hashCode());
		
		System.out.println("lee�� ���� �ּҰ�: "+System.identityHashCode(lee));
		System.out.println("sang�� ���� �ּҰ�: "+System.identityHashCode(sang));

	}

}
