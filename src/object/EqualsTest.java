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
		Student lee=new Student(100, "이상원");
		Student lee2=lee;
		Student sang=new Student(100, "이상원");
		
		if(lee==lee2) 
			System.out.println("lee와 lee2의 주소는 같습니다.");
		else
			System.out.println("lee와 lee2의 주소는 다릅니다.");
		
		if(lee.equals(lee2))
			System.out.println("lee와 lee2는 동일합니다.");
		else
			System.out.println("lee와 lee2는 동일하지 않습니다.");
		
		if(lee==sang) 
			System.out.println("lee와 sang의 주소는 같습니다.");
		else
			System.out.println("lee와 sang의 주소는 다릅니다.");
		
		if(lee.equals(sang))
			System.out.println("lee와 sang는 동일합니다.");
		else
			System.out.println("lee와 sang는 동일하지 않습니다.");
		
		System.out.println("========================================");
		
		System.out.println("lee의 hashcode: "+lee.hashCode());
		System.out.println("sang의 hashcode: "+sang.hashCode());
		
		System.out.println("lee의 실제 주소값: "+System.identityHashCode(lee));
		System.out.println("sang의 실제 주소값: "+System.identityHashCode(sang));

	}

}
