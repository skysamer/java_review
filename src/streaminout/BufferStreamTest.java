package streaminout;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferStreamTest {
	public static void main(String[] args) {
		long second=0;
		try(FileInputStream fis=new FileInputStream("a.zip");
		FileOutputStream fos=new FileOutputStream("copy.zip");
		BufferedInputStream bis=new BufferedInputStream(fis);
		BufferedOutputStream bos=new BufferedOutputStream(fos)){
			second=System.currentTimeMillis();
			int i;
			while((i=bis.read())!=-1) {
				bos.write(i);
			}
			second=System.currentTimeMillis()-second;
		}catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("복사 시간: "+second);

	}

}
