package ch8;

public class NewExceptionTest {

	public static void main(String[] args) {
		try {
			startInstall();
			copyFiles();
		}catch (SpaceException e) {
			System.out.println("�����޼���: "+e.getMessage());
			e.printStackTrace();
			System.out.println("������ Ȯ���ϼ���!");
		}catch (MemoryException me) {
			System.out.println("�����޼���: "+me.getMessage());
			me.printStackTrace();
			System.gc();
			System.out.println("�ٽ� ��ġ�� �õ��ϼ���!");
		}finally {
			deletetempFiles();
		}

	}
	
	static void startInstall() throws SpaceException, MemoryException{
		if(!enoughSpace())
			throw new SpaceException("��ġ ���� ����!");
		if(!enoughMemory())
			throw new MemoryException("�޸� ����!");
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
