package ch9;

public class Eercise9_10 {
	public static String format(String str, int length, int alignment) {
		if(length<str.length())
			return str.substring(0, length);
		else {
			char[] ch=new char[length];
			for(int i=0; i<ch.length; i++) {
				ch[i]=' ';
			}
			System.arraycopy(str.toCharArray(), 0, ch, alignment, str.length());
			return new String(ch);
		}
	}

	public static void main(String[] args) {
		String str="°¡³ª´Ù";
		
		System.out.println(format(str, 7, 0));
		System.out.println(format(str, 7, 1));
		System.out.println(format(str, 7, 2));
		

	}

}
