package collection.treeset;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		TreeSet<String> tree=new TreeSet<String>();
		
		tree.add("ȫ�浿");
		tree.add("������");
		tree.add("�̼���");
		
		for(String str:tree) {
			System.out.println(str);
		}

	}

}
