package arraylist;

public class Test {

	public static void main(String[] args) {
		Student lee=new Student(1001, "Lee");
		lee.addSubject("����", 100);
		lee.addSubject("����", 50);
		
		Student kim=new Student(1002, "Kim");
		kim.addSubject("����", 70);
		kim.addSubject("����", 85);
		kim.addSubject("����", 100);
		
		lee.showStudentInfo();
		System.out.println("==================");
		kim.showStudentInfo();

	}

}
