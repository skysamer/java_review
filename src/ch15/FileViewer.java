package ch15;

import java.io.FileInputStream;
import java.io.IOException;

public class FileViewer {
	public static void main(String[] args) throws IOException{
		FileInputStream fis=new FileInputStream(args[0]);
		int data=0;
		
		while((data=fis.read())!=-1) {
			char c=(char)data;
			System.out.println(c);
		}

	}

}

//  C:\Users\이상민\Desktop\workspace\java_review\src\ch15\FileViewer.java
