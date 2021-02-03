package staticEx;

public class Student3 {
	private static int serialNum=1000;
	public int studentID;
	public String studentName;
	public int grade;
	public String address;
	private static int cardNum=serialNum+100;
	
	
	
	public Student3() {
		serialNum++;
		cardNum++;
		studentID=serialNum;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public static int getSerialNum() {
		return serialNum;
	}
	public static void setSerialNum(int serialNum) {
		Student3.serialNum = serialNum;
	}
	public static int getCardNum() {
		return cardNum;
	}
	public static void setCardNum(int cardNum) {
		Student3.cardNum = cardNum;
	}
	
	

}
