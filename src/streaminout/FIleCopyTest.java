package streaminout;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FIleCopyTest {
	public static void main(String[] args) {
		long second=0;
		try(FileInputStream fis=new FileInputStream("a.zip");
		FileOutputStream fos=new FileOutputStream("copy.zip")){
			second=System.currentTimeMillis();
			int i;
			while((i=fis.read())!=-1) {
				fos.write(i);
			}
			second=System.currentTimeMillis()-second;
		}catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("복사 시간: "+second);		

	}

}
