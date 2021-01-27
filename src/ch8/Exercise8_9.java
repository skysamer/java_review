package ch8;

public class Exercise8_9 {

	public static void main(String[] args) throws Exception{
		throw new UnsupportedFunctionException("지원하지 않는 기능입니다.", 100);

	}

}

class UnsupportedFunctionException extends RuntimeException{
	
	UnsupportedFunctionException(String msg) {
		this(msg, 100);
	}
	
	UnsupportedFunctionException(String msg, int errCode) {
		super(msg);
		ERR_CODE = errCode;
	}

	private final int ERR_CODE;

	public int getERR_CODE() {
		return ERR_CODE;
	}

	@Override
	public String getMessage() {
		return "["+getERR_CODE()+"]"+super.getMessage();
	}
	
	
	
}
