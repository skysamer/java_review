package hiding;


public class Student {
	int studentID;
	private String studentName;
	int grade;
	public String address;
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String studentName) {
		this.studentName=studentName;
	}

	@Override
	public String toString() {
		return studentID + ", " + studentName;
	}
	
	

}
