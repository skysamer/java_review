package streaminout;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class wlrlaxjf {

	public static void main(String[] args) {
		try(FileOutputStream fos=new FileOutputStream("a.txt");
				OutputStreamWriter osw=new OutputStreamWriter(fos)){
			osw.write("서버측 렌더링 동기화 필요");
		}catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("출력 완료");
	}
}
