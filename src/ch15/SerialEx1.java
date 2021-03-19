package ch15;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class SerialEx1 {
	public static void main(String[] args) {
		try {
			String fileName="Userinfo2.ser";
			FileOutputStream fos=new FileOutputStream(fileName);
			BufferedOutputStream bos=new BufferedOutputStream(fos);
			
			ObjectOutputStream out=new ObjectOutputStream(bos);
			
			UserInfo2 u1=new UserInfo2("CMan", "1234", 30);
			UserInfo2 u2=new UserInfo2("CWoman", "4321", 26);
			
			ArrayList<UserInfo2> list=new ArrayList<UserInfo2>();
			list.add(u1);
			list.add(u2);
			
			// 객체 직렬화
			out.writeObject(u1);
			out.writeObject(u2);
			out.writeObject(list);
			out.close();
			System.out.println("직렬화가 잘 끝났습니다.");
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

}
