package streaminout;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class wlrlaxjf {

	public static void main(String[] args) {
		try(FileOutputStream fos=new FileOutputStream("a.txt");
				OutputStreamWriter osw=new OutputStreamWriter(fos)){
			osw.write("������ ������ ����ȭ �ʿ�");
		}catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("��� �Ϸ�");
	}
}
