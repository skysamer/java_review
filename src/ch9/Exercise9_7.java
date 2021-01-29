package ch9;

public class Exercise9_7 {
	public static boolean contain(String src, String target) {
		int idx=src.indexOf(target, 0);
		if(idx==-1)
			return false;
		else
			return true;
	}

	public static void main(String[] args) {
		System.out.println(contain("12345", "23"));
		System.out.println(contain("12345", "67"));
		

	}

}
