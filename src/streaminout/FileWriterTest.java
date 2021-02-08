package streaminout;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	public static void main(String[] args) {
		try(FileWriter wr=new FileWriter("writer.txt")){
			wr.write('A');
			char buf[]= {'B', 'C', 'D', 'E', 'F', 'G'};
			
			wr.write(buf);
			wr.write("안녕하세요. 잘 써지네요.");
			wr.write(buf, 1, 2);
			wr.write("65");
		}catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("출력이 완료되었습니다.");

	}

}
