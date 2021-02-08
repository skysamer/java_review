package streaminout;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderTest {
	public static void main(String[] args) {
		try(InputStreamReader jsr=new InputStreamReader(new FileInputStream("reader.txt"))){
			int i;
			while((i=jsr.read())!=-1) {
				System.out.print((char)i);
			}
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

}
