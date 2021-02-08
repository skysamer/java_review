package streaminout;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable{
	private static final long serialVersionUID = 1904633290537618522L;
	String name;
	transient String job;
	
	public Person() {}

	public Person(String name, String job) {
		this.name = name;
		this.job = job;
	}
	
	public String toString() {
		return name+", "+job;
	}
}

public class SerializationTest {
	public static void main(String[] args) throws ClassNotFoundException{
		Person ahn=new Person("안재용", "대표이사");
		Person kim=new Person("김철수", "상무이사");
		
		try(FileOutputStream fos=new FileOutputStream("serial.out");
				ObjectOutputStream oos=new ObjectOutputStream(fos)){
			oos.writeObject(ahn);  // 객체의 값을 파일에 쓴다.(직렬화)
			oos.writeObject(kim);
		}catch (IOException e) {
			e.printStackTrace();
		}
		try(FileInputStream fis=new FileInputStream("serial.out");
				ObjectInputStream ois=new ObjectInputStream(fis)){
			Person p1=(Person)ois.readObject();
			Person p2=(Person)ois.readObject();  //인스턴스의 값을 파일에서 읽어 들인다.(역직렬화)
			
			System.out.println(p1);
			System.out.println(p2);
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
