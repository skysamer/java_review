package ch8;

public class NewExceptionTest {

	public static void main(String[] args) {
		try {
			startInstall();
			copyFiles();
		}catch (SpaceException e) {
			System.out.println("에러메세지: "+e.getMessage());
			e.printStackTrace();
			System.out.println("공간을 확보하세요!");
		}catch (MemoryException me) {
			System.out.println("에러메세지: "+me.getMessage());
			me.printStackTrace();
			System.gc();
			System.out.println("다시 설치를 시도하세요!");
		}finally {
			deletetempFiles();
		}

	}
	
	static void startInstall() throws SpaceException, MemoryException{
		if(!enoughSpace())
			throw new SpaceException("설치 공간 부족!");
		if(!enoughMemory())
			throw new MemoryException("메모리 부족!");
	}
	
	static void copyFiles() {}
	static void deletetempFiles() {}
	
	static boolean enoughSpace() {
		return false;
	}
	
	static boolean enoughMemory() {
		return true;
	}
}

class SpaceException extends Exception{
	public SpaceException(String msg) {
		super(msg);
	}
}

class MemoryException extends Exception{
	public MemoryException(String msg) {
		super(msg);
	}
}
