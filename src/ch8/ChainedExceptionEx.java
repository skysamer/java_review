package ch8;

public class ChainedExceptionEx {

	public static void main(String[] args) {
		try {
			install();
		}catch (InstallException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	static void install() throws InstallException{
		try {
			startInstall();
			copyFiles();
		}catch (SpaceException se) {
			InstallException ie=new InstallException("��ġ �� ���ܹ߻�");
			ie.initCause(se);
			throw ie;
		}catch (MemoryException me) {
			InstallException ie=new InstallException("��ġ �� ���ܹ߻�");
			ie.initCause(me);
			throw ie;
		}finally {
			deleteTempFiles();
		}
	}
	
	static void startInstall() throws SpaceException, MemoryException{
		if(!enoughSpace())
			throw new SpaceException("��ġ ���� ����!");
		if(!enoughMemory()) {
			throw new MemoryException("�޸� ����!");
		}
	}
	
	static void copyFiles() {}
	static void deleteTempFiles() {}
	
	static boolean enoughSpace() {
		return false;
	}
	
	static boolean enoughMemory(){
		return true;
	}

}

class InstallException extends Exception{
	public InstallException(String msg) {
		super(msg);
	}
}
