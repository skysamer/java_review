package array;

import java.util.ArrayList;

public class StudentArrayList {

	public static void main(String[] args) {
		ArrayList<Student> arl=new ArrayList<Student>();
		
		arl.add(new Student(1001, "James"));
		arl.add(new Student(1002, "Tomas"));
		arl.add(new Student(1003, "Edward"));
		
		for(Student s:arl) {
			s.showStudentInfo();
		}

	}

}
