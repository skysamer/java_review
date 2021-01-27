package ch8;

import java.io.File;

public class ExceptionEx16 {

	public static void main(String[] args) {
		try {
			File f=createFile(args[0]);
			System.out.println(f.getName()+"������ �����Ǿ����ϴ�.");
		}catch (Exception e) {
			System.out.println("�ٽ� �Է����ֽñ� �ٶ��ϴ�.");
		}
	}
	
	static File createFile(String fileName)throws Exception{
		if(fileName==null||fileName.equals(""))
			throw new Exception("�����̸��� ��ȿ���� �ʽ��ϴ�.");
		File f=new File(fileName);
		f.createNewFile();
		return f;
	}

}
