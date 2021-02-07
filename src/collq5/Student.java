package collq5;

public class Student {
	int studentId;
	String studentName;
	
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}

	@Override
	public String toString() {
		return studentId +": "+ studentName;
	}

	@Override
	public int hashCode() {
		return studentId;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student s=(Student)obj;
			if(this.studentId==s.studentId)
				return true;
			else return false;
		}
		return false;
	}
	
	
	
	
	
	
	
	

}
