package exception;


public class IDFormatTest {
	private String userID;
	private String pw;
	

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) throws IDFormatException{
		if(userID==null) {
			throw new IDFormatException("���̵�� null�� �� �����ϴ�.");
		}
		else if(userID.length()<8||userID.length()>20) {
			throw new IDFormatException("���̵�� 8�� �̻� 20�� ���Ϸ� ������.");
		}
		this.userID = userID;
	}
	
	public String getPw() {
		return pw;
	}

	
	public void setPw(String pw) throws PasswordException{
		if(pw==null) {
			throw new PasswordException("��й�ȣ�� null�� �� �����ϴ�.");
		}
		else if(pw.matches("[a-zA-Z]+")) {
			throw new PasswordException("��й�ȣ�� ���ڳ� ��ȣ�� �����ؾ��մϴ�.");
		}
		else if(pw.length()<6) {
			throw new PasswordException("��й�ȣ�� 6�� �̻��̾�� �մϴ�.");
		}
		this.pw = pw;
	}

	public static void main(String[] args) {
		IDFormatTest test=new IDFormatTest();
		
		String userID=null;
		try {
			test.setUserID(userID);
		}catch (IDFormatException e) {
			System.out.println(e.getMessage());
		}
		
		userID="1234567";
		try {
			test.setUserID(userID);
		}catch (IDFormatException e) {
			System.out.println(e.getMessage());
		}
		
		String pw="1234";
		
		try {
			test.setPw(pw);
		}catch (PasswordException e) {
			System.out.println(e.getMessage());
		}

	}

}
