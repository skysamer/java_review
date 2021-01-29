package ch9;

public class Exercise9_6 {
	public static String  fileZero(String src, int length) {
		if(src==null||src.length()==length)
			return src;
		else if(length<=0)
			return new String("");
		else if(src.length()>length) {
			String s=src.substring(0, length);
			return s;
		}
		
		char[] ch=new char[length];
		for(int i=0; i<length; i++)
			ch[i]='0';
		System.arraycopy(src.toCharArray(), 0, ch, src.length(), src.length());
		String s=new String(ch);
		return s;
	}

	public static void main(String[] args) {
		String src="12345";
		System.out.println(fileZero(src, 10));
		System.out.println(fileZero(src, -1));
		System.out.println(fileZero(src, 3));

	}

}
