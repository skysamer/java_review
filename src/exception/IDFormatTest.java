package exception;


public class IDFormatTest {
	private String userID;
	private String pw;
	

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) throws IDFormatException{
		if(userID==null) {
			throw new IDFormatException("아이디는 null일 수 없습니다.");
		}
		else if(userID.length()<8||userID.length()>20) {
			throw new IDFormatException("아이디는 8자 이상 20자 이하로 쓰세요.");
		}
		this.userID = userID;
	}
	
	public String getPw() {
		return pw;
	}

	
	public void setPw(String pw) throws PasswordException{
		if(pw==null) {
			throw new PasswordException("비밀번호는 null일 수 없습니다.");
		}
		else if(pw.matches("[a-zA-Z]+")) {
			throw new PasswordException("비밀번호는 숫자나 기호를 포함해야합니다.");
		}
		else if(pw.length()<6) {
			throw new PasswordException("비밀번호는 6자 이상이어야 합니다.");
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
