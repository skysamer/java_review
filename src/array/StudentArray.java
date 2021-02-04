package array;

public class StudentArray {

	public static void main(String[] args) {
		Student[] s=new Student[3];
		
		s[0]=new Student(1001, "James");
		s[1]=new Student(1002, "Tomas");
		s[2]=new Student(1003, "Edward");
		
		for(int i=0; i<s.length; i++) {
			s[i].showStudentInfo();
		}

	}

}
